import java.util.Scanner;

public class PrecioTaxi {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingresa el tiempo de espera en tráfico en minutos: ");
        int tiempoEspera = scanner.nextInt();

        double tarifaBase = 4000; 
        double valorKilometro = 900; 
        double valorMinuto = 150; 

        double precioDistancia = distancia * valorKilometro;
        double precioEspera = tiempoEspera * valorMinuto;
        double precioTotal = tarifaBase + precioDistancia + precioEspera;

        System.out.println("Precio del viaje: $" + String.format("%.2f", precioTotal));

        scanner.close();
    }
}
