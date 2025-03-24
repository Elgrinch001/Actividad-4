import java.util.Scanner;

public class PropinaRestaurante {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Ingresa el valor de la cuenta (incluyendo IVA): ");
        double valorCuenta = scanner.nextDouble();

   
        System.out.print("Ingresa el porcentaje de propina (10-15): ");
        double porcentajePropina = scanner.nextDouble();


        double valorPropina = (porcentajePropina / 100) * valorCuenta;


        double valorTotal = valorCuenta + valorPropina;


        System.out.println("Valor de la cuenta: $" + String.format("%.2f", valorCuenta));
        System.out.println("Porcentaje de propina: " + porcentajePropina + "%");
        System.out.println("Valor de la propina: $" + String.format("%.2f", valorPropina));
        System.out.println("Valor total a pagar: $" + String.format("%.2f", valorTotal));


        scanner.close();
    }
}
