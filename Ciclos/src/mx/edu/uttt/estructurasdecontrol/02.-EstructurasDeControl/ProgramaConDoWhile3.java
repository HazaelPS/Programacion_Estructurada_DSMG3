package mx.edu.uttt;

import javax.swing.JOptionPane;

public class ProgramaConDoWhile3 {

    public static void main(String[] args) {
        String opcion = "";
        boolean sentinel = true;

        do {
            opcion = obtenerMenu();

            switch (opcion) {

                case "1": {
                    String resultado = calcularResultados();
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                }

                case "2": {
                    JOptionPane.showMessageDialog(null, "Opción 2 en construcción");
                    break;
                }

                case "3": {
                    JOptionPane.showMessageDialog(null, "Opción 3 en construcción");
                    break;
                }

                case "4": {
                    JOptionPane.showMessageDialog(null, "I'll be back");
                    sentinel = false;
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }
        } while (sentinel);
    }

    public static String obtenerMenu() {
        String menu = "========== MENÚ ==========\n" +
                "1) Bolitas de descuento\n" +
                "2) Opción 2\n" +
                "3) Opción 3\n" +
                "4) Salir\n\n" +
                "Elegir opción:";
        return JOptionPane.showInputDialog(menu);
    }

    public static String elegirBolita() {
        String menu = "==== Bolita Elegida ====\n" +
                "1) Roja (40%)\n" +
                "2) Amarilla (25%)\n" +
                "3) Blanca (0%)\n\n" +
                "Elegir bolita:";

        String opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {
            case "1":
            case "2":
            case "3":
                return opcion;
            default:
                JOptionPane.showMessageDialog(null, "Bolita no válida");
                return "-1";
        }
    }

    public static String calcularResultados() {
        double descuento, importe, total;
        String salida = "==== Resultado de Ventas ====\n\n";
        boolean sentinel = true;
        int i = 1;

        do {
            importe = Double.parseDouble(
                    JOptionPane.showInputDialog("Introduce el importe o -1 para salir"));

            if (importe == -1) {
                sentinel = false;
            } else if (importe <= 0) {
                JOptionPane.showMessageDialog(null, "Importe inválido");
            } else {
                String bolita;
                do {
                    bolita = elegirBolita();
                } while (bolita.equals("-1"));

                if (bolita.equals("1")) {
                    descuento = importe * 0.40;
                } else if (bolita.equals("2")) {
                    descuento = importe * 0.25;
                } else {
                    descuento = 0.0;
                }

                total = importe - descuento;

                salida += "Cliente " + i++ +
                        "\nImporte: $" + importe +
                        "\nDescuento: $" + descuento +
                        "\nTotal: $" + total + "\n\n";
            }
        } while (sentinel);

        return salida;
    }
}
