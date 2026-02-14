package mx.edu.uttt.PackS;

import javax.swing.*;

public class NumeroSecreto {
    public static void main(String[] args) {
        String menu;
        String opcion;
        boolean sentinel = true;

        menu = "==========MENU DE CICLO WHILE==========\n" +
                "1) Jugar Adivinar Número\n" +
                "2) Salir\n" +
                "3) Elegir opcion: ";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion.toUpperCase()) {

                case "1":

                    int numeroSecreto = 7;
                    int intentos = 0;

                    while (intentos < 5) {

                        int numero = Integer.parseInt(
                                JOptionPane.showInputDialog("Intento " + (intentos + 1)));

                        if (numero == numeroSecreto) {
                            JOptionPane.showMessageDialog
                                    (null,
                                            "¡Correcto!");
                            break;
                        } else {
                            JOptionPane.showMessageDialog
                                    (null,
                                            "Incorrecto");
                        }

                        intentos++;
                    }

                    if (intentos == 5) {
                        JOptionPane.showMessageDialog
                                (null,
                                "Perdiste. El número era " + numeroSecreto);
                    }

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