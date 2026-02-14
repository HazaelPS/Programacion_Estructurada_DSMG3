/*
Muestra un menú con opciones para
sumar, restar y multiplicar dos números.
El menú se repite hasta que el usuario
decida salir.
 */
package mx.edu.uttt.PackM;

import javax.swing.*;

public class Menu {
    static void main(String[] args) {

        String opcion;
        String menu;
        boolean sentinel = true;

        menu = "====== MENU OPERACIONES ======\n" +
                "1) Sumar\n" +
                "2) Restar\n" +
                "3) Multiplicar\n" +
                "4) Salir\n" +
                "Elige una opción:";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {

                case "1":
                case "2":
                case "3":

                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Primer número:"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número:"));

                    if (opcion.equals("1")) {
                        JOptionPane.showMessageDialog
                                (null,
                                        "Resultado: " + (num1 + num2));
                    } else if (opcion.equals("2")) {
                        JOptionPane.showMessageDialog
                                (null,
                                        "Resultado: " + (num1 - num2));
                    } else {
                        JOptionPane.showMessageDialog
                                (null,
                                        "Resultado: " + (num1 * num2));
                    }

                    break;

                case "4":
                    JOptionPane.showMessageDialog
                            (null,
                                    "Saliendo...");
                    sentinel = false;
                    break;

                default:
                    JOptionPane.showMessageDialog
                            (null,
                                    "Opción inválida");
            }

        } while (sentinel);
    }
}