/*
** Iris Auñón Navarro
** Ejercicio UML-CodiFont2 - Clase Area
*/

/* LIBRERIAS */
import java.util.Arrays;

public class Area {
    /* ATRIBUTOS */

    private int id;
    private Punto[] puntos;
    private static int contador;

    /* CONSTRUCTORES */

    public Area(int id) {
        this.id = id;
        this.puntos = new Punto[3];
        contador = 0;
    }

    /* GETTERS */

    public int getId() {
        return id;
    }

    public Punto[] getPuntos() {
        return puntos;
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
        return String.format("Área: %d | Puntos: %s\n", id, Arrays.toString(puntos));
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
