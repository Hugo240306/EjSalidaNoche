import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos a tomar el aire. Bienvenido");

        double nivelAlcohol = 0.0;
        double precioChupito = 3;
        double precioCaña = 1.8;
        double precioCombinado = 8;

        double nivelChupito = 0.25;
        double nivelCaña = 0.1;
        double nivelCombinado = 0.4;

        System.out.println("Nivel de alcohol inicial: " + nivelAlcohol);
        System.out.println("Precio chupito: " + precioChupito);
        System.out.println("Precio caña: " + precioCaña);
        System.out.println("Precio combinado: " + precioCombinado);
        System.out.println("Nivel chupito: " + nivelChupito);
        System.out.println("Nivel caña: " + nivelCaña);
        System.out.println("Nivel combinado: " + nivelCombinado);

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la edad del cliente: ");
        int edad = sc.nextInt();

        System.out.print("Introduce la cantidad de dinero que tendrá el cliente: ");
        double dinero = sc.nextDouble();

        System.out.println("\n--- Datos del cliente ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dinero: " + dinero + " €");

        System.out.println("El cliente de nombre " + nombre +
                " con edad " + edad +
                " tiene " + dinero + " euros.");
    }

}
