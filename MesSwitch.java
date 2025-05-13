import java.util.Scanner; // Importan la libreria 

//Las clases y objetos son las unicas cosas que lleva mayusculas.
public class MesSwitch {
    private static final Scanner scanner = new Scanner(System.in);

    // bloque de codigo 
    public static int obtenerNumero(String mensaje) {
        int numeroTemporal;
        System.out.println(mensaje + ": ");
        numeroTemporal = scanner.nextInt();
        return numeroTemporal;
    }


    public static void main(String[] args) {
        
        int numeroUsuario = obtenerNumero("Ingresa un numero del 1 al 12");


            // Se evalua con un switvh depende del numero del usuario
        switch (numeroUsuario) {
            case 1:
                System.out.println("January");
                break;
            
            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid number");
                break;
        }
    }
}

