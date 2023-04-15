package proyectoalgoritmos;
public class Ram { //ESTA CLASE CONTIENE LOS OBJETOS DE LOS PRODUCTOS DE TIPO RAM
    //ATRIBUTOS
    private String nombre;
    private int precio;
    private String velocidad;
    private String tipoMemoria;
    private int stock;

    //CONSTRUCTOR VACIO
    public Ram () { 
        this.nombre="";
        this.precio=0;
        this.velocidad="";
        this.tipoMemoria="";
        this.stock=0;
    }

    //CONSTRUCTOR DE PARAMETROS
    public Ram (String nombre, int precio, String velocidad, String tipoMemoria, int stock) { 
        this.nombre=nombre;
        this.precio=precio;
        this.velocidad=velocidad;
        this.tipoMemoria=tipoMemoria;
        this.stock=stock;
    }

    //SETTERS
    public void setRam (String nombre, int precio, String velocidad, String tipoMemoria, int stock) { //CONSTRUCTOR DE PARAMETROS
        this.nombre=nombre;
        this.precio=precio;
        this.velocidad=velocidad;
        this.tipoMemoria=tipoMemoria;
        this.stock=stock;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setPrecio(int precio) {
        this.precio=precio;
    }
    public void setVelocidad(String velocidad) {
        this.velocidad=velocidad;
    }
    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria=tipoMemoria;
    }
    public void setStock(int stock) {
        this.stock=stock;
    }

    //GETTERS 
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public String getVelocidad() {
        return velocidad;
    }
    public String getTipoMemoria() {
        return tipoMemoria;
    }
    public int getStock() {
        return stock;
    }

    //METODOS DE LA CLASE

    //ELIMINA UNA CANTIDAD INGRESADA DEL STOCK
    public void venderRam (int cantidad) {
        this.stock=this.stock-cantidad;
    }

    //MUESTRA EL PRODUCTO EN PANTALLA, CON SUS ESPECIFICACIONES
    public void mostrarProductos(){
        System.out.println(this.nombre + " - " + this.precio+ " - " + this.velocidad + " - " + this.tipoMemoria + " - " + this.stock);
    }

    //MUESTRA EL PRODUCTO A DETALLE, BIEN PRESENTADO
    public void detallesProducto(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Velocidad: "+this.velocidad);
        System.out.println("Tipo de memoria: "+this.tipoMemoria);
        System.out.println("Stock: "+this.stock);
    }

}
