/*
** Iris Aunnon Navarro
** Utiles de entrada/salida
*/

/* PAQUETE */
package Utiles;

/* LIBRERIA */
import java.util.Scanner;

public class ES {
    /* CONSTANTES */
    public static final Scanner sc = new Scanner(System.in);

    /* METODOS */

    /* PINTAR POR PANTALLA */
    public static void escribirMensaje(String texto) {
        System.out.print(texto);
    }

    public static void escribirMensajeError(String texto) {
        System.err.println("ERROR: " + texto);
    }

    /* VALIDACION DE ENTRADAS */
    public static int validarEntero(String texto) {
        ES.escribirMensaje(texto);

        while (!sc.hasNextInt()) {
            escribirMensajeError("El valor introducido no es un número entero.\nInténtalo de nuevo: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double validarDecimal(String texto) {
        ES.escribirMensaje(texto);

        while (!sc.hasNextDouble()) {
            escribirMensajeError("El valor introducido no es un número.\nInténtalo de nuevo: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static char leerChar(String texto, int indice) {
        ES.escribirMensaje(texto);
        return sc.next().charAt(indice);
    }

    public static String leerString(String texto) {
        ES.escribirMensaje(texto);
        return sc.nextLine();
    }

    /* SCANNER */

    // Limpiar buffer
    public static void limpiarBuffer() {
        sc.nextLine();
    }

    // Cerrar
    public static void cerrarScanner() {
        sc.close();
    }
}
