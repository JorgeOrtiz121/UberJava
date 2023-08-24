package edu.epn.Calificaciones;

import java.util.Scanner;

/**
 * En esta clase se obtendra la busqueda de las varables de usario y clave del login de conductor donde
 * se podra afirmar si los elementos digitados existen se podra acceder, caso contrairo se reestingen.
 */
public class Desiciones {
    /**
     * Estos parametros se utilizaran en la clase de Conductores al momentod e validar sus elementos
     * @param min
     * @param max
     * @return
     */
    public static int Afirmardesicion(int min, int max){
    Scanner sc = new Scanner(System.in);
        /**
         * Si ocurre un problema en su digitacion en consola nos mostrara su error de compilacion y tendriamos
         * que intertarlo nuevamente
         */
    while(!sc.hasNextInt()){
        sc.next();
        System.out.println("Opcion no valida en el sistema:::Ingrese Otra vez");

    }
    int desicion= sc.nextInt();
        /**
         * Erro al momento de introducir un indice no existente, tendremos que interalo otra vez.
         */
        while (desicion<min||desicion>max){
    System.out.println("Opcion no valida en el sistema:::Ingrese Otra vez");
    while (!sc.hasNextInt()){
        System.out.println("Opcion no valida en el sistema:::Ingrese Otra vez");
    }
    desicion=sc.nextInt();
}

return desicion;
}
}
