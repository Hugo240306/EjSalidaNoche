import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos a tomar el aire. Bienvenido");

        double nivelAlcohol = 0.0;
        double precioChupito = 3;
        double precioCanha = 1.8;
        double precioCombinado = 8;

        double nivelChupito = 0.25;
        double nivelCanha = 0.1;
        double nivelCombinado = 0.4;

        System.out.println("Nivel de alcohol inicial: " + nivelAlcohol);
        System.out.println("Precio chupito: " + precioChupito);
        System.out.println("Precio caña: " + precioCanha);
        System.out.println("Precio combinado: " + precioCombinado);
        System.out.println("Nivel chupito: " + nivelChupito);
        System.out.println("Nivel caña: " + nivelCanha);
        System.out.println("Nivel combinado: " + nivelCombinado);

        Scanner sc = new Scanner(System.in);
// el system.in lo que hace es recoger la informacion escrita por el usuario
        System.out.print("Introduce el nombre del cliente: ");
        String nombre = sc.nextLine();
// y el String nombre = sc.nextLine(); lo que hace es permitir que se cambie el nombre cada vez que se inicia
        System.out.print("Introduce la edad del cliente: ");
        int edad = sc.nextInt();
// int es para numeros enteros
        if (edad < 18) {
            System.out.println("No puedes entrar. Eres menor de edad.");

        System.out.print("Introduce la cantidad de dinero que tendrá el cliente: ");
        double dinero = sc.nextDouble();

        System.out.println("--- Datos del cliente ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dinero: " + dinero + " €");

        System.out.println("El cliente de nombre " + nombre +
                " con edad " + edad +
                " tiene " + dinero + " euros.");



            return;
        } else if (nivelAlcohol > 1.2) {
            System.out.println("No puedes entrar. No estás en condiciones (alcohol > 1.2).");
            return;
        } else {
            System.out.println("Bienvenido a la discoteca, " + nombre);
        }

    }

}
