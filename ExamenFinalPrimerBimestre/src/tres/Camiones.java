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
public class Camiones extends Vehiculos {

    private double toneladas;

    public Camiones(String mat, String c, String ma, double dias, double to) {
        super(mat, c, ma, dias);
        setToneladas(to);
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    @Override
    public double obtener_precio_alquiler() {
        double precio = getDias_alquiler() * 50;
        double alquiler = precio + getToneladas() * 20;
        return alquiler;
    }

    @Override
    public String toString() {

        return String.format("%s, Toneladas: %.2f", super.toString(),
                getToneladas());
    }

}
