package edu.epn.PerfilesUber;

import java.util.Objects;

/**
 * Tener en cuenta que el objetivo de esta clase es crear un perfil general donde abarcara los elementos que
 * se necesitara para crear un objeto que es nuestro Perfil y en donde empezara tambien con la creacion de
 * perfiles conductores de nuestros vehiculos al momento de registrar su automovil
 */
public class Perfiles {
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private String Clave;

    /**
     *
     * @param nombre de tipo de variable String donde se creara el nombre de los conductores
     * @param apellido de tipo String donde se creara el apellido de los conductores
     * @param sexo de tipo String donde especificara el genero de los conductores
     * @param edad de tipo int donde especificaremos los años del conductor y siempre debe ser un año entero.
     * @param Clave de tipo String donde se especificara la clave del conductor.
     */

   public Perfiles( String nombre, String apellido, String sexo, int edad,String Clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.Clave=Clave;
    }

    /**
     *
     * @param nombre
     * @param clave
     * esta variables que se puede visualizar es el famoso metodo constructor donde se podra iterar
     *los arametros necesarios al momento de crear nuestro objeto.
     * Si se visualiza un poco mas abajo existe otro metodo constructor pero con diferentes argumentos
     * esto se le denomina como sobrecarga de metodos.
     */
    public Perfiles(String nombre, String clave) {
        this.nombre = nombre;
        this.Clave = clave;
    }

    /**
     * Aqui se presentara los famosos getters y setters de cada argumento de los metodos constructores
     * donde getter significara mostrar elementos y setter introducir elementos.
     * Estas funciones se lo utiliza al momento de utilizar herencia y polimorfismo debido que
     * se introduce variables encapsuladas de formato privado.
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Setters para las variable creadas en el metodo constructor Nombre
     * @return
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getters para las variable creadas en el metodo constructor Apellido
     * @return
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Setters para las variable creadas en el metodo constructor Apellido
     * @return
     */

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Getters para las variable creadas en el metodo constructor Sexo
     * @return
     */

    public String getSexo() {
        return sexo;
    }
    /**
     * Setters para las variable creadas en el metodo constructor Sexo
     * @return
     */

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * Getters para las variable creadas en el metodo constructor Edad
     * @return
     */

    public int getEdad() {
        return edad;
    }
    /**
     * Setters para las variable creadas en el metodo constructor Edad
     * @return
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Getters para las variable creadas en el metodo constructor Clave
     * @return
     */

    public String getClave() {
        return Clave;
    }
    /**
     * Setters para las variable creadas en el metodo constructor Clave
     * @return
     */

    public void setClave(String clave) {
        Clave = clave;
    }

    /**
     * Sobreescritura de los datos ingresados en consola
     * @return
     */
    @Override
    public String toString(){
         return "\n------------------------\n" +
                 "Datos del Conductor son:\n"+
                 "----------------------"+
                "\nUsuario: "+ nombre +
                "\nApellido: "+ apellido+
                "\nClave: "+Clave+"\n";
    }

    /**
     * Datos impresos en consola
     * @return
     */

    public  String mostrarconductor (){

        return
                "\nConductor" +
                "\nNombre: " +nombre+
               "\nApellido: " +apellido+
               "\nSexo:"  + sexo+
               "\nEdad: " +edad;

    }

    /**
     *
     * @param obj variable donde se va comparar sus elementos
     * @return
     * Este metodo nos ayudara al momento de evaluar los elementos de un objeto debido que trabajamos
     * con metodos heredados y arraylist, esto nos  ayudara a evaluar cada componente con los elementos
     * que en consola se va a registrar donde se comparara si es verdad retornara un valor true donde nos ayudara al acceso
     * de un login, caso contrario un valor false donde nos impedira el acceso del login
     * Tener en cuenta que equals es una funcion que solo se trabajo con elementos tipo objeto
     */

    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        Perfiles personaAux=(Perfiles) obj;
        if (Objects.equals(this.Clave,personaAux.Clave)&&(Objects.equals(this.nombre,personaAux.nombre))){
            return true;
        }
        return false;
    }


}
