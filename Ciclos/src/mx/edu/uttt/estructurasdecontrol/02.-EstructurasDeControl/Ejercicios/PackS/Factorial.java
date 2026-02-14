package mx.edu.uttt.PackS;

import javax.swing.*;

public class Factorial {
    public void main(String[] args) {

        String menu;
        String opcion;
        boolean sentinel = true;

        menu = "==========MENU DE CICLO WHILE==========\n" +
                "1) Calcular Factorial\n" +
                "2) Salir\n" +
                "3) Elegir opcion: ";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion.toUpperCase()) {

                case "1":

                    int numero = Integer.parseInt
                            (JOptionPane.showInputDialog
                                    ("Ingresa un número positivo:"));

                    if (numero < 0) {
                        JOptionPane.showMessageDialog
                                (null,
                                        "No se permiten negativos");
                        break;
                    }

                    long factorial = 1;

                    for (int i = 1; i <= numero; i++) {
                        factorial = factorial * i;
                    }

                    JOptionPane.showMessageDialog
                            (null,
                            "El factorial es: " + factorial);

                    break;

                case "2":
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