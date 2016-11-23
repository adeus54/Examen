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
public class Coches extends Vehiculos{
    private int num_pasajeros;

    public Coches(String mat, String c, String ma, double dias,int numero) {
        super(mat, c, ma, dias);
        setNum_pasajeros(numero);
    }

    public int getNum_pasajeros() {
        return num_pasajeros;
    }

    public void setNum_pasajeros(int num) {
        num_pasajeros = num;
    }
    
    @Override
    public double obtener_precio_alquiler(){
        double precio = (getDias_alquiler() * 50);
        double alquiler = precio + (getNum_pasajeros() * 5);
        return alquiler;
    }
    
    @Override
    public String toString(){
    return String.format("%s Numero de Psajeros: %d",super.toString(),
            getNum_pasajeros());
    }
    
    
}
