/*
Solicita un número entero
positivo y determina si es primo.

 */

package mx.edu.uttt.PackM;

import javax.swing.*;

public class Primo {
    public static void main(String[] args) {

        int opcion = 0;
        boolean sentinel = true;

        do {

            opcion = Integer.parseInt
                    (JOptionPane.showInputDialog
                            ("====== MENU NUMERO PRIMO ======\n" +
                                    "1) Verificar número\n" +
                                    "2) Salir\n" +
                                    "Elige una opción:"));

            switch (opcion) {

                case 1:

                    int numero = Integer.parseInt
                            (JOptionPane.showInputDialog
                                    ("Ingresa un número positivo:"));

                    if (numero <= 1) {
                        JOptionPane.showMessageDialog
                                (null,
                                        "No es primo");
                    } else {

                        int contador = 0;

                        for (int i = 1; i <= numero; i++) {

                            if (numero % i == 0) {
                                contador++;
                            }
                        }

                        if (contador == 2) {
                            JOptionPane.showMessageDialog
                                    (null,
                                            "Es número primo");
                        } else {
                            JOptionPane.showMessageDialog
                                    (null,
                                            "No es número primo");
                        }
                    }

                    break;

                case 2:
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