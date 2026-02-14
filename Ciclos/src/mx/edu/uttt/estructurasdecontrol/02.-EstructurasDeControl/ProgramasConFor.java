package mx.edu.uttt;
/* calcular el promedio de un alumno
que tiene n calificaciones en
la materia de programacion
 */
import javax.swing.JOptionPane;
public class ProgramasConFor {
    public static void main (String [] args ){
        String menu = "", opcion="";
        boolean sentinel = true;
        int n =0;
        double promedio=0.0, calif = 0.0;


        //Crea la cadena de Texto para las opciones de menu
        menu = "==========MENU DE PROGRAMAS CON FOR========== \n" +
                "1) Calcular Promedio\n" +
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
                    JOptionPane.showMessageDialog(null,
                            "Opcion 1");
                    n=Integer.parseInt(JOptionPane.showInputDialog
                            ("Introduce el numero de calificaciones"));
                    if (n>0){
                        promedio = 0.0;
                        for (int i = 1; i <= n; i++) {
                            calif =
                                    Double.parseDouble
                                            (JOptionPane.showInputDialog("Introduce la calificacion "+i));
                            if (calif >=0.0 && calif<=10.0) {
                                //Promedio = promedio + calif;
                                promedio += calif;
                            }else{
                                JOptionPane.showMessageDialog(null,
                                        "La calificacion no es valida");
                                i--;

                                continue;
                            }
                        }
                        //promedio = promedio / n;
                        promedio/=n;
                        JOptionPane.showMessageDialog(null,
                                "El promedio es: "+promedio);
                    }else{
                        JOptionPane.showMessageDialog
                                (null,
                                        "El numero de calificaciones no puede ser negativo");
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
            }//cierra el switch

        }while (sentinel);
    }
}
