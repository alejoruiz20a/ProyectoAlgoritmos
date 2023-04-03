package proyectoalgoritmos;
public class Ram {
    private String nombre;
    private int precio;
    private String velocidad;
    private String tipoMemoria;
    private int stock;

    public Ram () { //CONSTRUCTOR VACIO
        this.nombre="";
        this.precio=0;
        this.velocidad="";
        this.tipoMemoria="";
        this.stock=0;
    }

    public Ram (String nombre, int precio, String velocidad, String tipoMemoria, int stock) { //CONSTRUCTOR DE PARAMETROS
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

    //METODOS CONSTRUCTORES
    public int totalPrecio (int cantidad) {
        return this.precio*cantidad;
    }
    public void venderProcesador (int cantidad) {
        this.stock=this.stock-cantidad;
    }

    //METODOS
    public void mostrarProductos(){
        System.out.println(this.nombre + " - " + this.precio+ " - " + this.velocidad + " - " + this.tipoMemoria + " - " + this.stock);
    }

}
