import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las calificaciones
        System.out.print("Ingrese la calificación del primer examen: ");
        double cal1 = scanner.nextDouble();

        System.out.print("Ingrese la calificación del segundo examen: ");
        double cal2 = scanner.nextDouble();

        System.out.print("Ingrese la calificación del tercer examen: ");
        double cal3 = scanner.nextDouble();

        System.out.print("Ingrese la calificación del cuarto examen: ");
        double cal4 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (cal1 + cal2 + cal3 + cal4) / 4;

        // Imprimir el resultado
        System.out.println("El promedio es: " + promedio);
    }
}