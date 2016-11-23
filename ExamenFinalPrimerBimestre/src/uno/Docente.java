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
public class Docente {

    private String nombre;
    private String apellido;
    private String titulo;
    
    public Docente(String n, String ap, String ti) {
        setNombre(n);
        setApellido(ap);
        setTitulo(ti);
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
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String tit) {
        titulo = tit;
    }
    
    @Override
    public String toString(){
    return String.format("Nombre: %s %s "
            + "Titulo: %s",getNombre(),getApellido(),getTitulo());
    }
    
}
