package proyectoalgoritmos;
import java.util.Scanner;

public class Menu {
    //SE CREAN ASOCIACIONES
    
    public Scanner sc = new Scanner(System.in);

    
    //MENU PRINCIPAL DEL PROGRAMA
    public void tipoUsuario () {
        System.out.println("BIENVENIDO A LA TIENDA VIRTUAL DE COMPONENTES DE PC");
        System.out.println("Con que tipo de usuario desea ingresar?");
        System.out.println("1. Usuario Cliente.");
        System.out.println("2. Usuario Administrador.");
        System.out.println("0. Salir.");
    }
    
    //MENU DE CLIENTE AL INICIAR SESION, MUESTRA LAS EMPRESAS EN LAS QUE PUEDE COMPRAR
    public void IngresoCliente (Empresa empresa1,Empresa empresa2, Empresa empresa3){
        System.out.println("En que empresa desea comprar?");
        System.out.println("1. "+empresa1.getNombreEmpresa()); 
        System.out.println("2. "+empresa2.getNombreEmpresa());
        System.out.println("3. "+empresa3.getNombreEmpresa());
    }
    
    //MENU PRINCIPAL DEL ADMINISTRADOR
    public void IngresoAdmin(Empresa empresa1,Empresa empresa2, Empresa empresa3,Admin admin){
        System.out.println("Bienvenido senor(a) "+admin.getNombre()+":");
        System.out.println("1. Modificar "+empresa1.getNombreEmpresa());
        System.out.println("2. Modificar "+empresa2.getNombreEmpresa());
        System.out.println("3. Modificar "+empresa3.getNombreEmpresa());
        System.out.println("0. Regresar.");
    }

    //MUESTRA LOS PRODUCTOS DE LA EMPRESA QUE SE LE ENTREGUE
    public void ProductosCliente(Empresa empresa1){
        System.out.println("1. " +empresa1.procesador1.getNombreProcesador());
        System.out.println("2. " +empresa1.procesador2.getNombreProcesador());
        System.out.println("3. " +empresa1.grafica1.getNombre());
        System.out.println("4. " +empresa1.grafica2.getNombre());
        System.out.println("5. " +empresa1.ram1.getNombre());
        System.out.println("6. " +empresa1.ram2.getNombre());
        System.out.println("7. " +empresa1.placa1.getNombre());
        System.out.println("8. " +empresa1.placa2.getNombre());
        System.out.println("0. Regresar" );
    }
    
