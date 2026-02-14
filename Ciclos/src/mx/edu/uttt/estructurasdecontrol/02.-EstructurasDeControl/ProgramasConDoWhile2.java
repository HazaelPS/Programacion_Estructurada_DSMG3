/*package mx.edu.uttt;

public class ProgramasConDoWhile2 {
    public static void main(String[] args) {
        String opcion = "";
        boolean sentinel = true;
        do{

            opcion = obtenerMenu();

            switch (opcion){
                case "1": // Programa 1 {
                    JOptionPane.showMessageDialog(null,
                            calcularResultados());
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
                        "I will Be Back");
                sentinel = false;
                break;
            }
            default:
            {
                JOptionPane.showMessageDialog(null,
                        "Opción no valida");
            }

        } // cierra el switch }while(sentinel);
    } // Cierra el método main public static String obtenerMenu() {
    String menu = "========== MENU ==========\n" +
            "1)Bolitas de Descuento\n" +
            "2)Opción 2\n" +
            "3)Opción 3\n" +
            "4)Salir\n" +
            "Elegir Opción: ";
    String opcion = JOptionPane.showInputDialog(menu);
return opcion;

}

public static String elegirBolita (){
    String menu = "=== Bolita Elegida===" +
            "\n1)Roja" +
            "\n2)Amarilla" +
            "\n3)Blanca" +
            "\nElegir la Bolita";

    String opcion = JOptionPane.showInputDialog(menu);

    switch (opcion){
        case "1":{ // Bolita Roja opcion = "1";
            break;
        }
        case "2": { // Bolita Amarilla opcion = "2";
            break;
        }
        case "3":{ // Bolita Blanca opcion = "3";
            break;
        }
        default:
            opcion = "-1";

    }
    return opcion;
}

public static String calcularResultados() {
    double descuento = 0.0, importe = 0.0;
    double total = 0.0;
    String salida = "", bolita = "";
    boolean sentinel = true;
    int i = 1;

    do {
        do {
            importe = Double.parseDouble (JOptionPane.showInputDialog ("Introduce el importe o -1 para salir"));
        } while (importe <= 0 && importe != -1);

        if (importe == -1) {
            JOptionPane.showMessageDialog(null,
                    "Has terminado");
            sentinel = false;
        } else {
            bolita = elegirBolita();
            if (bolita.equals("1")) {
                descuento = importe * .40;
                total = importe - descuento;
            } else if (bolita.equals("2")) {
                descuento = importe * .25;
                total = importe - descuento;
            } else {
                descuento = 0.0;
                total = importe;
            }

            salida += "Cliente " + i +
                    "\nImporte: $" + importe +
                    "\nDescuento: $" + descuento +
                    "\nTotal: $" + total + "\n\n";
            i++;
        }
    }while (sentinel);

    return salida;
}
} // Cierra la clasepublic class ProgramasConDoWhile {
public static void main(String[] args) {
    String opcion = "";
    boolean sentinel = true;
    do{

        opcion = obtenerMenu();

        switch (opcion){
            case "1": // Programa 1 {
                JOptionPane.showMessageDialog(null,
                        calcularResultados());
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
                    "I will Be Back");
            sentinel = false;
            break;
        }
        default:
        {
            JOptionPane.showMessageDialog(null,
                    "Opción no valida");
        }

    } // cierra el switch }while(sentinel);
} // Cierra el método main public static String obtenerMenu() {
String menu = "========== MENU ==========\n" +
        "1)Bolitas de Descuento\n" +
        "2)Opción 2\n" +
        "3)Opción 3\n" +
        "4)Salir\n" +
        "Elegir Opción: ";
String opcion = JOptionPane.showInputDialog(menu);
return opcion;

}

public static String elegirBolita (){
    String menu = "=== Bolita Elegida===" +
            "\n1)Roja" +
            "\n2)Amarilla" +
            "\n3)Blanca" +
            "\nElegir la Bolita";

    String opcion = JOptionPane.showInputDialog(menu);

    switch (opcion){
        case "1":{ // Bolita Roja opcion = "1";
            break;
        }
        case "2": { // Bolita Amarilla opcion = "2";
            break;
        }
        case "3":{ // Bolita Blanca opcion = "3";
            break;
        }
        default:
            opcion = "-1";

    }
    return opcion;
}

public static String calcularResultados() {
    double descuento = 0.0, importe = 0.0;
    double total = 0.0;
    String salida = "", bolita = "";
    boolean sentinel = true;
    int i = 1;

    do {
        do {
            importe = Double.parseDouble (JOptionPane.showInputDialog ("Introduce el importe o -1 para salir"));
        } while (importe <= 0 && importe != -1);

        if (importe == -1) {
            JOptionPane.showMessageDialog(null,
                    "Has terminado");
            sentinel = false;
        } else {
            bolita = elegirBolita();
            if (bolita.equals("1")) {
                descuento = importe * .40;
                total = importe - descuento;
            } else if (bolita.equals("2")) {
                descuento = importe * .25;
                total = importe - descuento;
            } else {
                descuento = 0.0;
                total = importe;
            }

            salida += "Cliente " + i +
                    "\nImporte: $" + importe +
                    "\nDescuento: $" + descuento +
                    "\nTotal: $" + total + "\n\n";
            i++;
        }
    }while (sentinel);

    return salida;
}
}

 */