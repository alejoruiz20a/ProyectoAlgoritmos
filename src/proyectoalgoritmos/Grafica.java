package proyectoalgoritmos;
public class Grafica {
    private String nombre;
    private int precio;
    private String Vram;
    private int stock;

    public Grafica (){//SIN PARAMETROS
        this.nombre = "";
        this.precio = 0;
        this.Vram = "";
        this.stock = 0;
    }
    public Grafica (String nombre, int precio, String Vram, int stock){//GET CON PARAMETROS
        this.nombre = nombre;
        this.precio = precio;
        this.Vram = Vram;
        this.stock = stock;
    }
    //SETTERS
    public void setGrafica(String nombre, int precio, String Vram, int stock){//SETTER
        this.nombre = nombre;
        this.precio = precio;
        this.Vram = Vram;
        this.stock = stock;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setVram(String Vram){
        this.Vram = Vram;
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
    public String getVram(){
        return Vram;
    }
    public int getStock(){
        return stock;
    }

    //METODOS NORMALES
    public int totalPrecio (int cantidad) {
        return this.precio*cantidad;
    }
    public void venderGrafica (int cantidad) {
        this.stock=this.stock-cantidad;
    }
    
    public void mostrarProductos() {
        System.out.println(this.nombre+" - "+this.precio+" - "+this.Vram+" - "+this.stock);
    }
    public void detallesProducto(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Vram: "+this.Vram);
        System.out.println("Stock: "+this.stock);
    }
}
