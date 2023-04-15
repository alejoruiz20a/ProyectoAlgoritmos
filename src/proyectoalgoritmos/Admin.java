package proyectoalgoritmos;

public class Admin { //ESTA FUNCION CREA LOS ADMINISTRADORES
    //ATRIBUTOS
    private String nombre;
    private String usuario;
    private String contrasena;
    
    //CONSTRUCTOR
    public Admin (String usuario,String contrasena,String nombre) { 
        this.usuario=usuario;
        this.contrasena=contrasena;
        this.nombre=nombre;
    }
    public String getNombre () { //ESTE METODO MUESTRA EL NOMBRE DEL ADMINISTRADOR
        return nombre;
    }
    public String getUsuario () { //ESTE METODO MUESTRA EL USUARIO DEL ADMINISTRADOR
        return usuario;
    }
    public String getContrasena () { //ESTE METODO MUESTRA LA CONTRASEÑA DEL ADMINISTRADOR
        return contrasena;
    }
}
