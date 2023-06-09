//ALGORITMOS Y PROGRAMACIÓN 2 - POLITECNICO JAIME ISAZA CADAVID
//PROGRAMA REALIZADO POR: 
//ALEJANDRO AMADOR RUIZ 1007480914
//ANDRÉS FELIPE MONTOYA LOPEZ 1000758778

package proyectoalgoritmos;

import java.util.Scanner;


public class ProyectoAlgoritmos {
   
    public static void main(String[] args) {
        
        //CREACION DE OBJETOS BASICOS
        Carrito headCarrito = new Carrito("",0,0);
        Carrito nuevoCarrito = new Carrito();
        Scanner sc = new Scanner(System.in);
        Menu menu1 = new Menu();
        Admin admin1 = new Admin("admin","1112","Andres Alejandro");
        
        
        //CREACION DE OBJETOS EMPRESA
        Empresa empresa1 = new Empresa("CompuMax", "749872501568","Rionegro"); // empresa 1
        empresa1.procesador1.setProcesador("Ryzen 5 3600",650000,6,"3.6 GHz",6,"AM4");
        empresa1.procesador2.setProcesador("Intel Core I3 9100F",350000,2,"2.8 GHz",9,"LGA 1151");
        empresa1.grafica1.setGrafica("Asus Nvidia GTX 1060", 1200000, "4 GB", 3);
        empresa1.grafica2.setGrafica("MSI RX 550", 440000, "2 GB", 8);
        empresa1.ram1.setRam("Yongxinsheng 8GB", 130000, "2400 MHz", "DDR3", 12);
        empresa1.ram2.setRam("Vengeance LPX 16GB", 250000, "3200 MHz", "DDR4", 7);
        empresa1.placa1.setPlaca("Gigabyte B450m", 510000 , "AM4", "DDR4", 5);
        empresa1.placa2.setPlaca("MSI A520m", 424000, "AM4", "DDR4", 3);
        Empresa empresa2 = new Empresa("PC Master Race","357964280156","Bogota"); // empresa 2
        empresa2.procesador1.setProcesador("Intel Core I5 9300H",580000, 4,"2.4 GHz",5,"LGA 1151"); 
        empresa2.procesador2.setProcesador( "Ryzen 5 2400g", 650000, 4,"3.4 GHz", 8, "AM4");
        empresa2.grafica1.setGrafica("MSI GTX 1050ti", 950000, "4 GB", 5);
        empresa2.grafica2.setGrafica("Gigabyte GT 710", 340000, "2 GB", 11);
        empresa2.ram1.setRam("Adata 2GB", 30000, "1333 MHz", "DDR3", 24);
        empresa2.ram2.setRam("Spectrix D41 8GB", 190000, "2666 MHz", "DDR4", 14);
        empresa2.placa1.setPlaca("Aorus X670", 2075000, "AM5", "DDR5", 2);
        empresa2.placa2.setPlaca("ROG X670e", 4060000, "AM5", "DDR5", 1);
        Empresa empresa3 = new Empresa("SoftwareUp","138057839021","Medellin"); // empresa 3
        empresa3.procesador1.setProcesador("AMD Athlon 3000g", 953000, 2,"3.5 GHz",7,"AM4");
        empresa3.procesador2.setProcesador( "Ryzen 7 5700G", 970000, 8,"4.6 GHz",3,"AM4");
        empresa3.grafica1.setGrafica("Sapphire Radeon 550 Pulse 2 GD5", 1097000,"2 GB", 2);
        empresa3.grafica2.setGrafica("Gygabite GTX 1650 D6 OC", 1200000, "4 GB", 5);
        empresa3.ram1.setRam("Samsung M471B1G73DB0-YK0 8GB", 70000, "1600 MHz", "DDR3", 20);
        empresa3.ram2.setRam("Kingston ValueRAM KVR24S17S8/8 8GB", 127000, "2400 MHz", "DDR4", 9);
        empresa3.placa1.setPlaca("Monster Tech H61", 250000, "LGA 1151", "DDR3", 5);
        empresa3.placa2.setPlaca("Biostar A320m", 290000, "AM4", "DDR4", 7);

        
        
        //CREAR USUARIOS CLIENTES
        Usuarios usuario1 = new Usuarios();
        usuario1.setUsuario("Alejo360");
        usuario1.setContra("0611");
        Usuarios usuario2 = new Usuarios();
        usuario2.setUsuario("Andres360");
        usuario2.setContra("1224");
        Usuarios nuevo = new Usuarios();
        
        //CREAR LA LISTA DE USUARIOS
        usuario1.next=usuario2;
        Usuarios head=usuario1;
        
        //CREACION DE VARIABLES BASICAS
        String usuario="";
        String contrasena="";
        int opcion = 0;
        boolean inicioSesion = false;
        int cantidad = 0;
        int total=0;
        
        //INICIO DEL MENU
        do {
            // MENU PRINCIPAL
            menu1.tipoUsuario();
            opcion=Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    do {
                        //MENU DE USUARIO CLIENTE
                        System.out.println("Desea?");
                        System.out.println("1. Iniciar Sesion.");
                        System.out.println("2. Registrarse.");
                        opcion=Integer.parseInt(sc.nextLine());
                        switch (opcion) {
                            case 1: 
                                // INICIO DE SESION DEL USUARIO
                                System.out.println("Ingrese su usuario:");
                                usuario=sc.nextLine();
                                System.out.println("Ingrese su contrasena:");
                                contrasena=sc.nextLine();
                                Usuarios pointer=head;
                                //SE RECORRE LA LISTA DE USUARIOS Y SE BUSCA SI ESTA REGISTRADO
                                while (pointer!=null) {
                                    if (usuario.equals(pointer.getUsuario()) && contrasena.equals(pointer.getContra())){ //
                                        inicioSesion=true; //SI LO ENCUENTRA, HACE INICIO DE SESION = TRUE
                                        break;
                                    } else {
                                        pointer=pointer.next;
                                    }
                                }
                                //SEGUN SI ES TRUE O FALSE SE INGRESA AL MENU DE USUARIO CLIENTE, ES DECIR, EL INGRESO CLIENTE, DONDE VERA LAS EMPRESAS DONDE PUEDE COMPRAR
                                if (inicioSesion) {
                                    do {
                                        System.out.println("Bienvenido, senor(a) "+usuario);
                                        menu1.IngresoCliente(empresa1,empresa2,empresa3); //MUESTRA LAS 3 EMPRESAS
                                        System.out.println("9. Ver Carrito.");
                                        System.out.println("0. Cerrar Sesion."); 
                                        opcion = Integer.parseInt(sc.nextLine());
                                        switch (opcion) {
                                            case 1: //EMPRESA 1
                                                do {
                                                    System.out.println("Ha seleccionado " + empresa1.getNombreEmpresa());
                                                    System.out.println("Estos son los productos que ofrece:");
                                                    menu1.ProductosCliente(empresa1); //MUESTRA LOS PRODUCTOS DE LA EMPRESA
                                                    opcion = Integer.parseInt(sc.nextLine());
                                                    menu1.detallesProducto(opcion, empresa1, cantidad, headCarrito, nuevoCarrito); //MUESTRA LOS DETALLES DEL PRODUCTO Y PERMITE ANADIRLOS AL CARRITO
                                                } while (opcion!=0);
                                                opcion=1;
                                                break;
                                            case 2:  //EMPRESA 2
                                                do{
                                                    System.out.println("Ha seleccionado " + empresa2.getNombreEmpresa());
                                                    System.out.println("Estos son los productos que ofrece:");
                                                    menu1.ProductosCliente(empresa2); //MUESTRA LOS PRODUCTOS DE LA EMPRESA
                                                    opcion = Integer.parseInt(sc.nextLine());
                                                    menu1.detallesProducto(opcion, empresa2, cantidad, headCarrito, nuevoCarrito); //MUESTRA LOS DETALLES DEL PRODUCTO Y PERMITE ANADIRLOS AL CARRITO
                                                } while (opcion!=0);
                                                opcion = 1;
                                                break;
                                            case 3: //EMPRESA 3
                                                do{
                                                    System.out.println("Ha seleccionado " + empresa3.getNombreEmpresa());
                                                    System.out.println("Estos son los productos que ofrece:");
                                                    menu1.ProductosCliente(empresa3); //MUESTRA LOS PRODUCTOS DE LA EMPRESA
                                                    opcion = Integer.parseInt(sc.nextLine());
                                                    menu1.detallesProducto(opcion, empresa3, cantidad, headCarrito, nuevoCarrito); //MUESTRA LOS DETALLES DEL PRODUCTO Y PERMITE ANADIRLOS AL CARRITO
                                                } while (opcion!=0);
                                                opcion = 1;
                                                break;
                                            case 9: //MOSTRAR EL CARRITO DE COMPRAS
                                                do {
                                                    System.out.println("Carrito de compras:");
                                                    headCarrito.mostrarCarrito(total, headCarrito); 
                                                    System.out.println("1. Comprar Carrito.");
                                                    System.out.println("2. Vaciar Carrito.");
                                                    System.out.println("0. Regresar.");
                                                    opcion= Integer.parseInt(sc.nextLine());
                                                    switch (opcion) {
                                                        case 1: //SI LO COMPRA, SE ELIMINA Y SE DA EL MENSAJE DE QUE HA SIDO COMPRADO
                                                            System.out.println("Carrito comprado, llegara en los proximos dias a su residencia.");
                                                            headCarrito.next=null;
                                                            headCarrito.setCarrito("", 0, 0);
                                                            break;
                                                        case 2: //SI LO ELIMINA, SE ELIMINAN TODOS LOS PRODUCTOS DEL CARRITO
                                                            System.out.println("Carrito eliminado");
                                                            headCarrito.next=null;
                                                            headCarrito.setCarrito("", 0, 0);
                                                            break;
                                                        case 0:
                                                            opcion=0;   
                                                            break;                                             
                                                        default:
                                                            break;
                                                    }
                                                } while (opcion!=0);
                                                opcion=1;
                                                break;
                                            case 0: //CIERRE DE SESION
                                                System.out.println("Cerrar sesion?"); //MENSAJE DE CONFIRMACION
                                                System.out.println("1. Si.");
                                                System.out.println("2. No.");
                                                opcion=Integer.parseInt(sc.nextLine());
                                                switch (opcion) { 
                                                    case 1: //SI SALE, SE ELIMINA EL CARRITO
                                                        opcion=0;
                                                        headCarrito.next=null;
                                                        headCarrito.setCarrito("", 0, 0);
                                                        break;
                                                    case 2:
                                                        opcion=1;
                                                        break;
                                                    default:
                                                        System.out.println("Opcion invalida.");
                                                        opcion=1;
                                                        break;
                                                }  
                                                break;
                                            default:
                                                System.out.println("Opcion invalida");
                                                break;
                                        }
                                    } while (opcion!=0);
                                    opcion=1;
                                    break;
                                }else{ //SI NO ES ENCONTRADO EN LA LISTA DE USUARIOS, SE LE NOTIFICA QUE PUEDE QUE NO ESTE REGISTRADO
                                    System.out.println("Lamentamos informarle que no puede iniciar sesion ya que no esta registrado o sus credenciales no coinciden.");
                                }
                                break;
                            case 2: //REGISTRARSE
                                System.out.println("REGISTRARSE:");
                                System.out.println("Usuario: ");
                                nuevo.setUsuario(sc.nextLine()); //SE DA UN USUARIO AL NUEVO USUARIO
                                System.out.println("Contrasena: ");
                                nuevo.setContra(sc.nextLine()); // Y UNA CONTRASENA AL NUEVO USUARIO
                                usuario1.registrarse(nuevo, head); //SE REGISTRA EL NUEVO USUARIO EN LA LISTA DE USUARIOS
                                //usuario1.mostrarUsuarios(head);
                                break;
                        }
                    } while (opcion!=0);
                    opcion=1;
                    break;
                case 2: //OPCION DE ENTRAR COMO ADMINISTRADOR
                    System.out.println("Usuario:");
                    usuario=sc.nextLine();
                    System.out.println("Contrasena:");
                    contrasena=sc.nextLine();
                    
                    if (usuario.equals(admin1.getUsuario()) & contrasena.equals(admin1.getContrasena())) { // SI SE CUMPLE (PUES SOLO HAY UN ADMINISTRADOR), INGRESA AL MENU DE ADMINISTRADOR
                        do {
                            menu1.IngresoAdmin(empresa1,empresa2,empresa3,admin1); //SE MUESTRA DICHO MENU
                            opcion=Integer.parseInt(sc.nextLine());
                        switch (opcion) {
                            case 1:
                                menu1.modificarEmpresa(empresa1, opcion);   //SE MUESTRAN LAS POSIBLES MODIFICACIONES DE LA EMPRESA
                                opcion=1;    
                                break;
                            case 2:
                                menu1.modificarEmpresa(empresa2, opcion);   //SE MUESTRAN LAS POSIBLES MODIFICACIONES DE LA EMPRESA
                                opcion=1;
                                break;    
                            case 3:
                                menu1.modificarEmpresa(empresa3, opcion);   //SE MUESTRAN LAS POSIBLES MODIFICACIONES DE LA EMPRESA
                                opcion=1;
                                break;    
                            case 0: //CIERRE DE SESION DE ADMINISTRADOR 
                                System.out.println("Salir del menu de administrador?"); //SE MUESTRA UN MENSAJE DE CONFIRMACION
                                System.out.println("1. SI.");
                                System.out.println("2. NO.");
                                opcion=Integer.parseInt(sc.nextLine());
                                switch (opcion) {
                                    case 1:
                                        opcion=0;
                                        break;
                                    case 2:
                                        opcion=1;
                                        break;
                                    default:
                                        System.out.println("Opcion invalida.");
                                        opcion=1;
                                        break;
                                }  
                                break;
                        }
                    } while (opcion!=0);
                    opcion=1;
                    }
                    else { 
                        System.out.println("Usuario o contrasena invalidos, vuelva a intentarlo.");         //SI NO INGRESA BIEN EL ADMINISTRADOR, SE NOTIFICA
                    }
                    break;
                case 0:
                    System.out.println("Muchas gracias, vuelva pronto."); //MENSAJE DE DESPEDIDA
                    break;
                default:
                    System.out.println("Opcion no valida"); //MENSAJE DEFAULT
                    break;
            }
        } while (opcion!=0);        //SE CIERRA LA ITERACION DEL MENU

        
    }
    
}
