package mx.edu.uttt.PackS;

import javax.swing.*;

public class ParImpar {
    public void main(String[] args) {

        String menu;
        String opcion;
        boolean sentinel = true;

        // Menú
        menu = "==========MENU DE CICLO WHILE==========\n" +
                "1) Mostrar rango Par o Impar\n" +
                "2) Salir\n" +
                "3) Elegir opcion: ";

        do {

            opcion = JOptionPane.showInputDialog
                    (menu);

            switch (opcion.toUpperCase()) {

                case "1":

                    int num1 = Integer.parseInt
                            (JOptionPane.showInputDialog
                                    ("Ingresa el primer número:"));
                    int num2 = Integer.parseInt
                            (JOptionPane.showInputDialog
                                    ("Ingresa el segundo número:"));

                    if (num1 > num2) {
                        int aux = num1;
                        num1 = num2;
                        num2 = aux;
                    }

                    String resultado = "";

                    for (int i = num1; i <= num2; i++) {

                        if (i % 2 == 0) {
                            resultado += i + " es PAR\n";
                        } else {
                            resultado += i + " es IMPAR\n";
                        }
                    }

                    JOptionPane.showMessageDialog
                            (null,
                                    resultado);

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