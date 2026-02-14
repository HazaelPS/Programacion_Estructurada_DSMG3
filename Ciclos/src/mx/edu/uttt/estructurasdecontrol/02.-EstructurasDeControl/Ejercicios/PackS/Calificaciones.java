package mx.edu.uttt.PackS;

import javax.swing.*;

public class Calificaciones {
    public static void main(String[] args) {
        String menu;
        String opcion;
        boolean sentinel = true;

        menu = "==========MENU DE CICLO WHILE==========\n" +
                "1) Capturar calificaciones\n" +
                "2) Salir\n" +
                "3) Elegir opcion: ";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion.toUpperCase()) {

                case "1":

                    int suma = 0;
                    int contador = 0;
                    int aprobados = 0;
                    int reprobados = 0;

                    while (true) {

                        int cal = Integer.parseInt
                                (JOptionPane.showInputDialog
                                        ("Ingresa calificación (-1 para salir):"));

                        if (cal == -1) {
                            break;
                        }

                        if (cal < 0 || cal > 10) {
                            JOptionPane.showMessageDialog
                                    (null,
                                            "Calificación inválida");
                            continue;
                        }

                        suma += cal;
                        contador++;

                        if (cal >= 7) {
                            aprobados++;
                        } else {
                            reprobados++;
                        }
                    }

                    if (contador > 0) {
                        double promedio = (double) suma / contador;

                        JOptionPane.showMessageDialog
                                (null,
                                "Promedio: " + promedio +
                                        "\nAprobados: " + aprobados +
                                        "\nReprobados: " + reprobados);
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