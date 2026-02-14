package mx.edu.uttt;
import javax.swing.JOptionPane;

public class ProgramacionWhile {
    public static void main(String[] args) {
        //Declaracion de variables
        final double PORCENTAJE = 0.10;
        double sueltoB = 0.0, v1 = 0.0, v2 = 0.0, v3 = 0.0,
                comision = 0.0, total = 0.0, totalS=0.0;
        int numTraba = 0;
        String salida= "";
        String menu = "", opcion="";
        boolean sentinel = true;


        //Crea la cadena de Texto para las opciones de menu
        menu = "==========MENU DE CICLO WHILE==========\n" +
                "1) Opcion 1\n" +
                "2) Opcion 2\n" +
                "3) Opcion 3\n" +
                "4) Salir\n" +
                "5) Elegir opcion: ";

        do {
            //Mostrar el menu
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion.toUpperCase()) {
                case "1":
                case "A":
                    numTraba = Integer.parseInt((JOptionPane.showInputDialog("Numero de trabajadores")));
                    //Valida el numero de trabajadores
                    if (numTraba>0){

                        sueltoB = Double.parseDouble
                                (JOptionPane.showInputDialog("Sueldo base"));
                        if (sueltoB>0.0) {
                            int i = 1;
                            salida = "===== NOMINA =====\n";
                            while (i <= numTraba) {
                                v1 = Double.parseDouble
                                        (JOptionPane.showInputDialog("Introduce la venta 1"));
                                v2 = Double.parseDouble
                                        (JOptionPane.showInputDialog("Introduce la venta 2"));
                                v3 = Double.parseDouble
                                        (JOptionPane.showInputDialog("Introduce la venta 3"));
                                if (v1 <= 0.0 || v2 <= 0.0 || v3 <= 0.0) {
                                    JOptionPane.showMessageDialog(null,
                                            "Una o mas ventas no son validas");

                                    continue;
                                } else {
                                    //Construccion
                                    comision = (v1 + v2 + v3) * PORCENTAJE;
                                    total = sueltoB + comision;
                                    salida+= "\nVendedor "+ i +
                                    "\nSueldo Base: " + sueltoB +
                                    "\nComision: " + comision +
                                    "\nTotal: $" + total;
                                    totalS+=total;
                                }
                                i++;
                            }//Cierra el while
                            salida+= "\nTotal de Deducciones: $"+ totalS;
                            JOptionPane.showMessageDialog(null,
                                    salida);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El sueldo Base no es valido");
                        }
                    } else {
                        JOptionPane.showMessageDialog
                                (null,
                                        "El numero de trabajadores debe ser mayor a cero");
                    }
                    break;
                case "2":
                case "B":
                    JOptionPane.showMessageDialog(null,
                            "Opcion 2");
                    break;
                case "3":
                case "C":
                    JOptionPane.showMessageDialog(null,
                            "Opcion 3");
                    break;
                case "4":
                case "S":
                    JOptionPane.showMessageDialog(null,
                            "El programa ha terminado");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opcion no valida");
            } //cierra el switch

        }while (sentinel);
    }
}