    //METODO MODIFICAR EMPRESA
    public void modificarEmpresa(Empresa empresa,int opcion){
        do {
            System.out.println("NOMBRE - NIT - UBICACION");
            empresa.imprimirEmpresa();
            System.out.println("1. Modificar Nombre.");
            System.out.println("2. Modificar NIT.");
            System.out.println("3. Modificar Ubicacion.");
            System.out.println("4. Modificar Productos.");
            System.out.println("0. Regresar.");
            opcion=Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre de la empresa: ");
                    empresa.setNombreEmpresa(sc.nextLine()); //CAMBIO DE NOMBRE EMPRESA
                    break;  
                case 2:
                    System.out.println("Ingrese el nuevo NIT de la empresa: ");
                    empresa.setNIT(sc.nextLine()); //CAMBIO DE NIT EMPRESA
                    break;
                case 3:
                    System.out.println("Ingrese la nueva ubicacion de la empresa: ");
                    empresa.setUbicacion(sc.nextLine()); //CAMBIO DE UBICACION EMPRESA
                    break;
                //AL FINAL LOS MUESTRA CON CAMBIOS EFECTUADOS
                case 4:
                    do {
                        System.out.println("Ingrese que productos desea modificar: ");
                        System.out.println("1. Procesadores.");
                        System.out.println("2. Graficas.");
                        System.out.println("3. RAMs.");
                        System.out.println("4. Placas madre.");
                        System.out.println("5. Regresar.");
                        opcion=Integer.parseInt(sc.nextLine());
                        switch (opcion) {
                            case 1:
                                do{
                                    System.out.println("Modificando Procesadores de "+empresa.getNombreEmpresa()+":");
                                    System.out.println("NOMBRE - PRECIO - NUCLEOS - VELOCIDAD - SOCKET - STOCK ");
                                    System.out.print("1. ");
                                    empresa.procesador1.mostrarProductos(); //MOSTRAR PROCESADOR1
                                    System.out.print("2. ");
                                    empresa.procesador2.mostrarProductos(); //MOSTRAR PROCESADOR2
                                    System.out.println("0. Regresar.");
                                    opcion=Integer.parseInt(sc.nextLine());
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("Ingrese el nuevo nombre del Procesador:");
                                            empresa.procesador1.setNombre(sc.nextLine()); //CAMBIO NONBRE PROCESADOR
                                            System.out.println("Ingrese el nuevo precio del Procesador:");
                                            empresa.procesador1.setPrecio(Integer.parseInt(sc.nextLine())); //CAMBIO PRECIO PROCESADOR
                                            System.out.println("Ingrese el nuevo nucleo del Procesador:");
                                            empresa.procesador1.setNucleos(Integer.parseInt(sc.nextLine())); //CAMBIO NUCLEO PROCESADOR
                                            System.out.println("Ingrese la nueva velocidad del Procesador");
                                            empresa.procesador1.setVelocidad(sc.nextLine()); //CAMBIO VELOCIDAD PROCESADOR
                                            System.out.println("Ingrese el nuevo Socket del Procesador:");
                                            empresa.procesador1.setsocket(sc.nextLine()); //CAMBIO SOCKET PROCESADOR
                                            System.out.println("Ingrese el nuevo stock del Procesador:");
                                            empresa.procesador1.setStock(Integer.parseInt(sc.nextLine())); //CAMBIO STOCK PROCESADOR
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo nombre del Procesador:");
                                            empresa.procesador2.setNombre(sc.nextLine()); //CAMBIO NOMBRE PROCESADOR
                                            System.out.println("Ingrese el nuevo precio del Procesador:");
                                            empresa.procesador2.setPrecio(Integer.parseInt(sc.nextLine())); //CAMBIO PRECIO PROCESADOR
                                            System.out.println("Ingrese el nuevo nucleo del Procesador:");
                                            empresa.procesador2.setNucleos(Integer.parseInt(sc.nextLine())); //CAMBIO NUCLEO PROCESADOR
                                            System.out.println("Ingrese la nueva velocidad del Procesador");
                                            empresa.procesador2.setVelocidad(sc.nextLine()); //CAMBIO VELOCIDAD PROCESADOR
                                            System.out.println("Ingrese el nuevo Socket del Procesador:");
                                            empresa.procesador2.setsocket(sc.nextLine()); //CAMBIO SOCKET PROCESADOR
                                            System.out.println("Ingrese el nuevo stock del Procesador:");
                                            empresa.procesador2.setStock(Integer.parseInt(sc.nextLine())); //CAMBIO STOCK PROCESADOR
                                            break;
                                        case 0: 
                                            break;
                                        default:      
                                            System.out.println("Opcion invalida.");
                                            break;   
                                    } 
                                } while (opcion!=0);
                                opcion=1;
                                break;
                            case 2:   
                                do{
                                    System.out.println("Modificando Graficas de "+empresa.getNombreEmpresa()+":");
                                    System.out.println("NOMBRE - PRECIO - VRAM - STOCK");
                                    System.out.print("1. ");
                                    empresa.grafica1.mostrarProductos(); //MOSTRAR GRAFICA1
                                    System.out.print("2. ");
                                    empresa.grafica2.mostrarProductos(); //MOSTRAR GRAFICA2
                                    System.out.println("0. Regresar.");
                                    opcion=Integer.parseInt(sc.nextLine());
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("Ingrese el nuevo nombre de la grafica:");
                                            empresa.grafica1.setNombre(sc.nextLine()); //CAMBIO NOMBRE GRAFICA
                                            System.out.println("Ingrese el nuevo precio de la grafica:");
                                            empresa.grafica1.setPrecio(Integer.parseInt(sc.nextLine())); //CAMBIO PRECIO GRAFICA
                                            System.out.println("Ingrese el nuevo Vram de la grafica:");
                                            empresa.grafica1.setVram(sc.nextLine()); //CAMBIO VRAM GRAFICA
                                            System.out.println("Ingrese el nuevo stock de la grafica:");
                                            empresa.grafica1.setStock(Integer.parseInt(sc.nextLine())); //CAMBIO STOCK GRAFICA
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo nombre de la grafica:");
                                            empresa.grafica2.setNombre(sc.nextLine()); //CAMBIO NOMBRE GRAFICA
                                            System.out.println("Ingrese el nuevo precio de la grafica:");
                                            empresa.grafica2.setPrecio(Integer.parseInt(sc.nextLine())); //CAMBIO PRECIO GRAFICA
                                            System.out.println("Ingrese el nuevo Vram de la grafica:");
                                            empresa.grafica2.setVram(sc.nextLine()); //CAMBIO VRAM GRAFICA
                                            System.out.println("Ingrese el nuevo stock de la grafica:");
                                            empresa.grafica2.setStock(Integer.parseInt(sc.nextLine())); //CAMBIO STOCK GRAFICA
                                            break;
                                        case 0: 
                                            break;
                                        default:      
                                            System.out.println("Opcion invalida.");
                                            break;      
                                    }        
                                } while (opcion!=0);
                                opcion=1;
                                break;            
                            case 3:
                                do{
                                    System.out.println("Modificando Memorias RAM de "+empresa.getNombreEmpresa()+":");
                                    System.out.println("NOMBRE - PRECIO - VELOCIDAD - TIPOMEMORIA - STOCK ");
                                    System.out.print("1. ");
                                    empresa.ram1.mostrarProductos(); //MOSTRAR RAM1
                                    System.out.print("2. ");
                                    empresa.ram2.mostrarProductos(); //MOSTRAR RAM2
                                    System.out.println("0. Regresar.");
                                    opcion=Integer.parseInt(sc.nextLine());
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("Ingrese el nuevo nombre de la RAM:");
                                            empresa.ram1.setNombre(sc.nextLine()); //CAMBIO NOMBRE RAM
                                            System.out.println("Ingrese el nuevo precio de la RAM:");
                                            empresa.ram1.setPrecio(Integer.parseInt(sc.nextLine())); //CAMBIO PRECIO RAM
                                            System.out.println("Ingrese la nueva velocidad de la RAM:");
                                            empresa.ram1.setVelocidad(sc.nextLine()); //CAMBIO VELOCIDAD RAM
                                            System.out.println("Ingrese el nuevo tipo de memoria de la RAM");
                                            empresa.ram1.setTipoMemoria(sc.nextLine()); //CAMBIO TIPO DE MEMORIA RAM
                                            System.out.println("Ingrese el nuevo stock de la RAM:");
                                            empresa.ram1.setStock(Integer.parseInt(sc.nextLine())); //CAMBIO STOCK RAM
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo nombre de la RAM:");
                                            empresa.ram2.setNombre(sc.nextLine());
                                            System.out.println("Ingrese el nuevo precio de la RAM:");
                                            empresa.ram2.setPrecio(Integer.parseInt(sc.nextLine()));
                                            System.out.println("Ingrese la nueva velocidad de la RAM:");
                                            empresa.ram2.setVelocidad(sc.nextLine());
                                            System.out.println("Ingrese el nuevo tipo de memoria de la RAM");
                                            empresa.ram2.setTipoMemoria(sc.nextLine());
                                            System.out.println("Ingrese el nuevo stock de la RAM:");
                                            empresa.ram2.setStock(Integer.parseInt(sc.nextLine()));
                                            break;
                                        case 0: 
                                            break;
                                        default:      
                                            System.out.println("Opcion invalida.");
                                            break;   
                                    }
                                } while (opcion!=0);    
                                opcion=1;
                                break;
                            case 4:
                                do{
                                    System.out.println("Modificando Placas Madre de "+empresa.getNombreEmpresa()+":");
                                    System.out.println("NOMBRE - PRECIO - SOCKET - TIPOMEMORIA - STOCK ");
                                    System.out.println("1. ");
                                    empresa.placa1.mostrarProductos(); //MOSTRAR PLACA1
                                    System.out.println("2. ");
                                    empresa.placa2.mostrarProductos(); //MOSTRAR PLACA2
                                    System.out.println("0. Regresar.");
                                    opcion=Integer.parseInt(sc.nextLine());
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("Ingrese el nuevo nombre de la placa madre:");
                                            empresa.placa1.setNombre(sc.nextLine()); //CAMBIO NOMBRE PLACA
                                            System.out.println("Ingrese el nuevo precio de la placa madre:");
                                            empresa.placa1.setPrecio(Integer.parseInt(sc.nextLine())); //CAMBIO PRECIO PLACA
                                            System.out.println("Ingrese el nuevo socket de la placa madre:");
                                            empresa.placa1.setsocket(sc.nextLine()); //CAMBIO SOCKET PLACA
                                            System.out.println("Ingrese el nuevo tipo de memoria de la placa madre");
                                            empresa.placa1.setTipoMemoria(sc.nextLine()); //CAMBIO TIPO DE MEMORIA PLACA
                                            System.out.println("Ingrese el nuevo stock de la placa madre:");
                                            empresa.placa1.setStock(Integer.parseInt(sc.nextLine())); //CAMBIO STOCK PLACA
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo nombre de la placa madre:");
                                            empresa.placa2.setNombre(sc.nextLine());
                                            System.out.println("Ingrese el nuevo precio de la placa madre:");
                                            empresa.placa2.setPrecio(Integer.parseInt(sc.nextLine()));
                                            System.out.println("Ingrese el nuevo socket de la placa madre:");
                                            empresa.placa2.setsocket(sc.nextLine());
                                            System.out.println("Ingrese el nuevo tipo de memoria de la placa madre");
                                            empresa.placa2.setTipoMemoria(sc.nextLine());
                                            System.out.println("Ingrese el nuevo stock de la placa madre:");
                                            empresa.placa2.setStock(Integer.parseInt(sc.nextLine()));
                                            break;
                                        case 0: 
                                            break;
                                        default:      
                                            System.out.println("Opcion invalida.");
                                            break;   
                                    }
                                } while (opcion!=0);    
                                opcion=1;
                                break;
                            case 0: 
                                break;
                            default:      
                                System.out.println("Opcion invalida.");
                                break; 
                        }               
                    } while (opcion!=0);
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;   
            } 
        } while (opcion!=0);                  
    }
    

    

    
    //CLASE QUE MUESTRA LOS DETALLES DE CADA PRODUCTO Y PERMITE ANADIRLOS AL CARRITO
    public void detallesProducto(int opcion, Empresa empresa, int cantidad,Carrito headCarrito,Carrito nuevoCarrito) {
        switch (opcion) {
            case 1: //OPCION DEPENDIENTE DE QUE PRODUCTO ELIJA EL USUARIO
                empresa.procesador1.detallesProducto(); //MUESTRA LOS DETALLES DEL PRODUCTO
                System.out.println("1. Anadir al carrito.");
                System.out.println("0. Regresar.");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1: //SI SE ELIJE ANADIR AL CARRITO...
                        System.out.println("Ingrese la cantidad que desea comprar: ");
                        cantidad=Integer.parseInt(sc.nextLine());                       //SE INGRESA UNA CANTIDAD QUE SE DESEA COMPRAR
                        if (cantidad>empresa.procesador1.getStock()) { //SI LA CANTIDAD ES MAYOR AL STOCK...
                            System.out.println("Stock insuficiente, se ajusto al maximo;");
                            cantidad=empresa.procesador1.getStock();//SE AJUSTA AL MAXIMO DE STOCK
                            nuevoCarrito.setNombre(empresa.procesador1.getNombreProcesador());  //SE GUARDA EL NOMBRE DEL PRODUCTO EN NUEVO CARRITO
                            nuevoCarrito.setPrecio(empresa.procesador1.getPrecio());            //SE GUARDA EL PRECIO DEL PRODUCTO EN NUEVO CARRITO 
                            nuevoCarrito.setCantidad(cantidad);                                 //SE GUARDA LA CANTIDAD DEL PRODUCTO EN EL NUEVO CARRITO
                            empresa.procesador1.venderProcesador(cantidad);                     //SE EJECUTA EL METODO QUE RESTA LA CANTIDAD AL STOCK
                            headCarrito.anadirCarritoProc(headCarrito, nuevoCarrito);           //Y POR ULTIMO SE ANADE EL NUEVO CARRITO A LA LISTA DE OBJETOS DEL CARRITO
                        }else if (cantidad <= 0) { //SI LA CANTIDAD ES MENOR A CERO
                            System.out.println("Cantida invalida.");
                            cantidad=0; //SE NOTIFICA QUE ES INVALIDA Y SE IGUALA A CERO
                        }
                        else { // SI NO SE CUMPLE NINGUNA DE LAS ANTERIORES CONDICIONES, SIMPLEMENTE SE ANADE DE FORMA NORMAL
                            nuevoCarrito.setNombre(empresa.procesador1.getNombreProcesador());  //SE GUARDA EL NOMBRE DEL PRODUCTO EN NUEVO CARRITO
                            nuevoCarrito.setPrecio(empresa.procesador1.getPrecio());            //SE GUARDA EL PRECIO DEL PRODUCTO EN NUEVO CARRITO 
                            nuevoCarrito.setCantidad(cantidad);                                 //SE GUARDA LA CANTIDAD DEL PRODUCTO EN EL NUEVO CARRITO
                            empresa.procesador1.venderProcesador(cantidad);                     //SE EJECUTA EL METODO QUE RESTA LA CANTIDAD AL STOCK
                            headCarrito.anadirCarritoProc (headCarrito, nuevoCarrito);          //Y POR ULTIMO SE ANADE EL NUEVO CARRITO A LA LISTA DE OBJETOS DEL CARRITO
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcion invalida."); 
                        break;       
                }
                break;
            case 2:
                empresa.procesador2.detallesProducto();
                System.out.println("1. Anadir al carrito.");
                System.out.println("0. Regresar.");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad que desea comprar: ");
                        cantidad=Integer.parseInt(sc.nextLine());
                        if (cantidad>empresa.procesador2.getStock()) {
                            System.out.println("Stock insuficiente, se ajusto al maximo;");
                            cantidad=empresa.procesador2.getStock();
                            nuevoCarrito.setNombre(empresa.procesador2.getNombreProcesador());
                            nuevoCarrito.setPrecio(empresa.procesador2.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.procesador2.venderProcesador(cantidad);
                            headCarrito.anadirCarritoProc(headCarrito, nuevoCarrito);
                        }else if (cantidad <= 0) {
                            System.out.println("Cantida invalida.");
                            cantidad=0;
                        }
                        else {
                            nuevoCarrito.setNombre(empresa.procesador2.getNombreProcesador());
                            nuevoCarrito.setPrecio(empresa.procesador2.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.procesador2.venderProcesador(cantidad);
                            headCarrito.anadirCarritoProc (headCarrito, nuevoCarrito);
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcion invalida."); 
                        break;       
                }
                break;
            case 3:
                empresa.grafica1.detallesProducto();
                System.out.println("1. Anadir al carrito.");
                System.out.println("0. Regresar.");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad que desea comprar: ");
                        cantidad=Integer.parseInt(sc.nextLine());
                        if (cantidad>empresa.grafica1.getStock()) {
                            System.out.println("Stock insuficiente, se ajusto al maximo;");
                            cantidad=empresa.grafica1.getStock();
                            nuevoCarrito.setNombre(empresa.grafica1.getNombre());
                            nuevoCarrito.setPrecio(empresa.grafica1.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.grafica1.venderGrafica(cantidad);
                            headCarrito.anadirCarritoProc(headCarrito, nuevoCarrito);
                        }else if (cantidad <= 0) {
                            System.out.println("Cantida invalida.");
                            cantidad=0;
                        }
                        else {
                            nuevoCarrito.setNombre(empresa.grafica1.getNombre());
                            nuevoCarrito.setPrecio(empresa.grafica1.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.grafica1.venderGrafica(cantidad);
                            headCarrito.anadirCarritoProc (headCarrito, nuevoCarrito);
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcion invalida."); 
                        break;       
                }
                break;
            case 4:
                empresa.grafica2.detallesProducto();
                System.out.println("1. Anadir al carrito.");
                System.out.println("0. Regresar.");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad que desea comprar: ");
                        cantidad=Integer.parseInt(sc.nextLine());
                        if (cantidad>empresa.grafica2.getStock()) {
                            System.out.println("Stock insuficiente, se ajusto al maximo;");
                            cantidad=empresa.grafica2.getStock();
                            nuevoCarrito.setNombre(empresa.grafica2.getNombre());
                            nuevoCarrito.setPrecio(empresa.grafica2.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.grafica2.venderGrafica(cantidad);
                            headCarrito.anadirCarritoProc(headCarrito, nuevoCarrito);
                        }else if (cantidad <= 0) {
                            System.out.println("Cantida invalida.");
                            cantidad=0;
                        }
                        else {
                            nuevoCarrito.setNombre(empresa.grafica2.getNombre());
                            nuevoCarrito.setPrecio(empresa.grafica2.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.grafica2.venderGrafica(cantidad);
                            headCarrito.anadirCarritoProc (headCarrito, nuevoCarrito);
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcion invalida."); 
                        break;       
                }
                break;
            case 5:
                empresa.ram1.detallesProducto();
                System.out.println("1. Anadir al carrito.");
                System.out.println("0. Regresar.");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad que desea comprar: ");
                        cantidad=Integer.parseInt(sc.nextLine());
                        if (cantidad>empresa.ram1.getStock()) {
                            System.out.println("Stock insuficiente, se ajusto al maximo;");
                            cantidad=empresa.ram1.getStock();
                            nuevoCarrito.setNombre(empresa.ram1.getNombre());
                            nuevoCarrito.setPrecio(empresa.ram1.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.ram1.venderRam(cantidad);
                            headCarrito.anadirCarritoProc(headCarrito, nuevoCarrito);
                        }else if (cantidad <= 0) {
                            System.out.println("Cantida invalida.");
                            cantidad=0;
                        }
                        else {
                            nuevoCarrito.setNombre(empresa.ram1.getNombre());
                            nuevoCarrito.setPrecio(empresa.ram1.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.ram1.venderRam(cantidad);
                            headCarrito.anadirCarritoProc (headCarrito, nuevoCarrito);
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcion invalida."); 
                        break;       
                }
                break;
            case 6:
                empresa.ram2.detallesProducto();
                System.out.println("1. Anadir al carrito.");
                System.out.println("0. Regresar.");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad que desea comprar: ");
                        cantidad=Integer.parseInt(sc.nextLine());
                        if (cantidad>empresa.ram2.getStock()) {
                            System.out.println("Stock insuficiente, se ajusto al maximo;");
                            cantidad=empresa.ram2.getStock();
                            nuevoCarrito.setNombre(empresa.ram2.getNombre());
                            nuevoCarrito.setPrecio(empresa.ram2.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.ram2.venderRam(cantidad);
                            headCarrito.anadirCarritoProc(headCarrito, nuevoCarrito);
                        }else if (cantidad <= 0) {
                            System.out.println("Cantida invalida.");
                            cantidad=0;
                        }
                        else {
                            nuevoCarrito.setNombre(empresa.ram2.getNombre());
                            nuevoCarrito.setPrecio(empresa.ram2.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.ram2.venderRam(cantidad);
                            headCarrito.anadirCarritoProc (headCarrito, nuevoCarrito);
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcion invalida."); 
                        break;       
                }
                break;
            case 7:
                empresa.placa1.detallesProducto();
                System.out.println("1. Anadir al carrito.");
                System.out.println("0. Regresar.");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad que desea comprar: ");
                        cantidad=Integer.parseInt(sc.nextLine());
                        if (cantidad>empresa.placa1.getStock()) {
                            System.out.println("Stock insuficiente, se ajustó al maximo;");
                            cantidad=empresa.placa1.getStock();
                            nuevoCarrito.setNombre(empresa.placa1.getNombre());
                            nuevoCarrito.setPrecio(empresa.placa1.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.placa1.venderPlaca(cantidad);
                            headCarrito.anadirCarritoProc(headCarrito, nuevoCarrito);
                        }else if (cantidad <= 0) {
                            System.out.println("Cantida invalida.");
                            cantidad=0;
                        }
                        else {
                            nuevoCarrito.setNombre(empresa.placa1.getNombre());
                            nuevoCarrito.setPrecio(empresa.placa1.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.placa1.venderPlaca(cantidad);
                            headCarrito.anadirCarritoProc(headCarrito, nuevoCarrito);
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcion invalida."); 
                        break;       
                }
                break;
            case 8:
                empresa.placa2.detallesProducto();
                System.out.println("1. Anadir al carrito.");
                System.out.println("0. Regresar.");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad que desea comprar: ");
                        cantidad=Integer.parseInt(sc.nextLine());
                        if (cantidad>empresa.placa2.getStock()) {
                            System.out.println("Stock insuficiente, se ajusto al maximo;");
                            cantidad=empresa.placa2.getStock();
                            nuevoCarrito.setNombre(empresa.placa2.getNombre());
                            nuevoCarrito.setPrecio(empresa.placa2.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.placa2.venderPlaca(cantidad);
                            headCarrito.anadirCarritoProc(headCarrito, nuevoCarrito);
                        }else if (cantidad <= 0) {
                            System.out.println("Cantida invalida.");
                            cantidad=0;
                        }
                        else {
                            nuevoCarrito.setNombre(empresa.placa2.getNombre());
                            nuevoCarrito.setPrecio(empresa.placa2.getPrecio());
                            nuevoCarrito.setCantidad(cantidad);
                            empresa.placa2.venderPlaca(cantidad);
                            headCarrito.anadirCarritoProc (headCarrito, nuevoCarrito);
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcion invalida."); 
                        break;       
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }

    
}
