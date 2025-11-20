public class EmpleadoFreelance extends Empleado implements Beneficiable {
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(){
        super();
        horasTrabajadas = 0;
        tarifaHora = 0.0;
    }

    public EmpleadoFreelance(String nombre, String id, int horasTrabajadas, double tarifaHora){
        super(nombre, id, horasTrabajadas * tarifaHora);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora){
        this.tarifaHora = tarifaHora;
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
        return (horasTrabajadas * tarifaHora) + calcularBonificacion();
    }

    @Override
    public double calcularBonificacion(){
        if (horasTrabajadas > 160){
            return getSalarioBase() * 0.05;
        }
        return 0;
    }

    @Override
    public double aplicarDescuentoSeguro() {
        return calcularSalario() * 0.03;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo();
    }
}
