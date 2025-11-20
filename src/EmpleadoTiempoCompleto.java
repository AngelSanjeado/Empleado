public class EmpleadoTiempoCompleto extends Empleado implements Beneficiable{
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

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase();
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        super.setSalarioBase(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + calcularBonificacion();
    }

    @Override
    public double calcularBonificacion(){
        return super.getSalarioBase() * 0.10 * antiguedad;
    }

    @Override
    public double aplicarDescuentoSeguro() {
        return calcularSalario() * 0.05;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo();
    }
}
