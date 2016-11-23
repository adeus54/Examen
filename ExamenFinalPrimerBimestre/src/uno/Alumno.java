/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author TOSHIBA
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private Docente docente_programacion;
    private Docente docente_base_datos;

    public Alumno(String nom, String ap, Docente doc, Docente doc2) {
        setNombre(nom);
        setApellido(ap);
        setDocente_base_datos(doc);
        setDocente_programacion(doc2);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String ape) {
        apellido = ape;
    }

    public Docente getDocente_programacion() {
        return docente_programacion;
    }

    public void setDocente_programacion(Docente docente_pr) {
        docente_programacion = docente_pr;
    }

    public Docente getDocente_base_datos() {
        return docente_base_datos;
    }

    public void setDocente_base_datos(Docente docente_bas) {
        docente_base_datos = docente_bas;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre_Alumno: %s %s",getNombre(),getApellido(),
                getDocente_base_datos().toString(),
                getDocente_programacion().toString());
    }

    
    
    
    
}
