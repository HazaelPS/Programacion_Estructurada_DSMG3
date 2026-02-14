package mx.edu.uttt.estructurasdecontrol;

import javax.swing.*;

/*Calcular la suma de la siguiente sucesión e
imprimir la sucesión y la suma:
20, 25, 30, 35, …. n
 */
public class SucesionSuma {
    public static void main(String[] args) {
        // ===== PARTE 1: Sucesión 20,25,30,...N =====
                int N = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingresa el valor de N:")
                );

                int suma1 = 0;
                String sucesion1 = "Sucesión: ";

                for (int i = 20; i <= N; i += 5) {
                    sucesion1 += i + ", ";
                    suma1 += i;
                }

                JOptionPane.showMessageDialog
                        (null,
                        sucesion1 + "\nSuma = " + suma1);

                // ===== PARTE 2: Sucesión n² (mínimo 8 términos) =====
                int n = Integer.parseInt(
                        JOptionPane.showInputDialog
                                ("Ingresa el número inicial para la" +
                                        "sucesión n²:"));

                int suma2 = 0;
                String sucesion2 = "Sucesión n²:\n";

                for (int i = 0; i < 8; i++) {
                    int valor = (n + i) * (n + i);
                    sucesion2 += (n + i) + "² = " + valor + "\n";
                    suma2 += valor;
                }

                JOptionPane.showMessageDialog
                        (null,
                        sucesion2 + "\nSuma = " + suma2);


            }

}
