public class EmpleadoTiempoCompleto extends Empleado{
    private int antiguedad;
    private String departamento;

    public EmpleadoTiempoCompleto(){
        super();
        antiguedad = 0;
        departamento = "";
    }

    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase, int antiguedad, String departamento){
        super(nombre, id, salarioBase);
        this.antiguedad = antiguedad;
        this.departamento = departamento;
    }

    public int getAntiguedad(){
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getId() {
        return super.getId();
    }

    public void setId(String id) {
        super.setId(id);
    }

    public double getSalarioBase() {
        return super.getSalarioBase();
    }

    public void setSalarioBase(double salarioBase) {
        super.setSalarioBase(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
