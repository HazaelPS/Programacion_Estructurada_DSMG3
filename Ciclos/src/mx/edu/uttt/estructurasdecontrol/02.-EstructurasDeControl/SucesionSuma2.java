package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class SucesionSuma2 {
    public static void main(String[] args) {

         int n = Integer.parseInt
                        (JOptionPane.showInputDialog
                                ("Ingresa el valor de n"));

         if (n >= 0) {
             String sucesion = "Sucesión :\n";

             for (int i = 0; i < 8; i++) {

                 int numero = n + i;
                 int cuadrado = numero * numero; // n²
                 sucesion += cuadrado + ", ";
             }
             JOptionPane.showMessageDialog
                     (null,
                            sucesion);

         } else {
             JOptionPane.showMessageDialog(
                            null,
                            "El valor de n no es válido");

         }
    }
}
