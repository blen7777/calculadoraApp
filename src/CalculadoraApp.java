import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {

        // Metodo para leer lo que ingresa el usaurio  por consola
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("***** Aplicacion Calculadora *****");
            System.out.println("***********************************");
            // Mostramos el menu
            mostrarMenu();
            try
            {
                var operacion = Integer.parseInt(consola.nextLine());

                if (operacion >= 1 && operacion <= 4) {
                    // Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);

                } else if (operacion == 5) {
                    System.out.println("Hasta pronto....");
                    break;
                } else System.out.println("Opcion erronea" + operacion);
                // Imprimimos un salto para que no se junte el menu
                System.out.println();
            } // fin try
            catch (NumberFormatException e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        } // fin while
    } // fin main

    private static void mostrarMenu(){
        // Creamos el menu
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Divicion
                    5. Salir
                    """);
        System.out.print("La operacion a realizar es? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        double resultado;
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona el valor del operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        // Revisar si la operacion ingresada esta dentro de las validas
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado suma: " + resultado);

            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado resta: " + resultado);

            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado multiplicacion: " + resultado);

            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado divicion: " + resultado);

            }

            default -> System.out.println("Opcion erronea" + operacion);
        }
    }

} // Fin clase
