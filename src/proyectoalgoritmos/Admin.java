package proyectoalgoritmos;

public class Admin {
    private String nombre;
    private String usuario;
    private String contrasena;
    
    public Admin (String usuario,String contrasena,String nombre) {
        this.usuario=usuario;
        this.contrasena=contrasena;
        this.nombre=nombre;
    }
    public String getNombre () {
        return nombre;
    }
    public String getUsuario () {
        return usuario;
    }
    public String getContrasena () {
        return contrasena;
    }
}
