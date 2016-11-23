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
public abstract class Vehiculos {

    private String matricula;
    private String color;
    private String marca;
    private double dias_alquiler;

    public Vehiculos(String mat, String c, String ma, double dias) {
        setMatricula(mat);
        setColor(c);
        setMarca(ma);
        setDias_alquiler(dias);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String ma) {
        matricula = ma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String co) {
        color = co;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marc) {
        marca = marc;
    }

    public double getDias_alquiler() {
        return dias_alquiler;
    }

    public void setDias_alquiler(double dias) {
        dias_alquiler = dias;
    }

    public abstract double obtener_precio_alquiler();

    @Override
    public String toString() {
        return String.format("| Matricula: %s | Color: %s | Marca: %s "
                + "| Dias de Alquiler: %.2f |", getMatricula(), getColor(),
                getMarca(), getDias_alquiler());

    }

}
