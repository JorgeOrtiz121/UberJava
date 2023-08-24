package edu.epn.AutosVehiculosUber;

import edu.epn.Calificaciones.TiempoViaje;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Esta clase VehiculoFamiliar importara las caracteristicas de la clase padre AutosUber y se implementara
 * la interfaz TiempoViaje.
 */
public class VehiculoFamiliar extends AutosUber implements TiempoViaje.IVisualizable {
    /**
     * Creacion de un arraylist que contiene los elementos de VehiculoFamiliar
     * y la introduccion de 2 variables privadas que es TiempoViaje y aforo
     */
    static ArrayList<VehiculoFamiliar>family=new ArrayList<VehiculoFamiliar>();
    private int TiempoViaje;
    private int aforo;

    /**
     * Sobrecarga de metodos
     */
    public VehiculoFamiliar(){
    }

    /**
     * Metodo Constructor donde contendra nuevas variables y se importara las varibales de la clase padre.
     * @param marca tipo String marca que lleva el vehiculo
     * @param modelo tipo String para el modelo del vehiculo
     * @param aforo tipo int para la capacidad del auto
     * @param precio tipo Double para el precio del servicio
     */
    public VehiculoFamiliar(String marca, String modelo, int aforo, double precio) {
        super(marca, modelo, precio);
        this.aforo=aforo;
        super.setDisponible(true);
        super.setCalificacion(0);
    }

    /**
     * Se retornara los elementos digitados del Arraylist
     * @return
     */
  public ArrayList<VehiculoFamiliar>makeVehiculoFamiliarList(){
        return this.family;
    }

    /**
     * Este arraylist contiene y se agregara toda la informacion de nuestros vehiculos
     * @param autoAux2
     * @return
     */

    public  ArrayList<VehiculoFamiliar>makeVehiculoFamiliarList(VehiculoFamiliar autoAux2) {

        Scanner intro = new Scanner(System.in);
            this.family.add(autoAux2);
            return family;
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
        return "\nMarca del vehiculo Familiar: "+getMarca()+"\nModelo Familiar: "+getModelo()+"\nAforo: "+this.aforo+"\nPrecio: "+getPrecio();
    }

    /**
     * Getters para las variable creadas en el metodo constructor TiempoViaje
     * @return
     */
    public int getTiempoViaje() {
        return TiempoViaje;
    }
    /**
     * Setters para las variable creadas en el metodo constructor TiempoViaje
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
     * @param dateI
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
