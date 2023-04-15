package proyectoalgoritmos;

import java.util.Scanner;

public class Usuarios { //ESTA CLASE ALMACENA LOS USUARIOS QUE TIENE REGISTRADOS EL PROGRAMA

    // ATRIBUTOS
    private String Usuario;
    private String Contrasena;
    public Usuarios next=null;
    
    Scanner sc=new Scanner(System.in);

    //ESTA FUNCION ANADE EL NUEVO USUARIO A LA LISTA DE USUARIOS
    public void registrarse(Usuarios nuevo, Usuarios head) { 
        Usuarios pointer=head;
        while (pointer.next!=null) {
            pointer=pointer.next;
        }
        pointer.next=nuevo;
        System.out.println("Se ha registrado con exito.");
    }

    //MUESTRA LOS USUARIOS PARA CORROBORAR SI HAN SIDO REGISTRADOS
    public void mostrarUsuarios(Usuarios head) {
        Usuarios pointer=head;
        while (pointer!=null) {
            System.out.println(pointer.Usuario+pointer.Contrasena);
            pointer=pointer.next;
        }
    }

    //METODOS CONSTRUCTORES
    public Usuarios(){}  //VACIO
    public Usuarios(String Usuario, String Contrasena){ //CON PARAMETROS
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }

    //SETTERS Y GETTERS
    public void setUsuario(String Usuario){
        this.Usuario = Usuario;
    }
    public String getUsuario(){
        return Usuario;
    }
    public void setContra(String Contra){
        this.Contrasena = Contra;
    }
    public String getContra(){
        return Contrasena;
    }
}    



















// COLABORACION DE JUANJO

    /*
    // AGREGAR
    public Usuarios Agregar(Usuarios Lista){
        String Password;
        Usuarios Nuevo=new Usuarios();
        
        System.out.println("Ingrese el nombre de usuario: ");
        Usuario=sc.nextLine();
        Nuevo.setUsuario(Usuario);
        
        System.out.println("Ingrese la contrasena del usuario: ");
        Password=sc.nextLine();
        Nuevo.setContra(Password);

 
 
      if(Lista!=null){  
        while(Lista.getNext()!=null){
            Lista=Lista.getNext();
        }
        Lista.setNext(Nuevo);
      }
      return Lista;
    }
    
    // MOSTRAR
    public void Mostrar(Usuarios Lista){

        
        while(Lista !=null){
            System.out.println("Nombre: "+ Lista.getUsuario());
            System.out.println("Contrasena: "+ Lista.getContra());
            Lista=Lista.getNext();
        }
    }
    
    // INGRESAR
    public Usuarios Ingresar(String Usuario, String Contrasena, Usuarios Lista){

      boolean Encontrar=false;
      
      while(Lista!=null){
        if(Lista.getUsuario().equals(Usuario) && Lista.getContra().equals(Contrasena)){
            Encontrar=true;
            break;
        }
        Lista=Lista.getNext();
      }
      if(Encontrar){
      System.out.println("Se encuentra registrado.");
      } else {
      System.out.println("No se encuentra registrado.");
      }
      return Lista;
    }
    
    // GET Y SET
    public void setNext(Usuarios Next){
        this.next=Next;
    }
    public Usuarios getNext(){
        return next;
    }
    

    public void setUsuario(String Usuario){
        this.Usuario = Usuario;
    }
    public String getUsuario(){
        return Usuario;
    }
    public void setContra(String Contra){
        this.Contrasena = Contra;
    }
    public String getContra(){
        return Contrasena;
    }
}

*/