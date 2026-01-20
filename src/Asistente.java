import java.util.Objects;
public class Asistente {
    /*Declaramos el objeto asistente con todos sus atributos y métodos
    para que se guarde correctamente*/
    private String nombre;
    private String apellido;
    private String mail;

    public Asistente(String nombre, String apellido, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Asistente asistente = (Asistente) o;
        return Objects.equals(nombre, asistente.nombre) && Objects.equals(apellido, asistente.apellido) && Objects.equals(mail, asistente.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, mail);
    }
}
