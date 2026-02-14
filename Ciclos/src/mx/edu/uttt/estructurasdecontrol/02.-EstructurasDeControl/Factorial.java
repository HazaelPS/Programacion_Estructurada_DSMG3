package mx.edu.uttt.estructurasdecontrol;

import javax.swing.*;

/*9. Hacer un programa que lea un valor N, entero y positivo
y que calcule e imprima su  factorial. Por ejemplo, si lee el %,
su factorial es el producto de 1*2*3*4*5. El factorial de  0 es 1.
 */
public class Factorial {
    public static void main(String[] args) {

        long fact = 1;
        int n = 0;

        // solicitar el valor de "n"
        n = Integer.parseInt(
                JOptionPane.showInputDialog
                        ( "Introduce el valor de n"));

        if (n>=0) {
            for (int i = 1; i <= n ; i++) {
                fact*=i;
            }
            JOptionPane.showMessageDialog
                    ( null,
                            "El factorial de " + n + " es: " + fact);
        }else {
            JOptionPane.showMessageDialog
                    (null,
                    "El valor de n no es valido");
        }

    }
}
