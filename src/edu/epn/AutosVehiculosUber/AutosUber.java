package edu.epn.AutosVehiculosUber;

/**
 * Esta clase sera la parte prinicpal para el usuario debido que se encunetra todos los elementos
 * en fomrato privado e importantes para importarlos en sus clases hijas
 */
public class AutosUber {
    private String Marca;
    private String Modelo;
    private double precio;
    private boolean disponible;
    private int calificacion;

    /**
     * Sobrecarga de metodods de AutosUber
     */
    public AutosUber() {
    }

    /**
     * Estos son los parametros prinicpales que se necesitara al momento de crear nuestro vehiculo
     * @param marca de tipo String para nuestro vehiculo
     * @param modelo de tipo String para nuestro vehiculo
     * @param precio de tipo Double para el precio del servicio
     */
    public AutosUber(String marca, String modelo, double precio) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.precio = precio;
        this.disponible=false;
        this.calificacion =0 ;
    }

    /**
     * Los famosos etter y setters que son fundamentales en el desarrollo del programa princpal
     * y de sus clases hijas
     * @return
     */
    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }



    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Esta clase nos ayudara en que si el vehiculo esta en uso o no
     * con las variables booleanas
     * @return valor que nos va a devolver por meido del procedimiento booleana
     */
    public String isDisponible() {
        String uso = "";
        if (disponible == true) {
            uso = "Disponible ";

        } else {
            uso = "Ocupado ";
        }
        return uso;
    }
}
