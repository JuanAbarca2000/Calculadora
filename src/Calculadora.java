
import java.util.Scanner;  // Lo utilizo para poder imprimo en la consola los souts ingresados en mi sintaxis

public class Calculadora {  // Creo la clase Calculadora
    public static void main(String[] args) {  // Creo el Methodo Main para ejecutar el programa
        Scanner scanner = new Scanner(System.in);  // Creo un objeto Scanner con el que podre vizualizar los datos que ingrese

        System.out.println("Ingrese el primer número: "); // Imprimo el primer mensaje en la consola
        double numero1 = scanner.nextDouble(); // inicializo el primero numero que sera ingresado el cual se verà en la consola por el scanner

        System.out.println("Ingrese el segundo número: "); // Lo mismo que el primer mensaje, pero para el segundo nùmero
        double numero2 = scanner.nextDouble(); // lo inicializo igual que el primer nùmero, pero para el segundo nùmero

        System.out.println("Ingrese la operación a realizar ");  // imprimo el primer mensaje para seleccionar una opciòn.
        System.out.println("Selecciona una opción:"); // imprimo el segundo mensaje para seleccionar una opciòn y luego las opciones que seleccionare.
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = scanner.nextInt(); // inicializo la variable opcion para que el usuario pueda seleccionar una opciòn
        double resultado = 0; // LE asigno el valor 0 a la variable resultado

        switch (opcion) { // Switch es una estructura que se compara con las opciones que se ingresan
            case 1:
                resultado = numero1 + numero2; // REALIZO LAS OPERACIONES DE SUMA RESTA MULTIPLICACION Y DIVISION CON LOS NÙMEROS INGRESAdos
                break; // break es para que se detenga la operaciòn.
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) { //Bucle if  para que si el numero es diferente a 0 se pueda realizar la operaciòn
                    resultado = numero1 / numero2;
                } else { // de lo contrario se imprime el mensaje de error
                    System.out.println("Error: No se puede dividir por cero. Ingrese un número diferente de 0");
                }
                break;


        }

        System.out.println("El resultado de la opcion " + " " + opcion + " es " + resultado); // imprimo el resultado de la operaciòn

        System.out.println("Quieres volver a realizar otra operación? (si/no)"); // Pregunta por si quiere volver a ejecutar el programa
        String respuesta = scanner.next(); // inicializo la variable respuesta para que el usuario pueda ingresar si o no
        if (respuesta.equalsIgnoreCase("si")) { // si el usuiario seleccion si se vuelve a ejecutar el programa
            main(args);
        } else { // de lo contrario se imprime el mensaje de gracias por usar la calculadora y finiliza el programa
            System.out.println("Gracias por usar la calculadora");


        }
    }
}



