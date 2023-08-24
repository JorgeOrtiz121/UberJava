package edu.epn.Calificaciones;

import java.util.Date;

/**
 * Esta clase se implemnta la clase Interfa de Java donde contiene la firma de los metodos o su desarrollo
 */
public interface TiempoViaje {
    /**
     * Metodo pars el caluclo de tiempo de ejecucion del programa
     * Nos ayudara para el reccorrido de viaje de cada vehiculo que elejira el cliente
     */

    public interface IVisualizable {
        /**
         * Inicio y Fin del contaodr del programa
         * @param dateI
         * @return
         */
        Date startToSee(Date dateI);
        void stopToSee(Date dateI, Date dateF);
    }

}
