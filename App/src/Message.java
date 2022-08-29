public class Message {
    int id_mensaje;
    String mensaje;
    String autorMensaje;
    String fechaMensaje;


    public Message(){

    }

    public Message(String mensaje, String autor, String fechaMensaje){
        this.mensaje = mensaje;
        this.autorMensaje = autor;
        this.fechaMensaje = fechaMensaje;

    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }


}
