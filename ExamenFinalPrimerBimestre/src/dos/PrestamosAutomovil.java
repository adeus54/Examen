package dos;

/**
 *
 * @author TOSHIBA
 */
public class PrestamosAutomovil extends Prestamo{
    private String tipovehiculo;
    private String marcavehiculo;
    private Garante garante2;

    public PrestamosAutomovil(String nom_ben, double s, double mon, double in, 
            double time, Garante gar1,String tipo, String marca, Garante gar2){
        super(nom_ben, s, mon, in, time, gar1);
        setTipo_vehiculo(tipo);
        setMarca_vehiculo(marca);
        setGarante2(gar2);
    }
    
    public String getTipo_vehiculo() {
        return tipovehiculo;
    }

    public void setTipo_vehiculo(String t) {
        tipovehiculo = t;
    }

    public String getMarca_vehiculo() {
        return marcavehiculo;
    }

    public void setMarca_vehiculo(String m) {
        marcavehiculo = m;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante g2) {
        garante2 = g2;
    }
    
    @Override
    public String toString(){
        return String.format("%s Tipo de Vehiculo: %s "
                + "Marca de Vehiculo: %s Garante 2 -> %s",super.toString(),
                getTipo_vehiculo(),getMarca_vehiculo(),getGarante2().toString());
    
    }
}
