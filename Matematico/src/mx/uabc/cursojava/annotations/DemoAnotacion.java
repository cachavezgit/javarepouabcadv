package mx.uabc.cursojava.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DemoAnotacion {
    public String autor() default "";
    public String descripcion() default "";
}
