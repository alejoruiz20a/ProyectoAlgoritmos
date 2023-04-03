package proyectoalgoritmos;

public class Carrito {
    private String nombre;
    private int precio;
    private int cantidad;

    public void anadirCarritoProc(Carrito headCarrito, Carrito nuevoCarrito) {
        Carrito pointer=headCarrito;
        if (pointer==null) {
            pointer=nuevoCarrito;
            headCarrito=pointer;
        } else {
            while (pointer.next!=null) {
                pointer=pointer.next;
            }
            pointer.next=nuevoCarrito;
        }
    }
    //ERROR EN EL CARRITO, REVISAR
    public void mostrarCarrito(int total,Carrito headCarrito) {
        Carrito pointer=headCarrito;
        int i=1;
        System.out.println("NOMBRE - PRECIO - CANTIDAD");
        while (pointer!=null) {
            System.out.println(i+". "+pointer.getNombre()+" - "+pointer.getPrecio()+ " - " +pointer.getCantidad());
            total=total+(pointer.getPrecio()*pointer.getCantidad());
            pointer=pointer.next;
            i++;
        }
        System.out.println("TOTAL: "+total);
    }

    public Carrito () {
        this.nombre="";
        this.precio=0;
        this.cantidad=0;
    }
    public Carrito (String nombre, int precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void setCarrito(String nombre, int precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }

    public Carrito next = null;

}