package edu.epn.Archivos;

import java.io.*;


public class Report {
    /**
     * Declaracion de variables nameFile, content, extension
     * generacion de getter y setter para poder tener acceso en toda las clases
     */
    private String nameFile;
    private String content;
    private String extension;


    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * Creacion de archivo, y capturar de erores con try y catch, es importante cerrar el archivo
     */

    public void makeReport(){
        if((getNameFile() != null) && (getContent() != null)){
            //Crear el archivo
            try {
                File file = new File(getNameFile()+"."+getExtension());
                FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(getContent());
                bw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            System.out.println("Primero ingrese el contenido del archivo");
        }
    }


}
