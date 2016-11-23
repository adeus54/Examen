package dos;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Ejecutor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Declaracion de arreglos 
        String[] nombre_gar1 = new String[3];
        String[] nombre_gar2 = new String[3];
        String[] nombre_gar3 = new String[3];
        String[] apellido_gar1 = new String[3];
        String[] apellido_gar2 = new String[3];
        String[] apellido_gar3 = new String[3];
        double[] sueldo_gar1 = new double[3];
        double[] sueldo_gar2 = new double[3];
        double[] sueldo_gar3 = new double[3];

        String[] nombre_bene = new String[3];
        double[] sueldo_bene = new double[3];
        double[] monto_pres = new double[3];
        double[] interes = new double[3];
        double[] tiempo = new double[3];

        String[] tipo_vehiculo = new String[3];
        String[] marca_vehiculo = new String[3];

        String[] nivel_estudio = new String[3];
        String[] centro_edu = new String[3];
        //Ciclo para ingresar todos los datos por teclado
        for (int i = 0; i < 1; i++) {

            System.out.print("Ingrese nombre Beneficiario: ");
            nombre_bene[i] = sc.nextLine();
            System.out.print("Ingrese salario del beneficiario: ");
            sueldo_bene[i] = sc.nextDouble();
            System.out.print("Ingrese el monto del prestamo: ");
            monto_pres[i] = sc.nextDouble();
            System.out.print("Ingrese el interes: ");
            interes[i] = sc.nextDouble();
            System.out.print("Ingrese el tiempo en a\u00F1os: ");
            tiempo[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese nombre Garante 1: ");
            nombre_gar1[i] = sc.nextLine();
            System.out.print("Ingrese nombre Garante 2: ");
            nombre_gar2[i] = sc.nextLine();
            System.out.print("Ingrese nombre Garante 3: ");
            nombre_gar3[i] = sc.nextLine();
            System.out.print("Ingrese apellido Garante 1: ");
            apellido_gar1[i] = sc.nextLine();
            System.out.print("Ingrese apellido Garante 2: ");
            apellido_gar2[i] = sc.nextLine();
            System.out.print("Ingrese apellido Garante 3: ");
            apellido_gar3[i] = sc.nextLine();
            System.out.print("Ingrese sueldo de Garante 1: ");
            sueldo_gar1[i] = sc.nextDouble();
            System.out.print("Ingrese sueldo de Garante 2: ");
            sueldo_gar2[i] = sc.nextDouble();
            System.out.print("Ingrese sueldo de Garante 3: ");
            sueldo_gar3[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese tipo de Vehiculo: ");
            tipo_vehiculo[i] = sc.nextLine();
            System.out.print("Ingrese marca de Vehiculo: ");
            marca_vehiculo[i] = sc.nextLine();
            System.out.print("Ingrese nivel de estudio: ");
            nivel_estudio[i] = sc.nextLine();
            System.out.print("Ingrese el nombre del centro educativo: ");
            centro_edu[i] = sc.nextLine();
        }
        System.out.println("\tPrestamos Automovil");
        //Ciclo para presentar los prestamos de los automoviles
        for (int i = 0; i < 2; i++) {
            Garante g1 = new Garante(nombre_gar1[i], apellido_gar1[i], sueldo_gar1[i]);
            Garante g2 = new Garante(nombre_gar2[i], apellido_gar2[i], sueldo_gar2[i]);

            System.out.printf("\nPrestamo %d\n", i + 1);
            PrestamosAutomovil a1 = new PrestamosAutomovil(nombre_bene[i],
                    sueldo_bene[i], monto_pres[i], interes[i], tiempo[i],
                    g1, tipo_vehiculo[i], marca_vehiculo[i], g2);

            System.out.printf("%s\n\n Valor total: %.2f",a1.toString(),a1.ValorTotal());

        }

        System.out.println("\tPrestamo Educativos");
        //Ciclo para presentar los Prestamos Educativos
        for (int i = 0; i < 3; i++) {
            //Declaracion de Instancias
            Garante g1 = new Garante(nombre_gar1[i], apellido_gar1[i], sueldo_gar1[i]);
            Garante g2 = new Garante(nombre_gar2[i], apellido_gar2[i], sueldo_gar2[i]);
            Garante g3 = new Garante(nombre_gar3[i], apellido_gar3[i], sueldo_gar3[i]);

            System.out.printf("\nPrestamo %d \n", i + 1);
            PrestamoEducativo e = new PrestamoEducativo(nombre_bene[i],
                    sueldo_bene[i], monto_pres[i], interes[i], tiempo[i],
                    g1, nivel_estudio[i], centro_edu[i], g2, g3);

            System.out.printf("%s\n\n Valor total: %.2f",e.toString(),e.ValorTotal());
            

        }

    }
}
