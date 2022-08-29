import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MensajesDAO {
    public static void createMessageDB(Message mensaje){
        ConnectionSQLite dbConn =  new ConnectionSQLite();
        try{
            Connection conn = dbConn.getConnection();
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO  mensaje ( mensaje, autor_mensaje ) VALUES (?,?)";
                ps = conn.prepareStatement( query );
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado");
            } catch ( Exception ex ){
                System.out.println( ex.getMessage() );
            }

        } catch ( Exception ex ){
            System.out.println( ex.getMessage() );
        }
    }
    public static void readMessagesDB(){
        ConnectionSQLite dbConn =  new ConnectionSQLite();
        try{
            Connection conn = dbConn.getConnection();
            PreparedStatement ps = null;
            ResultSet result = null;
            try{
                String query = "SELECT * FROM Mensaje";
                ps = conn.prepareStatement( query );
                result = ps.executeQuery();

                while( result.next() ){
                    System.out.print( "ID: " + result.getInt( "id_mensaje" ) );
                    System.out.print( " | Autor Mensaje: " + result.getString( "autor_mensaje" ) );
                    System.out.print( " | Mensaje: " + result.getString( "mensaje" ) );
                    System.out.print( " | Fecha: " + result.getString( "fecha_mensaje" ) );
                    System.out.println("\n");
                }

            } catch ( Exception ex ){
                System.out.println( ex.getMessage() );
            }

        } catch ( Exception ex ){
            System.out.println( ex.getMessage() );
        }
    }
    public static void deleteMessageDB(int idMensaje){
        ConnectionSQLite dbConn =  new ConnectionSQLite();
        try{
            Connection conn = dbConn.getConnection();
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM mensaje WHERE id_mensaje = ? ";
                ps = conn.prepareStatement( query );
                ps.setInt(1, idMensaje );
                ps.executeUpdate();
                System.out.println("Mensaje borrado");
            } catch ( Exception ex ){
                System.out.println( ex.getMessage() );
                System.out.println("No se ha encontrado el mensaje");
            }
        } catch ( Exception ex ){
            System.out.println( ex.getMessage() );
        }
    }
    public static void updateMessageDB(Message mensaje){
        ConnectionSQLite dbConn =  new ConnectionSQLite();
        try{
            Connection conn = dbConn.getConnection();
            PreparedStatement ps = null;
            try{
                String query = "UPDATE Mensaje SET mensaje = ? WHERE id_mensaje = ? ";
                ps = conn.prepareStatement( query );
                ps.setString( 1, mensaje.getMensaje() );
                ps.setInt(2, mensaje.getId_mensaje() );
                ps.executeUpdate();
                System.out.println("Se ha actualizado el mensaje");
            } catch ( Exception ex ){
                System.out.println( ex.getMessage() );
                System.out.println("No se ha encontrado el mensaje");
            }
        } catch ( Exception ex ){
            System.out.println( ex.getMessage() );
        }
    }
}
