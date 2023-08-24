package edu.epn.MenuUber;

import edu.epn.AutosVehiculosUber.ShowDeportivo;
import edu.epn.AutosVehiculosUber.ShowFamiliar;
import edu.epn.AutosVehiculosUber.ShowTrans;
import edu.epn.Calificaciones.Desiciones;

import java.util.Scanner;

public class ShowMenu2 {
    /**
     * Este metodo abarca un menu donde contiene los elementos del vehiculo que tendra que
     * escojer el cliente
     */
    public  void MenuEleccion() {
        int eleccion;
        /**
         * Menu dinamico para el cliente
         */
        do {
            System.out.println("Elija el tipo de auto que desse para viajar");
            System.out.println("1.Vehiculo Deportivo");
            System.out.println("2.Vehiculo Familiar");
            System.out.println("3.BusetaTrans");
            System.out.println("0.Salir");
            Scanner intro = new Scanner(System.in);

            System.out.println("Elija una opcion ");
            eleccion = Desiciones.Afirmardesicion(0, 3);
            /**
             * Todas las elecciones que el cliente pueda digitar con sus respectivas funciones ya iteradas.
             * Lo que podra ver el cliente
             */
            switch (eleccion) {
                case 1:
                    /**
                     * Clase ShowDeportivo(estatico)
                     */
                    ShowDeportivo.Deportivo();
                    break;
                case 2:
                    /**
                     * Clase ShowFamiliar(estatico)
                     */
                    ShowFamiliar.Family();
                    break;
                case 3:
                    /**
                     * Clase ShowTrans(estatico)
                     */
                    ShowTrans.Trans();
                    break;
                case 0:
                    /**
                     * Clase ShowDeportivo(Instancia de Objetos)
                     */
                    ShowMenu showMenu=new ShowMenu();
                    showMenu.MenuPrincipal();
                    break;
            }
        }while (eleccion!=0);
    }
}

