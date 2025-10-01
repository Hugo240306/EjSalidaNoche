import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos a tomar el aire. Bienvenido");

        double precioChupito = 3;
        double precioCanha = 1.8;
        double precioCombinado = 8;

        double nivelChupito = 0.25;
        double nivelCanha = 0.1;
        double nivelCombinado = 0.4;
int numeroConsumiciones = 0;
        System.out.println("Precio chupito: " + precioChupito);
        System.out.println("Precio caña: " + precioCanha);
        System.out.println("Precio combinado: " + precioCombinado);
        System.out.println("Nivel chupito: " + nivelChupito);
        System.out.println("Nivel caña: " + nivelCanha);
        System.out.println("Nivel combinado: " + nivelCombinado);

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la edad del cliente: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("No puedes entrar. Eres menor de edad.");
            return;
        }

        System.out.print("Introduce tu nivel de alcohol en sangre: ");
        double nivelAlcohol = sc.nextDouble();

        if (nivelAlcohol > 1.2) {
            System.out.println("No puedes entrar. Tu nivel de alcohol + nivelAlcohol es demasiado alto.");
            return;
        }

        System.out.println("Bienvenido a la discoteca, " + nombre);

        System.out.print("Introduce la cantidad de dinero que tendrá el cliente: ");
        double dinero = sc.nextDouble();

        System.out.println("--- Datos del cliente ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nivel de alcohol: " + nivelAlcohol);
        System.out.println("Dinero: " + dinero + " €");

        System.out.println("El cliente de nombre " + nombre +
                " con edad " + edad +
                " tiene " + dinero + " euros.");
        numeroConsumiciones++;
        System.out.println(" El cliente se va a casa luego de tomar " + numeroConsumiciones + " consumicones" );
    }
}