/*
** Iris Auñón Navarro
** Ejercicio UML-CodiFont2 - Clase Linea
*/

/* LIBRERIAS */
import java.util.Arrays;

public class Linea {
    /* ATRIBUTOS */

    private int id;
    private Punto[] puntos;
    private static int contador;

    /* CONSTRUCTORES */

    public Linea(int id) {
        this.id = id;
        this.puntos = new Punto[2];
        contador = 0;
    }

    /* GETTERS */

    public int getId() {
        return id;
    }

    public Punto[] getPuntos() {
        return puntos;
    }

    public static int getContador() {
        return contador;
    }

    /* SETTERS */

    public void setId(int id) {
        this.id = id;
    }

    public void setPuntos(Punto[] puntos) {
        this.puntos = puntos;
    }

    /* METODO TOSTRING */

    @Override
    public String toString() {
        return String.format("Línea: %d | Puntos: %s\n", id, Arrays.toString(puntos));
    }

    /* OTROS METODOS */

    public void imprimir() {
        Utiles.ES.escribirMensaje(this.toString());
    }

    public void annadir(Punto punto) {
        if (contador < this.puntos.length) {
            this.puntos[contador] = punto;
            contador++;
        } else {
            Utiles.ES.escribirMensaje("No se pueden añadir más puntos.\n");
        }
    }

    public void annadir(Punto[] puntos) {
        if (contador + puntos.length < this.puntos.length) {
            this.puntos[contador] = puntos[contador];
            contador++;
        } else {
            Utiles.ES.escribirMensaje("No hay suficiente espacio para añadir los puntos.\n");
        }
    }
}
