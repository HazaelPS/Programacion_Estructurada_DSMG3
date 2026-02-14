/*
Muestra un menú para convertir temperaturas
de Celsius a Fahrenheit y de Fahrenheit a
Celsius.
 */
package mx.edu.uttt.PackM;

import javax.swing.*;

public class Temperatura {
    public static void main(String[] args) {

        String opcion;
        String menu;
        boolean sentinel = true;

        menu = "====== MENU TEMPERATURA ======\n" +
                "1) Celsius a Fahrenheit\n" +
                "2) Fahrenheit a Celsius\n" +
                "3) Salir\n" +
                "Elige una opción:";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {

                case "1":

                    double celsius = Double.parseDouble
                            (JOptionPane.showInputDialog
                                    ("Ingresa grados Celsius:"));

                    double fahrenheit = (celsius * 9 / 5) + 32;

                    JOptionPane.showMessageDialog
                            (null,
                                    "Resultado: " + fahrenheit + " °F");
                    break;

                case "2":

                    double f = Double.parseDouble
                            (JOptionPane.showInputDialog
                                    ("Ingresa grados Fahrenheit:"));

                    double c = (f - 32) * 5 / 9;

                    JOptionPane.showMessageDialog
                            (null,
                                    "Resultado: " + c + " °C");
                    break;

                case "3":
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