/*Solicita el número de alumnos de un grupo
y registra si cada uno está Presente (P) o
Ausente (A). Muestra el porcentaje de asistencia.

 */

package mx.edu.uttt.PackM;

import javax.swing.*;

public class PorcentajeAsistencia {
    public static void main(String[] args) {

        String opcion;
        String menu;
        boolean sentinel = true;

        menu = "====== MENU ASISTENCIA ======\n" +
                "1) Registrar asistencia\n" +
                "2) Salir\n" +
                "Elige una opción:";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {

                case "1":

                    int alumnos = Integer.parseInt
                            (JOptionPane.showInputDialog
                                    ("Número de alumnos:"));

                    if (alumnos <= 0) {
                        JOptionPane.showMessageDialog
                                (null,
                                        "Número inválido");
                        break;
                    }

                    int presentes = 0;

                    for (int i = 1; i <= alumnos; i++) {

                        String estado = JOptionPane.showInputDialog
                                ("Alumno " + i + " (P=Presente, A=Ausente):");

                        if (estado.equalsIgnoreCase("P")) {
                            presentes++;
                        }
                    }

                    double porcentaje = (double) presentes * 100 / alumnos;

                    JOptionPane.showMessageDialog
                            (null,
                                    "Porcentaje de asistencia total: " + porcentaje + "%");
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