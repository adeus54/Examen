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
public class Furgonetas extends Vehiculos {

    public Furgonetas(String mat, String c, String ma, double dias) {
        super(mat, c, ma, dias);
    }
    
    @Override
    public double obtener_precio_alquiler(){
        double precio = getDias_alquiler() * 50;
        double alquiler = precio + 100;
        return alquiler;
    }
    
    @Override
    public String toString(){
        return String.format("%s",super.toString());
    }
    
}
