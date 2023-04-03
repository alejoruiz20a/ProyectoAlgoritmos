package proyectoalgoritmos;

public class Empresa {
    //ASOCIACION CON CLASES DE PRODUCTOS
    public Procesador procesador1 = new Procesador();
    public Procesador procesador2 = new Procesador();
    public Grafica grafica1 = new Grafica();
    public Grafica grafica2 = new Grafica();
    public Ram ram1 = new Ram();
    public Ram ram2 = new Ram();
    public Placa placa1 = new Placa();
    public Placa placa2 = new Placa();

    //ATRIBUTOS
    private String nombreEmpresa;
    private String NIT;
    private String ubicacion;
    
    //METODOS CONSTRUCTORES
    public Empresa () {
        this.nombreEmpresa="";
        this.NIT="";
        this.ubicacion="";
    }
    public Empresa (String nombre, String NIT, String ubicacion){
        this.nombreEmpresa=nombre;
        this.NIT=NIT;
        this.ubicacion=ubicacion;
    }
    // SETTERS
    public void setEmpresa (String nombre, String NIT, String ubicacion){ //SETTER PRINCIPAL
        this.nombreEmpresa=nombre;
        this.NIT=NIT;
        this.ubicacion=ubicacion;
    }
    public void setNombreEmpresa (String nombre) { //NOMBRE
        this.nombreEmpresa=nombre;
    }
    public void setNIT (String NIT) { //NIT
        this.NIT=NIT;
    }
    public void setUbicacion (String ubicacion) { //UBICACION
        this.ubicacion=ubicacion;
    }
    //GETTERS
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public String getNIT() {
        return NIT;
    }
    public String getUbicacion() {
        return ubicacion;
    }

    //METODOS
    public void imprimirEmpresa() {
        System.out.println(this.nombreEmpresa+" - "+this.NIT+" - "+this.ubicacion);
    }

}
