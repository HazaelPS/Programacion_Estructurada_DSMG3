package mx.edu.uttt.PackS;

import javax.swing.*;

public class MayorMenor {
    public static void main(String[] args) {
        String menu;
        String opcion;
        boolean sentinel = true;

        menu = "==========MENU DE CICLO WHILE==========\n" +
                "1) Capturar 10 números\n" +
                "2) Salir\n" +
                "3) Elegir opcion: ";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion.toUpperCase()) {

                case "1":

                    int mayor = 0;
                    int menor = 0;

                    for (int i = 1; i <= 10; i++) {

                        int num = Integer.parseInt
                                (JOptionPane.showInputDialog
                                        ("Número " + i + ":"));

                        if (i == 1) {
                            mayor = num;
                            menor = num;
                        } else {

                            if (num > mayor) {
                                mayor = num;
                            }

                            if (num < menor) {
                                menor = num;
                            }
                        }
                    }

                    JOptionPane.showMessageDialog
                            (null,
                            "Mayor: " + mayor +
                                    "\nMenor: " + menor);

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