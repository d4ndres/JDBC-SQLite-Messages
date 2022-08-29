import java.util.Scanner;

public class MessageServices {
    public static void createMessage(){
        Scanner sc = new Scanner( System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Tu nombre");
        String nombre = sc.nextLine();

        Message registro = new Message();
        registro.setMensaje( mensaje );
        registro.setAutorMensaje( nombre );
        MensajesDAO.createMessageDB(registro);
    }
    public static void listMessages(){
        MensajesDAO.readMessagesDB();
    }
    public static void deleteMessage(){
        Scanner sc = new Scanner( System.in );
        System.out.println("Ingrese el ID del mensaje a borrar");
        int id = sc.nextInt();
        MensajesDAO.deleteMessageDB(id);
    }
    public static void updateMessage(){
        Scanner sc = new Scanner( System.in );
        Scanner cc = new Scanner( System.in );
        System.out.println("Ingrese el ID del mensaje a editar");
        int id = sc.nextInt();
        System.out.println("Ingrese el nuevo mensaje");
        String ms = cc.nextLine();
        Message actualizacion = new Message();
        actualizacion.setMensaje( ms );
        actualizacion.setId_mensaje( id );
        MensajesDAO.updateMessageDB(actualizacion);
    }
}
