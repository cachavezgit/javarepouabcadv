package mx.uabc.cursojava.annotations;


public class PruebaAnotacion {

    @DemoAnotacion(autor = "Carlos Ivan Chavez Fuentes", descripcion = "Prueba de las anotaciones")
    private int datoNumerico=10;

    @DemoAnotacion(autor = "Carlos Ivan Chavez Fuentes", descripcion = "Prueba de las anotaciones")
    public double suma(double a, double b){
        return a+b;
    }

}
