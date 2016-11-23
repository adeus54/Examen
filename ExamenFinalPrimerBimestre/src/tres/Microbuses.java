/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

/**
 *
 * @author TOSHIBA
 */
public class Microbuses extends Vehiculos{
    private double numero_rutas;

    public Microbuses( String mat, String c, String ma, double dias, double rutas) {
        super(mat, c, ma, dias);
        setNumero_rutas(rutas);
    }
    
    public double getNumero_rutas() {
        return numero_rutas;
    }

    public void setNumero_rutas(double numero_rutas) {
        this.numero_rutas = numero_rutas;
    }
    
    @Override
    public double obtener_precio_alquiler(){
        double precio = getDias_alquiler() * 50;
        double alquiler = precio + (getNumero_rutas() * 10);
        return alquiler;
    }
    
    @Override
    public String toString(){
        return String.format("%s Numero de Rutas: %.2f",super.toString(),
                getNumero_rutas());
    }
    
}
