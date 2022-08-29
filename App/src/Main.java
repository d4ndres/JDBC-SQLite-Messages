
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int opcion = 0;

        do{
            System.out.println("------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir de la aplicación");
            opcion = sc.nextInt();

            switch ( opcion ){
                case 1:
                    MessageServices.createMessage();
                    break;
                case 2:
                    MessageServices.listMessages();
                    sc.nextLine();sc.nextLine();// Error buffer solution
                    break;
                case 3:
                    MessageServices.updateMessage();
                    break;
                case 4:
                    MessageServices.deleteMessage();
                    break;
                case 5:
                    System.out.println("Gracias por usar la aplicacion");
                    break;
                default:
                    System.out.println("Ingreso no valido");

            }
        } while( opcion != 5);



    }
}

