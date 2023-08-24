package edu.epn.PerfilesUber;

import edu.epn.AutosVehiculosUber.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase conllevara la herencia de todos los elementos importados de la clase padre que es Perfiles, cabe resaltar
 * que si se utiliza herencia y sus metodos son private , faovr de utilizar geeters y setters.
 */
public class Conductor extends Perfiles {
    /**
     * Nueva variable de tipo private y el inicio de la utilizacion de polimorfismo
     */
    private AutosUber autoDelConductor;

    /**
     *
     * @param nombre tipo String para ingresar su nombre del conductor
     * @param apellido tipo String para ingresar su apellido del conductor
     * @param sexo de tipo String para ingresa su genero
     * @param edad de tipo int (entero) para ingresar su edad
     * @param Clave de tipo String para ingresar su clave
     * @param autoDelConductor de tipo AutosUber(objeto) donde de introduce los argumentos de este objeto
     *  Tener en cuenta que las primeras vairables se compone de la funcion super que muestra la herencia
     *  de la clase padre (Perfiles).
     */

    public Conductor(String nombre, String apellido, String sexo, int edad, String Clave, AutosUber autoDelConductor) {
        super(nombre, apellido, sexo, edad, Clave);
        this.autoDelConductor = autoDelConductor;
    }

    /**
     * Esta funcion tipo estatica contendra un menu donde el conductor podra elejir su eleccion de vehiculo
     * como es un menu se utilzara las funciones de bucles que do-while y la de seleccion que es
     * swtich donde se clasificara de multiples opciones.
     * Esta clase es para ver la calificaciones que el usuario haya mandado depsues del servicio de Uber
     */
    public static void Conductor() {

        int opcion;
        do {
            System.out.println("\n");
            System.out.println("-----BIENVENIDO AL SISTEMA DE CONDUCTOR-----");
            System.out.println("\t             Calificaciones-Uber           ");
            System.out.println("1.Vehiculo Deportivo");
            System.out.println("2.Vehiculo Familiar");
            System.out.println("3.Bus trans");
            System.out.println("0.Salir");
            Scanner intro = new Scanner(System.in);
            opcion = intro.nextInt();
            /**
             * Aqui se abarcara los elementos de Switch donde se clasifica en 4 opciones y una de ellas es para regresar
             * al menu anterior
             * Cada elemento se dispones de un objeto de cada campo que es AutoDeportivos, VehiculoFamiliar y BusTrans
             * donde al momento de utilizar las funciones de bucles foreach se tendra que mencionar el objeto de cada
             * campo y utilizar la variable get debido que todas sus funciones son privadas por la clase AutoDeportivo.
             */
            switch (opcion) {
                case 1:
                    System.out.println("\t       Revisar las calificaciones     ");
                    for (AutoDeportivo auto : ShowDeportivo.lujos) {
                        System.out.println("Marca del Vehiculo Deportivo: " + auto.getMarca());
                        System.out.println("Modelo del Vehiculo Deportivo: " + auto.getModelo());
                        System.out.println("Estrellas obtenidas: " + auto.getCalificacion());
                    }
                    break;

                case 2:
                    System.out.println("\t       Revisar las calificaciones     ");
                    for (VehiculoFamiliar auto2 : ShowFamiliar.family) {
                        System.out.println("Marca del Vehiculo Familiar: " + auto2.getMarca());
                        System.out.println("Modelo del Vehiculo Familiar: " + auto2.getModelo());
                        System.out.println("Estrellas obtenidas: " + auto2.getCalificacion());
                    }
                    break;

                case 3:
                    System.out.println("\t       Revisar las calificaciones     ");
                    for (BusTrans auto3 : ShowTrans.trans) {
                        System.out.println("Marca del Vehiculo Bus Transporte: " + auto3.getMarca());
                        System.out.println("Modelo del Vehiculo Bus Transporte: " + auto3.getModelo());
                        System.out.println("Estrellas obtenidas: " + auto3.getCalificacion());
                    }
                    break;
            }
        } while (opcion != 0) ;

    }
}

