public abstract class Empleado {
    private String nombre;
    private String id;
    private double salarioBase;

    public Empleado(){
        nombre = "";
        id = "";
        salarioBase = 0.0;
    }

    public Empleado(String nombre, String id, double salarioBase){
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String mostrarInfo(){
        return String.format("Nombre: %s\tId: %s\tSalario total: %.2f", getNombre(), getId(), calcularSalario());
    }
}
