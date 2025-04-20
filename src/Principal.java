import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("=================================");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
        System.out.println("Su saldo disponible es: " + saldo + "$");
        System.out.println("\n================================="); // \n es un salto de linea

        String menu = """
                *********************************************************
                Sea bienvenido/(a) al conversor de Monedas=]
                
                1 - Dólar =>> Peso argentino
                2 - Peso argentino =>> Dólar
                3 - Dólar =>> Real brasileño
                4 - Real brasileño =>> Dólar
                5 - Dólar =>> Peso colombiano
                6 - Peso colombiano =>> Dólar
                7 - Dólar =>> Peso chileno
                8 - Peso chileno - Dólar
                9 - Salir
                
                [Elija una opción válida]
                *********************************************************
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion !=9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;

                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo -valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    break;

                case 3:
                    System.out.println("¿Cuál es el valor a depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;

                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;

                default:
                    System.out.println("Opción no valida, vuelva a elegir una opción");

            }

        }
    }
}

