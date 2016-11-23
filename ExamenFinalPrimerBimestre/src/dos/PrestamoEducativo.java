package dos;

/**
 *
 * @author TOSHIBA
 */
public class PrestamoEducativo extends Prestamo {
    private String nivelestudio;
    private String nombre_centroeducativo;
    private Garante garante2;
    private Garante garante3;

    public PrestamoEducativo(String nom_ben, double s, double mon, double in,
            double time, Garante gar1, String nivele, String nombre_c, 
            Garante gar2, Garante gar3) {
        super(nom_ben, s, mon, in, time, gar1);
        setNivel_estudio(nivele);
        setNombre_centro_educativo(nombre_c);
        setGarante2(gar2);
        setGarante3(gar3);
    }
    
    public String getNivel_estudio() {
        return nivelestudio;
    }

    public void setNivel_estudio(String nivel) {
        nivelestudio = nivel;
    }

    public String getNombre_centro_educativo() {
        return nombre_centroeducativo;
    }

    public void setNombre_centro_educativo(String nombre_centro) {
        nombre_centroeducativo = nombre_centro;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante g2) {
        garante2 = g2;
    }

    public Garante getGarante3() {
        return garante3;
    }

    public void setGarante3(Garante g3) {
        garante3 = g3;
    }
    
    @Override
    public String toString(){
        return String.format("%s Nivel de estudio: %s Nombre Institucion: %s  "
                + "Garante 2: %s Garante 3 -> %s",super.toString(),getNivel_estudio(),
                getNombre_centro_educativo(),getGarante2().toString(),getGarante3().toString());
    
    }
    
    
}
