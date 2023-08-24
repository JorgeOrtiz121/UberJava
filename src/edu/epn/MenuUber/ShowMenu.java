package edu.epn.MenuUber;

import edu.epn.Main;
import edu.epn.PerfilesUber.PerfilConductor;
import edu.epn.PerfilesUber.PerfilUsuario;

import java.util.Scanner;

/**
 * Esta clase contiene todos los elementos principales para el cliente y conductor donde contiene la entrada de cada login
 * y de cada login sus meotodos y funciones
 */
public class ShowMenu {
    public  void MenuPrincipal() {
        int opciones;
        Scanner intro = new Scanner(System.in);
        /**
         * Menu dinamico Principal para Cliente y Conductor
         */
        do {
            System.out.println("\n**********************************************************");
            System.out.println("          BIENVENIDO AL SERVICIO DE UBER EN ECUADOR        ");
            System.out.println("\n**********************************************************");
            System.out.println();
            System.out.println("1.-Perfil de Cliente");
            System.out.println("2.-Perfil de conductor");
            System.out.println("0.-Salir");
            System.out.println("Escoja su opcion");
            opciones = intro.nextInt();
            /**
             * Multiples opciones que puede elejir el usario gracias a la funcion switch
             */

            switch (opciones) {
                case 1:
                    PerfilUsuario perfil=new PerfilUsuario();
                    perfil.Login();
                    break;
                case 2:
                    PerfilConductor conductor=new PerfilConductor();
                    conductor.PErfilUsuario();
                    break;
                case 0:
                    System.out.println("Gracias por elejir Uber");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }while(opciones !=0);
    }
}
