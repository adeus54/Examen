/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc1_nombre, doc1_apellido, doc1_titulo;
        String doc2_nombre, doc2_apellido, doc2_titulo;
        String alum_nombre, alum_apellido;
        char resp;
        do {
            System.out.print("Ingrese el nombre del Alumno: ");
            alum_nombre = sc.nextLine();
            System.out.print("Ingrese el apellido del Alumno: ");
            alum_apellido = sc.nextLine();
            System.out.print("Ing`rese nombre Docente 1: ");
            doc1_nombre = sc.nextLine();
            System.out.print("Ingrese apellido Docente 1: ");
            doc1_apellido = sc.nextLine();
            System.out.print("Ingrese el titulo del Docente 1: ");
            doc1_titulo = sc.nextLine();
            System.out.print("Ingrese nombre Docente 2: ");
            doc2_nombre = sc.nextLine();
            System.out.print("Ingrese apellido Docente 2: ");
            doc2_apellido = sc.nextLine();
            System.out.print("Ingrese el titulo del Docente 2: ");
            doc2_titulo = sc.nextLine();

            Docente d1 = new Docente(doc1_nombre, doc1_apellido, doc1_titulo);
            Docente d2 = new Docente(doc2_nombre, doc2_apellido, doc2_titulo);
            Alumno alumno = new Alumno(alum_nombre, alum_apellido, d1, d2);

            System.out.println(alumno.toString());

            System.out.println("Quiere ingresar otro: S/N");
            resp = sc.next().charAt(0);

            sc.nextLine();
        } while (resp == 'S' || resp == 's');
    }
}
