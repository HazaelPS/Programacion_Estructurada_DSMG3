package mx.edu.uttt;

import javax.swing.JOptionPane;

public class ProgramasConDoWhile {
    public static void main (String[] args){
        String opcion = "";
        boolean sentinel = true;
        do {


        opcion = obtenerMenu();

        switch (opcion){

            case "1": { //Programa1

                String bolita = "";
                String resultado = "====Resultado de Ventas====\n\n";
                String salir = "";


                do {
                    bolita = elegirBolita();
                }while (bolita.equals("-1"));



                break;
            }
            case "2":{
                break;
            }
            case "3":{
                break;
            }
            case "4":{
                JOptionPane.showMessageDialog(null,
                        "I'll be back");
                sentinel = false;
                break;
            }
            default:
            {
                JOptionPane.showMessageDialog(null,
                        "Opcion no valida");
            }
        }//cierra switch
            }while (sentinel);

    }//cierra el main
    public static String obtenerMenu (){
        String menu = "========== MENÚ ==========\n" +
                "1) Bolitas de descuento\n" +
                "2) Opcion 2\n" +
                "3) Opcion 3\n" +
                "4) Salir\n" +
                "5) Elegir opcion: \n";
        String opcion = JOptionPane.showInputDialog(menu);
        return opcion;
    }
    public static String elegirBolita() {
        String menu = "==== Bolita Elegida===\n"+
                "\n1)Roja" +
                "\n2)Amarilla" +
                "\n3)Blanca" +
                "\nElegir la Bolita";

        String opcion = JOptionPane.showInputDialog(menu);

        switch (menu){
            case "1":{ //Bolita Roja
                opcion = "1";
                break;
            }

            case "2":{ //Bolita Amarilla
                opcion = "2";
                break;
            }

            case "3":{ //Bolita Blanca
                opcion = "3";
                break;
            }
            default:
                opcion = "-1";


        }//Cierre switch
        return opcion;
    }//cierre de ElegirBolita


    public static String calcularResultados() {
        double descuento = 0.0, importe = 0.0;
        double total = 0.0;
        String salida = "", bolita = "";
        boolean sentinel = true;
        int i = 1;
        do {
            do {
                importe = Double.parseDouble
                        (JOptionPane.showInputDialog
                                ("Introduce el importe o -1 para salir"));
            } while (importe <= 0 && importe != -1);
            if (importe == -1) {
                JOptionPane.showMessageDialog(null,
                        "El programa termino contigo");

                sentinel = false;
            }else {
                bolita = elegirBolita();
                if (bolita.equals (1)){
                    descuento = importe * .40;
                    total = importe - descuento;
                } else if (bolita.equals("2")) {
                    descuento = importe * .25;
                    total = importe - descuento;
                }else {
                    descuento = 0.0;
                    total = importe;
                }
                salida+= "Cliente" + i +
                        "\nImporte: $" + importe +
                        "\nDescuento: $" + descuento +
                        "\nTotal: $" + total + "\n\n";
            }//cierre de do

        } while (sentinel);

        return salida;


    } //cierre calcularResultados


}//cierra la clase