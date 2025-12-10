/*
** Iris Auñón Navarro
** Ejercicio UML-CodiFont2 - Clase Punto
*/

public class Punto {
    /* ATRIBUTOS */

    private int id;
    private int x;
    private int y;

    /* CONSTRUCTOR */

    public Punto(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    /* GETTERS */

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /* SETTERS */

    public void setId(int id) {
        this.id = id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /* METODO TOSTRING */

    @Override
    public String toString() {
        return String.format("Punto: %d | x: %d | y: %d\n", id, x, y);
    }

    /* OTROS METODOS */

    public void imprimir() {
        Utiles.ES.escribirMensaje(this.toString());
    }
}
