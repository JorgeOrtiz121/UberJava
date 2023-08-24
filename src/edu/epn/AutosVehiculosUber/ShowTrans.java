package edu.epn.AutosVehiculosUber;

import edu.epn.Calificaciones.Desiciones;
import edu.epn.MenuUber.ShowMenu2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 * Esta clase contiene de igual forma un arraylist donde contiene todos los elementos ingresados de nuestra
 * clase BusTrans
 */
public class ShowTrans {
    /**
     * Arraylist con los elementos de BusTrans
     */
    static public ArrayList<BusTrans>trans=new ArrayList<BusTrans>();
    public static void Trans(){
        Scanner intro=new Scanner(System.in);
        String Destino;
        int salir=1;
        /**
         * Se generara la impresion de nuestros elementos del arraylist para vista del usuario
         */
        do{
            /**
             * Gracias a la funcion for podemos imprimir toda la informacion que en la clase PerfilConductor se haya
             * digitado para que se pueda visualizar en el menu del cliente
             */
            System.out.println("\n--------------Disponibilidad de TransBus---------------");
            for (int i = 0; i < trans.size(); i++) {
                int cont = i+1;
                System.out.println(cont + " " + trans.get(i).getMarca() + "--" + trans.get(i).getModelo() + "--" + trans.get(i).isDisponible());
            }
            System.out.println("\nIngrese su eleccion de coche, caso contrario ingrese o para salir");
            System.out.println("\nSelecciones su opcion");
            int desicion= Desiciones.Afirmardesicion(0,trans.size());
            /**
             * Acorde a la desicion se podra visualizar la validez de nuestro elementos y por medio
             * de la condicional if se puede regresar al menuPrincipal o seguir con el prograso del programa
             */
            if(desicion==0){
                salir=0;
                ShowMenu2 showMenu2=new ShowMenu2();
                showMenu2.MenuEleccion();
                break;
            }
            if(desicion>0){
                BusTrans Seleccion=trans.get(desicion-1);
                Seleccion.setDisponible(true);
                System.out.println("Ingrese el lugar de destino");
                Destino=intro.next();
                /**
                 * Se comienza con la llamada de la funcion en donde se inicializara el conteo
                 * de viaje acorde a la seccion que hemos introducido y exisitira una funcion donde se pueda
                 * acabar el conteo de tiempo para asi poder sacar nuestro precio y tiempo de viaje
                 */
                Date dateI = Seleccion.startToSee(new Date());
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Viajando" );

                }
                /**
                 * Finalizacion del programa donde se imprimira toda la informacion que se haya introducido al comienzo
                 * de este programa
                 */
                System.out.println(" A llegado a: "+Destino);
                Seleccion.stopToSee(dateI,new Date());
                System.out.println("Fin del viaje "+Seleccion);
                System.out.println("Tiempo de viaje "+Seleccion.getTiempoViaje()+" segundos");
                double valor=Seleccion.getTiempoViaje()*Seleccion.getPrecio()* Seleccion.getAforo();
                System.out.println("Precio a pagar: "+valor);
                int estrellas;
                /**
                 * Se dispone a introducir una variable donde se evaluara el servicio de transporte hacia el cliente
                 * donde se puede permititr maximo hasta 5 estrellas cmo sobresaliente y no se permite
                 * numeros negativos
                 */
                do {
                    System.out.println("\nDigite como le fue en el viaje en el rango de 1 al 5");
                    estrellas = intro.nextInt();

                    if(estrellas < 1 || estrellas > 5){
                        System.out.println("\nIngrese el numero de estrellas válidos");
                    }
                } while(estrellas < 1 || estrellas > 5);
                Seleccion.setCalificacion(estrellas);
            }

        }while (salir!=0);

    }
}
