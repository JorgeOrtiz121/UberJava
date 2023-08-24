package edu.epn.Archivos;

import edu.epn.AutosVehiculosUber.*;
import edu.epn.PerfilesUber.Conductor;
import edu.epn.PerfilesUber.Perfiles;

import static edu.epn.PerfilesUber.PerfilConductor.usuariosConductores;

 /**
 * En esta clase nos permite generar un archivo el cual contiene informacion acerca de la Marca
 * Modelo, y el numero de estrellas obtenidas
 */

public class MakeReportCalificaciones {

    /**
     * En este método se obtendra información acerca de los autos deportivos, familiar y trans
     * los cuales seran almacenados en un archivo
     */

    public static void makeReportCalifi (){
        /**
         * Se declara un objeto tipo Report, y se utilizan metódos para nombrar al archivo
         * Se declara una variable la cual almacenara la informacion de los autos
         */
        Report report = new Report();
        report.setNameFile("RegistroCalificaciones");
        report.setExtension("txt");

        String contenido = "\tLas calificaciones del viaje son:\n ";
        contenido+="\n**************************************";

        /**
         * En este for se obtiene la informacion de la Marca, Modelo, Numero de estrellas del auto
         * desportivo. La informacion se lo va guardando en la variable contenido
         */
        for (AutoDeportivo auto : ShowDeportivo.lujos) {
            contenido +="\nMarca del Vehiculo Deportivo: " + auto.getMarca();
            contenido +="\nModelo del Vehiculo Deportivo: " + auto.getModelo();
            contenido +="\nEstrellas obtenidas: " + auto.getCalificacion();
        }

        contenido +="\n**************************************";
        /**
         * En este for se obtiene la informacion de la Marca, Modelo, Numero de estrellas del auto
         * familiar. La informacion se lo va guardando en la variable contenido
         */
        for (VehiculoFamiliar auto2 : ShowFamiliar.family) {
            contenido +="\nMarca del Vehiculo Familiar: " + auto2.getMarca();
            contenido +="\nModelo del Vehiculo Familiar: " + auto2.getModelo();
            contenido +="\nEstrellas obtenidas: " + auto2.getCalificacion();

        }
        contenido+="\n**************************************";
        /**
         * En este for se obtiene la informacion de la Marca, Modelo, Numero de estrellas del BusTrans.
         * La informacion se lo va guardando en la variable contenido
         */
        for (BusTrans auto3 : ShowTrans.trans) {
            contenido += "\nMarca del Vehiculo Bus Transporte: " + auto3.getMarca();
            contenido += "\nModelo del Vehiculo Bus Transporte: " + auto3.getModelo();
            contenido += "\nEstrellas obtenidas: " + auto3.getCalificacion();
        }
        contenido+="\n**************************************";

        /**
         * En esta parte generamos un reporte el cual contiene la informacion que hemos almacenado de
         * los autos
         */
        report.setContent(contenido);
        report.makeReport();
        System.out.println("Se ha generado el archivo con exito");

    }
 }
