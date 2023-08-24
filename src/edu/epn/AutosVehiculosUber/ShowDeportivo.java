package edu.epn.AutosVehiculosUber;

import edu.epn.Calificaciones.Desiciones;
import edu.epn.MenuUber.ShowMenu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Esta clase contiene de igual forma un arraylist donde contiene todos los elementos ingresados de nuestra
 * clase AutoDeportivo
 */
public class ShowDeportivo {
    /**
     * Arraylist con los elementos AutoDeportivos
     */
    static public ArrayList<AutoDeportivo>lujos = new ArrayList<>();
    public static void Deportivo(){
        Scanner intro=new Scanner(System.in);
        String destino;
        int salir=1;
        /**
         * Se generara la impresion de nuestros elementos del arraylist para vista del usuario
         */
        do {
            System.out.println("\n--------------Disponibilidad de Autos Deportivos---------------");
            /**
             *  Funcion for que podemos imprimir toda la informacion que en la clase PerfilConductor se haya
             * digitado para que se pueda visualizar en el menu del cliente
             */
            for (int i = 0; i < lujos.size(); i++) {

                int cont = i+1;
                System.out.println( cont + "  "+ lujos.get(i).getMarca() + "--" + lujos.get(i).getModelo() + "--" + lujos.get(i).isDisponible());
            }
            System.out.println("\nIngrese su eleccion de coche, caso contrario ingrese 0 para salir");
            System.out.println("\nSelecciones su opcion");
            int desicion= Desiciones.Afirmardesicion(0,lujos.size());
            /**
             * Acorde a la desicion se podra visualizar la validez de nuestro elementos y por medio
             * de la condicional if se puede regresar al menuPrincipal o seguir con el prograso del programa
             */
            if (desicion == 0) {
                    salir = 0;
                    ShowMenu2 showMenu2 = new ShowMenu2();
                    showMenu2.MenuEleccion();
                    break;
                }
                if (desicion > 0) {
                    AutoDeportivo Seleccion = lujos.get(desicion - 1);
                    Seleccion.setDisponible(true);
                    System.out.println("Ingrese el lugar de destino");
                    destino = intro.next();
                    /**
                     * Se comienza con la llamada de la funcion en dodne se inicializara el conteo
                     * de viaje acorde a la seccion que hemos introducido y exisitira una funcion donde se pueda
                     * acabar el conteo de tiempo para asi poder sacar nuestro precio y tiempo de viaje
                     */
                    Date dateI = Seleccion.startToSee(new Date());
                    for (int i = 0; i < 1000; i++) {
                        System.out.println("Viajando....");

                    }
                    /**
                     * Finalizacion del programa donde se imprimira toda la informacion que se haya introducido al comienzo
                     * de este programa
                     */
                    System.out.println("");
                    System.out.println("A llegado a: " + destino);
                    Seleccion.stopToSee(dateI, new Date());
                    System.out.println("Fin del viaje:  " + Seleccion);
                    System.out.println("Tiempo de viaje: " + Seleccion.getTiempoViajes() + " segundos");
                    double valor = Seleccion.getTiempoViajes() * Seleccion.getPrecio();
                    System.out.println("Precio a pagar: " + valor);
                    int estrellas;
                    /**
                     * Se dispone a introducir una variable donde se evaluara el servicio de transporte hacia el cliente
                     * donde se puede permititr maximo hasta 5 estrellas cmo sobresaliente y no se permite
                     * numeros negativos
                     */
                    do {
                        System.out.println("\nDigite como le fue en el viaje desde el 1 al 5");
                        estrellas = intro.nextInt();

                        if (estrellas < 1 || estrellas > 5) {
                            System.out.println("\nIngrese el numero de estrellas válidos");
                        }
                    } while (estrellas < 1 || estrellas > 5);
                    Seleccion.setCalificacion(estrellas);
                }



        }while(salir!=0);
    }

}
