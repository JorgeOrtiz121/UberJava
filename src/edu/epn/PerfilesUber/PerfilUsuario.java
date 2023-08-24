package edu.epn.PerfilesUber;

import edu.epn.MenuUber.ShowMenu2;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfilUsuario {
    /**
     * Creacion de un arraylist donde abarcara las caracteristicas de Perfiles
     * y la creacion de su variable tipo objeto, donde se introducira los elementos
     * de añadir un usario y una contraseña en cada bloque del arraylist por eso en esta clase
     * se menciona 4 perfiles ya predeterminados para la ejecucion de un login tipo usuario.
     */
    static public ArrayList<Perfiles> usuarios = new ArrayList<Perfiles>();

    /**
     * El arraylist debe estar en formato estaico para que la varibale permanezca un largo tiempo en el
     * programa para actulizar sus datos y qeue no se puedan reiniciar indebidamente.
     */
    public void Login() {
        /**
         * Introduccion de una Arraylist con los metodos constructores Perfiles donde se
         * solicita los paramteros adquirido de la sobrecarga de metodos.
         */
        Perfiles usuario = new Perfiles("Ivonne","Maldonado" );
        usuarios.add(usuario);
        usuario = new Perfiles("Mayerli", "Mendez");
        usuarios.add(usuario);
        usuario = new Perfiles("Leoni", "Guambo");
        usuarios.add(usuario);
        usuario = new Perfiles("Bryan", "Tandazo");
        usuarios.add(usuario);
        usuario = new Perfiles("Jorge", "Ortiz");
        usuarios.add(usuario);
        /**
         * Creacion de un menu de clientes Tipo VIP
         */

        String usuariocliente;
        String contrasenaCliente;
        Scanner intro = new Scanner(System.in);
        System.out.println("\n----------------------------------------------");
        System.out.println("|            Lista de clientes VIP           |");
        System.out.println("----------------------------------------------");
        System.out.println("Usuario: Mayerli - Clave: Mendez");
        System.out.println("Usuario: Leoni - Clave: Guambo");
        System.out.println("Usuario: Bryan - Clave: Tandazo");
        System.out.println("Usuario: Jorge - Clave: Ortiz");
        System.out.println("Usuario: Ivonne - Clave: Maldonado");

        System.out.println("\nIntroducir usuario cliente ");
        usuariocliente = intro.next();
        System.out.println("Introducir clave ");
        contrasenaCliente = intro.next();
        Perfiles perf = new Perfiles(usuariocliente, contrasenaCliente);
        int indice=usuarios.indexOf(perf);
        /**
         * Al momento de digitar nuestra opcion se desplegara un nuevo menu debido a la llamada de
         * otras clases estaticas que es de la clase ShowMenu2 con su metodo MenuEleccion.
         */
        if (indice!= -1) {
            System.out.println("\n---------------------------------------------");
            System.out.println("|  Bienvenido al Menu de Clientes de Uber   |");
            System.out.println("---------------------------------------------");
            ShowMenu2 show = new ShowMenu2();
            show.MenuEleccion();
        } else {
            System.out.println("Usuario o contraseña incorrecta");
        }

    }

}



