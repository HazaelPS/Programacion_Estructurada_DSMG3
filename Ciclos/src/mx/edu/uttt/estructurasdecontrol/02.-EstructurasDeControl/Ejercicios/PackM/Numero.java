/*
Solicita números enteros hasta que
el usuario ingrese un número negativo.
Muestra la suma total y cuántos números
válidos se ingresaron.
 */
package mx.edu.uttt.PackM;

import javax.swing.*;

public class Numero {
    public static void main(String[] args) {

        String opcion;
        String menu;
        boolean sentinel = true;

        menu = "====== MENU ======\n" +
                "1) Ingresar números\n" +
                "2) Salir\n" +
                "Elige una opción:";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {

                case "1":

                    int suma = 0;
                    int contador = 0;

                    while (true) {

                        int num = Integer.parseInt
                                (JOptionPane.showInputDialog
                                        ("Ingresa un número (negativo para salir):"));

                        if (num < 0) {
                            break;
                        }

                        suma += num;
                        contador++;
                    }

                    JOptionPane.showMessageDialog
                            (null,
                                    "Suma total: " + suma +
                                    "\nCantidad de números: " + contador);
                    break;

                case "2":
                    JOptionPane.showMessageDialog
                            (null,
                                    "Saliendo...");
                    sentinel = false;
                    break;

                default:
                    JOptionPane.showMessageDialog
                            (null, "Opción inválida");
            }

        } while (sentinel);
    }
}
