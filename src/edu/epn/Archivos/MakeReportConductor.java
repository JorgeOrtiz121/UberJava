package edu.epn.Archivos;


import edu.epn.PerfilesUber.PerfilConductor;
import edu.epn.PerfilesUber.Perfiles;

public class MakeReportConductor {

    public static void makeReportConductor(){

        /**
         * Primero declaramos el objeto Report
         */

        Report report = new Report();
        /**
         * A continuacion lo que se hizo es ponerle el nombre del archivo que se creara
         * el archivo creado sera txt, en este se guardara la informacion de todos los conductores
         * que sean ingresados.
         */
        report.setNameFile("RegistroConductores");
        report.setExtension("txt");
        String contenido = "\tInformacion del los Conductores : \n";
        /**
         * A continacion con un for each procedemos a obtener la informacion del conductor , esta informacion es
         * nombre, apellido , sexo ,  edad y todo esto se guardara en la variable contenido.
         *
         */
        for (Perfiles conduc1 :PerfilConductor.usuarctores) {
            contenido += conduc1.mostrarconductor() +  "\n";
        }

        /**
         *Finalmente procedemos a generar un reporte de la informacion obtenido de los conductores.
         */
        report.setContent(contenido);
        report.makeReport();

    }
}
