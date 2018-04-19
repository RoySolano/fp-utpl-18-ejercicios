/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion
        Scanner entrada = new Scanner(System.in);
        String estudiante;
        double calificacion;
        System.out.println("Ingrese su nombre:");
        estudiante = entrada.nextLine();
        System.out.println("Ingrese su calificación:");
        calificacion = entrada.nextDouble();

        if (calificacion >= 90) {
            System.out.printf("Estudiante: %s\nAprobado\nCon: %f\n", estudiante.toUpperCase(),calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("Estudiante: %s\nAprobado\nCon: %f\n", estudiante.toUpperCase(),calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("Estudiante: %s\nAprobado\nCon: %f\n", estudiante.toUpperCase(),calificacion);

                } else {
                    System.out.printf("Estudiante: %s\nReprobado\nCon: %f\n", estudiante.toUpperCase(),calificacion);
                }
            }
        }
    }
}
