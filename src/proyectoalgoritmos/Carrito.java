package proyectoalgoritmos;

import java.util.Scanner;
//HACER CAMBIOS EN USUARIO
public class Carrito {
    private String nombre;
    private int precio;
    private int cantidad;
    Scanner sc = new Scanner(System.in);

    public void anadirCarritoProc(Carrito headCarrito, Carrito nuevoCarrito) {
        if (headCarrito.getPrecio()==0) {
            headCarrito.setNombre(nuevoCarrito.getNombre());
            headCarrito.setPrecio(nuevoCarrito.getPrecio());
            headCarrito.setCantidad(nuevoCarrito.getCantidad());
//ERROR EN LA MUESTRA DEL TERCER PRODUCTO DEL CARRITO, REVISAR
        } else {
            Carrito pointer=headCarrito;
            while (pointer.next!=null) {
                pointer=pointer.next;
            }
            pointer.next=nuevoCarrito;
        }
        System.out.println("Se ha anadido al carrito con exito.");
    }
     
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

    public void mostrar(Carrito headCarrito) {
        Carrito pointer=headCarrito;
        while (pointer!=null) {
            System.out.println(". "+pointer.getNombre()+" - "+pointer.getPrecio()+ " - " +pointer.getCantidad());
            pointer=pointer.next;
        }
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
