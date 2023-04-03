package proyectoalgoritmos;

import java.util.Scanner;


public class ProyectoAlgoritmos {
   
    public static void main(String[] args) {
        
        //CREACION DE OBJETOS BASICOS
        Scanner sc = new Scanner(System.in);
        Menu menu1 = new Menu();
        Admin admin1 = new Admin("admin","1112","Andrés Alejandro");
        
        
        //CREACION DE OBJETOS EMPRESA
        Empresa empresa1 = new Empresa("CompuMax", "749872501568","Rionegro");
        empresa1.procesador1.setProcesador("Ryzen 5 3600",650000,6,"3.6 GHz",6,"AM4");
        empresa1.procesador2.setProcesador("Intel Core I3 9100F",350000,2,"2.8 GHz",9,"LGA 1151");
        empresa1.grafica1.setGrafica("Asus Nvidia GTX 1060", 1200000, "4 GB", 3);
        empresa1.grafica2.setGrafica("MSI RX 550", 440000, "2 GB", 8);
        empresa1.ram1.setRam("Yongxinsheng 8GB", 130000, "2400 MHz", "DDR3", 12);
        empresa1.ram2.setRam("Vengeance LPX 16GB", 250000, "3200 MHz", "DDR4", 7);
        empresa1.placa1.setPlaca("Gigabyte B450m", 510000 , "AM4", "DDR4", 5);
        empresa1.placa2.setPlaca("MSI A520m", 424000, "AM4", "DDR4", 3);
        Empresa empresa2 = new Empresa("PC Master Race","357964280156","Bogotá");
        empresa2.procesador1.setProcesador("Intel Core I5 9300H",580000, 4,"2.4 GHz",5,"LGA 1151");
        empresa2.procesador2.setProcesador( "Ryzen 5 2400g", 650000, 4,"3.4 GHz", 8, "AM4");
        empresa2.grafica1.setGrafica("MSI GTX 1050ti", 950000, "4 GB", 5);
        empresa2.grafica2.setGrafica("Gigabyte GT 710", 340000, "2 GB", 11);
        empresa2.ram1.setRam("Adata 2GB", 30000, "1333 MHz", "DDR3", 24);
        empresa2.ram2.setRam("Spectrix D41 8GB", 190000, "2666 MHz", "DDR4", 14);
        empresa2.placa1.setPlaca("Aorus X670", 2075000, "AM5", "DDR5", 2);
        empresa2.placa2.setPlaca("ROG X670e", 4060000, "AM5", "DDR5", 1);
        Empresa empresa3 = new Empresa("SoftwareUp","138057839021","Medellín");
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
        
        //INICIO DEL MENU
        do {
            menu1.tipoUsuario();
            opcion=Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Desea?");
                        System.out.println("1. Iniciar Sesión.");
                        System.out.println("2. Registrarse.");
                        opcion=Integer.parseInt(sc.nextLine());
                        switch (opcion) {
                            case 1: 
                                //------------------------------------------------------- HACER EL INICIO DE SESION
                                break;
                            case 2:
                                System.out.println("REGISTRARSE:");
                                System.out.println("Usuario: ");
                                nuevo.setUsuario(sc.nextLine());
                                System.out.println("Contrasena: ");
                                nuevo.setContra(sc.nextLine());
                                usuario1.registrarse(nuevo, head);
                                usuario1.mostrarUsuarios(head);
                                break;
                        }
                    } while (opcion!=0);
                    opcion=1;
                    break;
                    /*do {
                       menu1.IngresoCliente(empresa1,empresa2,empresa3); 
                       opcion = Integer.parseInt(sc.nextLine());
                       //INCLUIR EN CASE 1 CUANDO HAGAMOS EL INICIO DE SESION 
                       ----------------------------------------------------------ESTA PARTE DEL CODIGO SERÁ USADA MÁS ADELANTE
                    } while (opcion!=0);
                    opcion=1;
                    break;
                    */
                case 2:
                    System.out.println("Usuario:");
                    usuario=sc.nextLine();
                    System.out.println("Contrasena:");
                    contrasena=sc.nextLine();
                    
                    if (usuario.equals(admin1.getUsuario()) & contrasena.equals(admin1.getContrasena())) {
                        do {
                            menu1.IngresoAdmin(empresa1,empresa2,empresa3,admin1);
                            opcion=Integer.parseInt(sc.nextLine());
                        switch (opcion) {
                            case 1:
                                menu1.modificarEmpresa(empresa1, opcion);
                                opcion=1;    
                                break;
                            case 2:
                                menu1.modificarEmpresa(empresa2, opcion);
                                opcion=1;
                                break;    
                            case 3:
                                menu1.modificarEmpresa(empresa3, opcion);
                                opcion=1;
                                break;    
                            case 0:
                                System.out.println("Salir del menu de administrador?");
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
                        System.out.println("Usuario o contrasena invalidos, vuelva a intentarlo.");
                    }
                    break;
                case 0:
                    System.out.println("Muchas gracias, vuelva pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion!=0);
        
    }
    
}
