/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dos;

/**
 *
 * @author TOSHIBA
 */
public class Garante {
    private String nombre;
    private String apellido;
    private double sueldo;
    
    public Garante(String nom, String ape, double suel) {
        setNombre(nom);
        setApellido(ape);
        setSueldo(suel);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomb) {
        nombre = nomb;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String ape) {
        apellido = ape;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double suel) {
        sueldo = suel;
    }
    
    @Override
    public String toString(){
    return String.format("Nombre Garante: %s %s Sueldo: %.2f", getNombre(),getApellido(),getSueldo());
    }
}
