/*
** Iris Auñón Navarro
** Ejercicio UML-CodiFont2
** A partir de la captura de pantalla proporcionada, creeu un projecte en IntelliJ en el
** qual implementeu el diagrama UML.
** A més s'haurà de crear un main en el qual es cride als diferents constructors per a comprobar que funciona tot.
** D'altra banda s'haurà d'indagar sobre com afegir nous constructors a les classes Línia i Àrea, com
** per exemple passar un array de punts en lloc de Punts solts.
*/

public class Principal {
    /* METODO PRINCIPAL */
    public static void main(String[] args) {
        /* PUNTO */

        Utiles.ES.escribirMensaje("--- PUNTO ---\n");

        // Crear un punto
        Punto p1 = new Punto(1, 2, 5);

        // Ver punto
        p1.imprimir();

        // Cambiar valor x de p1
        p1.setX(3);

        // Volver a ver punto
        p1.imprimir();

        /* LINEA */

        Utiles.ES.escribirMensaje("\n--- LÍNEA ---\n");

        // Crear una linea
        Linea l1 = new Linea(1);

        // Ver linea
        l1.imprimir();

        // Anadir puntos a linea
        l1.annadir(new Punto(2, 5, 10));
        l1.annadir(new Punto(3, 3, 7));

        // Volver a ver linea
        l1.imprimir();

        // Cambiar valor X de p2 de l1
        Punto[] lineaPuntos = l1.getPuntos();
        lineaPuntos[1].setX(6);

        // Volver a ver linea
        l1.imprimir();

        /* AREA */

        Utiles.ES.escribirMensaje("\n--- ÁREA ---\n");

        // Crear un area
        Area a1 = new Area(1);

        // Ver area
        a1.imprimir();

        // Anadir puntos a area
        a1.annadir(new Punto(4, 12, 20));
        a1.annadir(new Punto(5, -2, 6));
        a1.annadir(new Punto(6, 0, 8));

        // Esta tiene que dar error :)
        Utiles.ES.escribirMensaje("Se va a intentar introducir un nuevo punto al área, dará error -> ");
        a1.annadir(new Punto(7, 5, 7));

        // Volver a ver area
        a1.imprimir();

        // Cambiar valor de Y de p3 de a1
        Punto[] areaPuntos = a1.getPuntos();
        areaPuntos[2].setY(2);

        // Volver a ver area
        a1.imprimir();
    }
}
