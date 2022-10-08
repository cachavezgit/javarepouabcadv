package mx.uabc.cursojava.annotations;

@JsonSerializable()
public class Empleado {

    @JsonElement
    private int clave;

    @JsonElement
    private String nombre;

    @JsonElement
    private String apellidos;
    @JsonElement
    private double sueldo;

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(int clave, String nombre, String apellidos, double sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
    }

    @Init
    private void initNames() {
        this.nombre=this.nombre.substring(0,1).toUpperCase()+this.nombre.substring(1);
        this.apellidos=this.apellidos.substring(0,1).toUpperCase()+this.apellidos.substring(1);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
