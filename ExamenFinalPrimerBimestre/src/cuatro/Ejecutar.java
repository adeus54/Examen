/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Ejecutar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean ban = true;
        do{
        try{
        System.out.println("Ingrese su nombre");
        String nombre = scan.nextLine();

        System.out.println("Ingrese su apellido");
        String apellido = scan.nextLine();

        String[] calificaciones = {"10", "15", "l"};
        Persona p = new Persona(nombre, apellido, calificaciones);
        System.out.println(p);
        ban = false;
        }catch(Exception e){
            System.err.printf("\nExcepcion: %s\n",e);
            scan.nextLine();
            System.out.print("Algo no anjsda bien. Ingrese de nuevo.. o "
                    + "Revise su codificacion..");
            
        }
        }while(ban = true);
    }
            
}
