package proyectoalgoritmos;

import java.util.Scanner;
public class Carrito { //SE CREA EL OBJETO CARRITO
    //ATRIBUTOS
    private String nombre;
    private int precio;
    private int cantidad;
    //OBJETO SCANNER
    Scanner sc = new Scanner(System.in);
    //METODOS
    //METODO ANADIR CARRITO
    public void anadirCarritoProc(Carrito headCarrito, Carrito nuevoCarrito) {
        if (headCarrito.getPrecio()==0) {//CONDICION CREAR CARRITO
            headCarrito.setNombre(nuevoCarrito.getNombre()); //SE CAPTURA EL NOMBRE DEL PRODUCTO
            headCarrito.setPrecio(nuevoCarrito.getPrecio()); //SE CAPTURA EL PRECIO DE LOS PRODUCTOS
            headCarrito.setCantidad(nuevoCarrito.getCantidad()); //SE CAPTURA LA CANTIDAD
        } else {//SE RECORRE EL CARRITO
            Carrito pointer=headCarrito;//APUNTADOR ES IGUAL A LA CABEZA DEL CARRITO
            while (pointer.next!=null) {//CICLO PARA RECORRER
                pointer=pointer.next; //RECORRE LA LISTA HASTA EL FINAL
            }
            pointer.next=nuevoCarrito;//EL SIGUIENTE DEL ULTIMO SE HACE EL NUEVO
        }
        System.out.println("Se ha anadido al carrito con exito."); // NOTIFICA AL USUARIO
    }
    
    //METODO MOSTRAR CARRITO Y CALCULA TOTAL A PAGAR
    public void mostrarCarrito(int total,Carrito headCarrito) {
        Carrito pointer=headCarrito; //APUNTADOR ES IGUAL A LA CABEZA DEL CARRITO
        int i=1; //CONTADOR
        System.out.println("NOMBRE - PRECIO - CANTIDAD");
        while (pointer!=null) {//SE RECORRE LA LISTA HASTA EL FINAL QUEDANDOSE EN EL VACIO
            System.out.println(i+". "+pointer.getNombre()+" - "+pointer.getPrecio()+ " - " +pointer.getCantidad()); //IMPRIME LOS DATOS SELECCIONADOS POR EL USUARIO
            total=total+(pointer.getPrecio()*pointer.getCantidad());//CALCULO DE CANTIDAD
            pointer=pointer.next;//RECORRIDO DE LISTA
            i++;
        }
        System.out.println("TOTAL: "+total); //MUESTRA EL TOTAL
    }
    //METODO MOSTRAR CARRITO
    public void mostrar(Carrito headCarrito) {
        Carrito pointer=headCarrito;
        while (pointer!=null) {
            System.out.println(". "+pointer.getNombre()+" - "+pointer.getPrecio()+ " - " +pointer.getCantidad());
            pointer=pointer.next;
        }
    }
    //CONSTRUCTORES
    public Carrito () { //SIN PARAMETROS
        this.nombre="";
        this.precio=0;
        this.cantidad=0;
    }
    public Carrito (String nombre, int precio, int cantidad){// CON PARAMETROS
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //SETTERS CARRITO
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

    //GETTERS CARRITO
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }

    public Carrito next = null; //CREACION DEL NEXT

}
