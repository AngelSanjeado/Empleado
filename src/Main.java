import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Empleado empleado1 = new EmpleadoTiempoCompleto("Omar", "S24016731", 50000, 10, "Desarrollo");
        Empleado empleado2 = new EmpleadoFreelance("Mar", "S24016623", 155, 50);
        Empleado empleado3 = new EmpleadoTiempoCompleto("Sanji", "S24016726", 50000, 8, "Desarrollo");
        Empleado empleado4 = new EmpleadoFreelance("Pamela", "S24016702", 160, 45);

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);

        System.out.println("-------------------------------------------");
        System.out.printf("| %-10s | %-9s | %-14s |\n", "Nombre", "ID", "Salario total");
        System.out.println("-------------------------------------------");
        for (Empleado e: empleados){
            System.out.println(e.mostrarInfo());
        }
        System.out.println("-------------------------------------------");
    }
}
