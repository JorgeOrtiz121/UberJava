package edu.epn.Archivos;

import edu.epn.AutosVehiculosUber.*;
import edu.epn.PerfilesUber.Conductor;
import edu.epn.PerfilesUber.PerfilConductor;
import edu.epn.PerfilesUber.Perfiles;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *la clase MakeReportAutos se genera un registro de todos los autos que cada conductor registre
 *en un archivo tanto los autos deportivos, familiares y busTrans
 */
public class MakeReportAutos {

     public static void makeReport(){

         /**
          *Se crea una archivo con el nombre de RegistroAutos, va a tener una extencion txt
          * contendra un titulo especificado
          */
         Report report = new Report();
         report.setNameFile("RegistroAutos");
         report.setExtension("txt");
         String contenido = "\tLos Autos resgristrados en la compania de Uber son: \n";

         /**
          *Con este for recorre todos los autos que hayan sido generados y no importara si repite
          *  un carro deportivo, trans o familiar se obtiene toda la informacion de todos los vehiculos
          *  como la Marca, Modelo, Aforo y Precio
          */
         for (AutoDeportivo autoprueba2 : ShowDeportivo.lujos) {
             contenido +=  autoprueba2.toString() +  "\n";
         }

         for (BusTrans autoprueba3 : ShowTrans.trans) {
             contenido += autoprueba3.toString() +  "\n";
         }

         for (VehiculoFamiliar autoprueba4 : ShowFamiliar.family) {
             contenido += autoprueba4.toString() + "\n";
         }

         /**
          *se hace referencia a que toda la informacion de los carros se va a tratar del contenido
          * del archivo RegistroAutos
          */
         report.setContent(contenido);
         report.makeReport();


     }
}
