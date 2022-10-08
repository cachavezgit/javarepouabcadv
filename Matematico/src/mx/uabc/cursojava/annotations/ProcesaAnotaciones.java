package mx.uabc.cursojava.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProcesaAnotaciones {
    public static void checkSerializableStatus(Object object) throws Exception{
        if (Objects.isNull(object)){
            throw new Exception("El objeto a serializar es nulo");
        }

        Class<?> clazz =object.getClass();
        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new Exception(String.format("La clase %s no es serializable", clazz.getName()));
        }
    }

    public static void initializeObject(Object object) throws Exception {
        Class<?> clazz =object.getClass();
        for (Method method:clazz.getDeclaredMethods()) {
            if(method.isAnnotationPresent(Init.class)) {
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }

    public static String generarSalidaJson(Object object) throws Exception {
        Class<?> clazz =object.getClass();
        Map<String, String> jsonElementsMap = new HashMap<>();
        for (Field field:clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)) {
                jsonElementsMap.put(field.getName(),field.get(object).toString());
            }
        }

        String cadena = jsonElementsMap.entrySet()
                .stream()
                .map(e->"\""+e.getKey()+"\":\""+e.getValue()+"\"")
                .collect(Collectors.joining(","));

        return "{" + cadena + "}";

    }

    public static void main(String[] args) throws  Exception {
        Empleado e1 = new Empleado(1, "wilson", "perez perez", 12390);
        EmpleadoNoSerializable e2 = new EmpleadoNoSerializable();

        checkSerializableStatus(e1);
        //checkSerializableStatus(e2);

        initializeObject(e1);
        initializeObject(e2);

        System.out.println(e1);

        System.out.println(generarSalidaJson(e1));
    }
}
