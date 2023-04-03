package proyectoalgoritmos;

public class Procesador {
    //ATRIBUTOS
    private String nombreProcesador;
    private int precio;
    private int nucleos;
    private String velocidad;
    private int stock;
    private String socket;
    //METODOS CONSTRUCTORES
    public Procesador () { //SIN PARAMETROS
        this.nombreProcesador="";
        this.precio=0;
        this.nucleos=0;
        this.velocidad="0";
        this.stock=0;
        this.socket = "";
    }
    public Procesador (String nombre, int precio, int nucleos, String velocidad, int stock, String socket) { //CON PARAMETROS
        this.nombreProcesador=nombre;
        this.precio=precio;
        this.nucleos=nucleos;
        this.velocidad=velocidad;
        this.stock=stock;
        this.socket=socket;
    }
    //SETTERS
    public void setProcesador (String nombre, int precio,int nucleos, String velocidad, int stock, String socket) { //SETTER PRINCIPAL
        this.nombreProcesador=nombre;
        this.precio=precio;
        this.nucleos=nucleos;
        this.velocidad=velocidad;
        this.stock=stock;
        this.socket=socket;
    }
    public void setNombre (String nombre) { //SET NOMBRE
        this.nombreProcesador=nombre;
    }
    public void setPrecio (int precio) { //SET PRECIO
        this.precio=precio;
    }
    public void setNucleos (int nucleos) { //SET STOCK
        this.nucleos=nucleos;
    }
    public void setVelocidad (String velocidad) { //SET STOCK
        this.velocidad=velocidad;
    }
    public void setStock (int stock) { //SET STOCK
        this.stock=stock;
    }
    public void setsocket (String socket) { //SET STOCK
        this.socket=socket;
    }
    //GETTERS
    public String getNombreProcesador(){
        return nombreProcesador;
    }
    public int getPrecio(){
        return precio;
    }
    public int getNucleos(){
        return nucleos;
    }
    public String getVelocidad(){
        return velocidad;
    }
    public int getStock(){
        return stock;
    }
    public String getSocket(){
        return socket;
    }
    //METODOS
    public int totalPrecio (int cantidad) {
        return this.precio*cantidad;
    }
    public void venderProcesador (int cantidad) {
        this.stock=this.stock-cantidad;
    }
    public void mostrarProductos(){
        System.out.println(this.nombreProcesador + " - " + this.precio+ " - " + this.nucleos + " - " + this.velocidad +" - "+ this.socket +" - "+ this.stock);
    }
    
}
