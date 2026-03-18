/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package objetosNegocio;

/**
 *
 * @author rober
 */
public class Pruebas02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Movimiento m1 = new Movimiento("MV001");
        Movimiento m2 = new Movimiento("MV001");
        Movimiento m3 = new Movimiento("MV002");

        if (m1.equals(m2)) {
            System.out.println("Son iguales");
        }
    }

}
