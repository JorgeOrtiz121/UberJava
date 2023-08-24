package edu.epn.AutosVehiculosUber;

import edu.epn.Calificaciones.TiempoViaje;

import java.util.ArrayList;
import java.util.Date;

/**
 * Esa clase BusTrans importara toda la informacion de la clase Padre AutosUber y contiene la implementacion
 * de la interfaz TiempoViaje
 */
public class BusTrans extends AutosUber implements TiempoViaje.IVisualizable{
    /**
     * Contiene un arraylist donde existe la clase BusTrans donde se podra actualizar momentariamente su informacion
     * y se ha añadido 2 variables que es aforo y TiempoViaje.
     */
    static ArrayList<BusTrans>trans=new ArrayList<BusTrans>();
    private int TiempoViaje;
    private int aforo;

    /**
     * Sobrecarga de metodo
     */
    public BusTrans() {
    }

    /**
     * Metodo Constructor de la clase BusTrans donde se impleenta las caracteristicas de la clase padre AutosUber
     * @param marca tipo String marca que lleva el vehiculo
     * @param modelo  tipo String para el modelo del vehiculo
     * @param aforo tipo int para la capacidad del auto
     * @param precio tipo Double para el precio del servicio
     */
    public BusTrans(String marca, String modelo, int aforo, double precio) {
        super(marca, modelo, precio);
        this.aforo=aforo;
        super.setDisponible(true);
        super.setCalificacion(0);
    }
    /**
     * Se retornara los elementos digitados del Arraylist
     * @return
     */
    public ArrayList<BusTrans>makeBusTransList(){
    return this.trans;
    }
    /**
     * Este arraylist contiene y se agregara toda la informacion de nuestros vehiculos
     * @param autoAux3
     * @return
     */
    public ArrayList<BusTrans>makeBusTransList(BusTrans autoAux3){
        this.trans.add(autoAux3);
        return trans;
    }
    /**
     * Se mostrara los datos ingresados en consola
     * @return
     */
    public String MostrarDatos(){
        return ""+getMarca()+""+getModelo()+""+this.aforo+""+getPrecio();
    }
    /**
     * Se sobreescribe nuestro contenido para que el cliente pueda observalo en consola
     * @return
     */
    public String toString(){
        return "\nMarca del vehiculo BusTrans: "+getMarca()+"\nModelo BusTrans: "+getModelo()+"\nAforo: "+this.aforo+"\nPrecio del BusTrans: "+getPrecio();
    }

    /**
     * Getters de la variable TiempoViaje
     * @return
     */
    public int getTiempoViaje() {
        return TiempoViaje;
    }
    /**
     * Setters para las variable creadas en el metodo constructor TiempoViajes
     * @return
     */
    public void setTiempoViaje(int tiempoViaje) {
        TiempoViaje = tiempoViaje;
    }
    /**
     * Getters para las variable creadas en el metodo constructor Aforo
     * @return
     */
    public int getAforo() {
        return aforo;
    }
    /**
     * Setters para las variable creadas en el metodo constructor Aforo
     * @return
     */
    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
    /**
     * Creacion del desarrollo de la interfaz sobre el controlador de tiempo del programa
     * @param dateI Inicio de programa
     * @return
     */
    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }
    /**
     * Variables de la interfaz donde donde existe un inicio y fin de tiempo
     * @param dateI Inicio de programa
     * @param dateF Fin de programa
     */
    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if (dateF.getTime() > dateI.getTime()) {
            setTiempoViaje((int)(dateF.getTime() - dateI.getTime()));
        }else {
            setTiempoViaje(0);
        }
    }
}
