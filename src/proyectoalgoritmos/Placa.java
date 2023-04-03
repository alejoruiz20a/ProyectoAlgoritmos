package proyectoalgoritmos;
public class Placa{
    private String nombre;
    private int precio;
    private String socket;
    private String tipoMemoria;
    private int stock;
    public Placa(){
        this.nombre = "";
        this.precio = 0;
        this.socket = "";
        this.tipoMemoria = "";
        this.stock = 0;
    }
    public Placa(String nombre, int precio, String socket, String tipoMemoria, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.socket = socket;
        this.tipoMemoria = tipoMemoria;
        this.stock = stock;
    }
    //SETTERS
    public void setPlaca(String nombre, int precio, String socket, String tipoMemoria, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.socket = socket;
        this.tipoMemoria = tipoMemoria;
        this.stock = stock;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setsocket(String socket){
        this.socket = socket;
    }
    public void setTipoMemoria(String tipoMemoria){
        this.tipoMemoria = tipoMemoria;
    }
    public void setStock(int stock){
        this.stock = stock;
    }

    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public String getsocketString(){
        return socket;
    }
    public String getTipoMemoria(){
        return tipoMemoria;
    }
    public int getStock(){
        return stock;
    }

     //METODOS NORMALES
    public int totalPrecio (int cantidad) {
        return this.precio*cantidad;
    }
    public void venderPlaca (int cantidad) {
        this.stock=this.stock-cantidad;
    }
     public void mostrarProductos(){
        System.out.println(this.nombre + " - " + this.precio+ " - " + this.socket + " - " + this.tipoMemoria + " - " + this.stock);
    }
     public void detallesProducto(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Socket: "+this.socket);
        System.out.println("Tipo de memoria: "+this.tipoMemoria);
        System.out.println("Stock: "+this.stock);
    }
}