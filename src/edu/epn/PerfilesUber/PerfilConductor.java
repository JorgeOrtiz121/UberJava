package edu.epn.PerfilesUber;

import edu.epn.Archivos.MakeReportAutos;
import edu.epn.Archivos.MakeReportCalificaciones;
import edu.epn.Archivos.MakeReportConductor;
import edu.epn.AutosVehiculosUber.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * En esta clase se destaca la utilizacion de 2 arrayslist donde contendra los elementos de la clase Conductor
 * con su nueva variable tipo objeto
 */
public class PerfilConductor {
    /**
     * Estos 2 arraylist estan de formato estatico para que sus elementos puedan permanecer
     * con sus respectiva informacion y se puedan actualizar.
     */
    static public ArrayList<Conductor> usuariosConductores = new ArrayList<Conductor>();
    static public ArrayList<Conductor> usuarctores = new ArrayList<>();

    public void PErfilUsuario(){
        /**
         * En este metodo se crea los nuevos objetos de los 3 capos que son VehiculoDeportivo,VehiculoFamiliar
         * y Bustrans donde se podra aplicar toda su informacion al momento de agregarla al arraylist.
         * Se mencionara que se crea nuevas variables edad,aforo y precio para poder introducirlo en el registro del
         * auto del conductor.
         */
        AutoDeportivo autoDeportivo=new AutoDeportivo();
        VehiculoFamiliar vehiculoFamiliar=new VehiculoFamiliar();
        BusTrans busTrans=new BusTrans();
        String user,apellido,password,genero,marca,modelo,marca1,modelo1,marca2,modelo2;
        AutosUber autoAux = new AutosUber();
         AutosUber autoAux2=new AutosUber();
         AutosUber autoAux3=new AutosUber();
        int edad,aforo,aforo1,aforo2;
        double precio,precio1,precio2;
        /**
         * Se crea unn menu dinamico donde contiene 3 opciones, se debe iniciar con la opcion 1 de crear el auto
         * al momento de inicar el programa no existe informacion de vehiculos
         * La opcion 2 es para inicar sesion con los datos registrados y que sean validados
         * La opcion 3 Para generar una base de datos que son los ficheros en formato txt.
         */
        Scanner sc = new Scanner(System.in);
        int salir;
        do {
            System.out.println("1.Registro del Conductor ");
            System.out.println("2.Inicio de Sesion del Conductor");
            System.out.println("3 Crear base de datos");
            System.out.println("0.Salir");
            salir = sc.nextInt();
            switch (salir) {
                case 1:

                    /**
                     * Informacion Personal del conductor a que se va a introducir
                     */
                    do{
                        System.out.println("Ingrese el usuario del Conductor");
                        user = sc.next();
                        System.out.println("Ingrese el apellido del Conductor ");
                        apellido = sc.next();
                        System.out.println("Ingrese la contraseña");
                        password = sc.next();
                        System.out.println("Ingrese el sexo");
                        genero = sc.next();
                        System.out.println("Ingrese su edad [20-50])");
                        edad=sc.nextInt();
                    if (edad < 20 ) {
                        System.out.println("Uber no acepta edades memores a 20");

                    }else if (edad > 50){
                        System.out.println("Uber no acepta edades mayores de 50 años");
                    }

                    } while (edad < 20 || edad >50);
                    /**
                     * Creacion de tipos de licencias para el consuctor, debemos saber que un conductor uber
                     * no se puede admitir licencias tipo A
                     */
                    System.out.println("Ingrese tipo de licencia que ustde tiene ");
                    System.out.println("1. Licentio Tipo A");
                    System.out.println("2. Licencia Tipo B");
                    System.out.println("3. Licencia Tipo C");
                    int licencia = sc.nextInt();
                    switch (licencia) {
                        case 1:
                            System.out.println("Usted no puede registrar un auto en la compania Uber");
                            break;
                        case 2:
                            System.out.println("Usted esta apto para conducir el siguiente auto");
                            System.out.println("Deportivo");
                            System.out.println("Ingrese la marca");
                            marca = sc.next();
                            System.out.println("Ingrese el modelo");
                            modelo = sc.next();
                            /**
                             * Contorlador de aforo de cada vehiculo
                             */
                            do {
                                System.out.println("Ingrese el aforo [1-2]");
                                aforo = sc.nextInt();
                                if (aforo >= 1 && aforo <= 2) {

                                } else {
                                    System.out.println("Ingrese un numero de pasajeros dentro del rango");
                                }
                            } while (aforo != 1 && aforo != 2);

                            /**
                             * Controlador de precio de servicio de Uber
                             */
                            do {
                                System.out.println("Ingrese el precio");
                                precio = sc.nextDouble();
                                if (precio <= 0) {
                                    System.out.println("Ingresa un precio mayor a cero");
                                }
                            } while (precio <= 0);
                            /**
                             * Se introduce la variable objeto de AutoDeportivo para poder instanciarlos y agrgarlo
                             * en los arraylist de tipo Conductor y esto se podra ser visible para el cliente.
                             */
                            autoAux = new AutoDeportivo(marca, modelo, aforo, precio);
                            usuariosConductores.add(new Conductor(user, apellido, genero, edad, password, autoAux));
                            usuarctores.add(new Conductor(user,apellido,genero,edad, password,autoAux));
                            System.out.println("Conductor Registrado");
                            System.out.println(new Conductor(user, apellido, genero, edad, password, autoAux));
                            ShowDeportivo.lujos.add((AutoDeportivo) autoAux);
                            break;

                        case 3:
                            /**
                             * Acorde a su eleccion de licencias se puede elejir el tipo de auto que se quiera utilizar
                             */
                            System.out.println("Usted esta apto para conducir los siguienetes autos");
                            System.out.println("Seleccione que tipo de auto quiere registrar en uber");
                            System.out.println("1. Deportivo");
                            System.out.println("2. Familiar");
                            System.out.println("3. TransBus");
                            int op = sc.nextInt();
                            switch (op) {
                                case 1:
                                    System.out.println("Ingrese la marca");
                                    marca = sc.next();
                                    System.out.println("Ingrese el modelo");
                                    modelo = sc.next();
                                    /**
                                     * Controlador de aforo del vehiculo
                                     */
                                    do {
                                        System.out.println("Ingrese el aforo [1-2]");
                                        aforo = sc.nextInt();
                                        if (aforo >= 1 && aforo <= 2) {

                                        } else {
                                            System.out.println("Ingrese un numero de pasajeros dentro del rango");
                                        }
                                    } while (aforo != 1 && aforo != 2);
                                    /**
                                     * Controlador de precio del vehiculo
                                     */
                                    do {
                                        System.out.println("Ingrese el precio");
                                        precio = sc.nextDouble();
                                        if (precio <= 0) {
                                            System.out.println("Ingresa un precio mayor a cero");
                                        }
                                    } while (precio <= 0);
                                    /**
                                     * Introduccion y agregamineto de estos elementos en el array con su respectiva instancia
                                     * del tipo de objeto que en su caso es AutoDeportivo
                                     */
                                    autoAux = new AutoDeportivo(marca, modelo, aforo, precio);
                                    usuariosConductores.add(new Conductor(user, apellido, genero, edad, password, autoAux));
                                    usuarctores.add(new Conductor(user, apellido, genero, edad, password, autoAux));
                                    System.out.println("Conductor Registrado");
                                    System.out.println(new Conductor(user, apellido, genero, edad, password, autoAux));
                                    ShowDeportivo.lujos.add((AutoDeportivo) autoAux);
                                    System.out.println(ShowDeportivo.lujos.add((AutoDeportivo) autoAux));
                                    break;

                                case 2:
                                    System.out.println("Ingrese la marca");
                                    marca1 = sc.next();
                                    System.out.println("Ingrese el modelo");
                                    modelo1 = sc.next();
                                    /**
                                     * Controlador de aforo del vehiculo
                                     */
                                    do {
                                        System.out.println("Ingrese el aforo [1 -4]");
                                        aforo1 = sc.nextInt();
                                        if (aforo1 >= 1 && aforo1 <= 4) {


                                        } else {
                                            System.out.println("Este vehiculo no admite tanto pasajeros");
                                            System.out.println("Ingrese un numero de pasajeros dentro del rango");
                                        }
                                    } while (aforo1 < 1 || aforo1 > 4);
                                    /**
                                     * Controlador de precio del vehiculo
                                     */
                                    do {
                                        System.out.println("Ingrese el precio");
                                        precio1 = sc.nextDouble();
                                        if (precio1 <= 0) {
                                            System.out.println("Ingresa un precio mayor a cero");
                                        }
                                    } while (precio1 <= 0);
                                    /**
                                     * Introduccion y agregacion de los arraylist que en su caso es VehiculoFamiliar como objeto
                                     * y que se podr ver por parte del cliente
                                     */
                                    autoAux2 = new VehiculoFamiliar(marca1, modelo1, aforo1, precio1);
                                    usuariosConductores.add(new Conductor(user, apellido, genero, edad, password, autoAux2));
                                    usuarctores.add(new Conductor(user, apellido, genero, edad, password, autoAux));
                                    System.out.println("Conductor Registrado");
                                    System.out.println(new Conductor(user, apellido, genero, edad, password, autoAux2));
                                    ShowFamiliar.family.add((VehiculoFamiliar) autoAux2);


                                    break;

                                case 3:
                                    System.out.println("Ingrese la marca");
                                    marca2 = sc.next();
                                    System.out.println("Ingrese el modelo");
                                    modelo2 = sc.next();
                                    /**
                                     * Controlador de aforo del vehiculo
                                     */
                                    do {
                                        System.out.println("Ingrese el aforo [1-32]");
                                        aforo2 = sc.nextInt();

                                        if (aforo2 >= 1 && aforo2 <= 32) {
                                            /**
                                             * Contorlador de precio del vehiculo
                                             */
                                            do {
                                                System.out.println("Ingrese el precio");
                                                precio2 = sc.nextDouble();
                                                if (precio2 <= 0) {
                                                    System.out.println("Ingresa un precio mayor a cero");
                                                }
                                            } while (precio2 <= 0);
                                            /**
                                             * Introduccion de agregamiento e instanicas del obejto BusTrans donde se
                                             * introduce en el arraylist y sera visible para el cliente
                                             */
                                            autoAux3 = new BusTrans(marca2, modelo2, aforo2, precio2);
                                            usuariosConductores.add(new Conductor(user, apellido, genero, edad, password, autoAux3));
                                            usuarctores.add(new Conductor(user, apellido, genero, edad, password, autoAux));
                                            System.out.println("Conductor Registrado");
                                            System.out.println(new Conductor(user, apellido, genero, edad, password, autoAux3));
                                            ShowTrans.trans.add((BusTrans) autoAux3);

                                        } else {
                                            System.out.println("Ingrese un numero de pasajeros dentro del rango");
                                        }

                                    } while (aforo2 < 1 || aforo2 > 32);
                                }

                            break;
                    }
                    break;
                case 2:
                    /**
                     * Este metodo ayudara a la entrada y salida del login debido que si el usuario se podra acceder, caso contrario
                     * se reestringira su aceso
                     */
                    System.out.println("Ingrese Usuario");
                    String Usuario = sc.next();
                    System.out.println("Ingrese contraseña");
                    String contrasena = sc.next();
                    Perfiles perf = new Perfiles(Usuario, contrasena);
                    int indice = usuariosConductores.indexOf(perf);

                    if (indice != -1) {
                        perf = usuariosConductores.get(indice);
                        System.out.println(perf);
                        Conductor.Conductor();
                    } else {
                        System.out.println("La persona no se encuentra");
                    }

                    break;
                    case 3:
                        /**
                         * Opcion de crear una base de datos que son los ficheros
                         */
                        MakeReportAutos.makeReport();
                        MakeReportConductor.makeReportConductor();
                        MakeReportCalificaciones.makeReportCalifi();
                        break;
            }
        }while (salir != 0) ;
    }
}

