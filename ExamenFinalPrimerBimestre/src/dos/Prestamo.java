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
public class Prestamo {
    private String nombredebenefiario;
    private double sueldo;
    private double monto_prestamo;
    private double interes;
    private double tiempo_prestamoAños;
    private Garante garante1;

    public Prestamo(String nom_ben, double s, double mon, double in, double time, Garante gar1) {
        setNombre_de_benefiario(nom_ben);
        setSueldo(s);
        setMonto_prestamo(mon);
        setInteres(in);
        setTiempo_prestamoAños(time);
        setGarante1(gar1);   
    }
    
    public String getNombre_de_benefiario() {
        return nombredebenefiario;
    }

    public void setNombre_de_benefiario(String nom_ben) {
        nombredebenefiario = nom_ben;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double s) {
        sueldo = s;
    }

    public double getMonto_prestamo() {
        return monto_prestamo;
    }

    public void setMonto_prestamo(double monto) {
        monto_prestamo = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double i) {
        interes = i;
    }

    public double getTiempo_prestamoAños() {
        return tiempo_prestamoAños;
    }

    public void setTiempo_prestamoAños(double tiempo) {
        tiempo_prestamoAños = tiempo;
    }

    public Garante getGarante1() {
        return garante1;
    }

    public void setGarante1(Garante gar1) {
        garante1 = gar1;
    }
    public double ValorTotal(){
        double resul = (getMonto_prestamo()* getInteres())/ getTiempo_prestamoAños();
        return resul;
    } 
    @Override
    public String toString(){
        return String.format("Nombre Beneficiario: %s Sueldo: %.2f "
                + "Monto del Prestamo: %.2f Interes: %.2f "
                + "Tiempo en A\u00F1os: %.2f Garante -> %s",getNombre_de_benefiario(),
                getSueldo(),getMonto_prestamo(),getTiempo_prestamoAños(),
                getInteres(),getGarante1().toString());
    
    }
    
    
}
