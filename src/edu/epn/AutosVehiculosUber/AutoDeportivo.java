package edu.epn.AutosVehiculosUber;

import edu.epn.Calificaciones.TiempoViaje;

import java.util.ArrayList;
import java.util.Date;

/**
 * Esta clase contiene todas las modificaciones entre la herencia, interfaz y arraylist
 * donde contiene todos los elementos que se utilizara para para exportarlos en las clase Shows de cada vehiculo
 * para el cliente
 */
public class AutoDeportivo extends AutosUber implements TiempoViaje.IVisualizable {
    /**
     * Esta clase contiene el fomrato estatico par que el arraylist pueda estar en constante actualizacion
     */
    static ArrayList<AutoDeportivo> lujos=new ArrayList<AutoDeportivo>();
private  int TiempoViajes;
private int aforo;

    /**
     * Sobrecarga de metodos en la clase AutoDeportivos
     */
    public AutoDeportivo() {
     }

    /**
     * Metodo Constructor donde contiene nuestros argumentos
     * @param marca tipo String para el nombre del vehiculo
     * @param modelo tipo String para el mdelo del vehiculo
     * @param aforo tipo Int donde contiene la catidad de personas
     * @param precio tipo double donde contiene el precio del servicio
     */
    public AutoDeportivo(String marca, String modelo, int aforo, double precio) {
        super(marca, modelo, precio);
        this.aforo=aforo;
        super.setDisponible(true);
        super.setCalificacion(0);
    }

    /**
     * Llamaa de la funcion Arraylist de AutosDeportivos
     * @return
     */

    public ArrayList<AutoDeportivo>makeAutoDeportivoList(){

        return this.lujos;
    }

    /**
     * Este arraylist agregar todos los resultados de de las clases anteriores a esta clase actual
     * @param autoAux
     * @return
     */
    public ArrayList<AutoDeportivo>makeAutoDeportivoList(AutoDeportivo autoAux){
        String Marca,Modelo ;
        this.lujos.add(autoAux);

        return lujos;



    }

    /**
     * Datos impresos en esta clase AutoDeportivos
     * @return
     */
    public String MostrarDatos(){
    return ""+getMarca()+""+getModelo()+""+this.aforo+""+getPrecio();
    }
    /**
     * Getters para las variable creadas en el metodo constructor TiempoViajes
     * @return
     */
    public int getTiempoViajes() {
        return TiempoViajes;
    }
    /**
     * Setters para las variable creadas en el metodo constructor TiempoViajes
     * @return
     */
    public void setTiempoViajes(int tiempoViajes) {
        TiempoViajes = tiempoViajes;
    }

    /**
     * Sobreescritura de esta funcion que se reflejara al momento de compilar nuestro programa
     * @return
     */
    @Override
    public String toString(){
        return "\n\nEl vehiculo seleccionado es "+"\nMarca del vehiculo deportivo: "+getMarca()+"\nModelo deportivo: "+getModelo()+"\nAforo: "+this.aforo+"\nPrecio: "+getPrecio()+"\n\n";
    }

    /**
     * Retorno de las interfaces TiempoViaje
     * @param dateI Iniico de programa
     * @return
     */
    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    /**
     * Desarrollo de la interfaz TiempoViaje donde existe un inicio y un fin del programa
     * @param dateI Inicio de programa
     * @param dateF Fin de programa
     */
    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if (dateF.getTime() > dateI.getTime()) {
            setTiempoViajes((int)(dateF.getTime() - dateI.getTime()));
        }else {
            setTiempoViajes(0);
        }
    }


}
