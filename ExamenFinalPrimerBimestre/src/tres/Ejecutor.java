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
public class Ejecutor {
    public static void main(String[] args) {
        
        Coches c1 =new Coches("Adf24","Rojo","Restolin",10,3);
        Microbuses m1 = new Microbuses("WES45","Negro","UrbanSur",5,2);
        Camiones ca1 = new Camiones("VCY4Z","Azul", "CA", 2,7);
        Furgonetas f1 = new Furgonetas("BUR4R","GREY","Tucso",3);
        Vehiculos vehiculos[] = new Vehiculos[4];
        vehiculos[0] = c1;
        vehiculos[1] = m1;
        vehiculos[2] = ca1;
        vehiculos[3] = f1;
        
        for(Vehiculos vehiculo_actual: vehiculos){
            System.out.printf("%s\n Precio del Alquiler: %.2f \n",vehiculo_actual.toString(), vehiculo_actual.obtener_precio_alquiler());
        
        }
    }
}
