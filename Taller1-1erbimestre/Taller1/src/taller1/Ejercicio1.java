/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenafinal;
        String cadenatotales = "";
        Scanner entrada = new Scanner(System.in);
        int hijos = 0; 
        double sueldo = 0;
        double pasajes = 0;
        double bar = 0;
        double salidas = 0;
        double suma_pasajes = 0;
        double suma_bar = 0;
        double suma_salidas = 0;
        double suma_total = 0;
        
        cadenafinal = String.format("%s\n%-15s%-15s%-15s%s\n","Gastos Familia","Persona","Pasajes","Bar","Salidas");
        
        System.out.println("¿Cuánto gana semanalmente?");
        sueldo = entrada.nextDouble();
        System.out.println("¿Cuántos hijos tiene?");
        hijos = entrada.nextInt();
        entrada.nextLine();
        for (int contador = 1; contador <= hijos; contador++){
            System.out.printf("%s%d%s\n","¿Cuánto gasta en pasajes su hijo ",contador,"?");
            pasajes = entrada.nextDouble();
            System.out.printf("%s%d%s\n","¿Cuánto gasta en bares su hijo ",contador,"?");
            bar = entrada.nextDouble();
            System.out.printf("%s%d%s\n","¿Cuánto gasta en salidas su hijo ",contador,"?");
            salidas = entrada.nextDouble();
            cadenafinal = String.format("%s%-5s%-10d%-15.2f%-15.2f%.2f\n",cadenafinal,"Hijo",contador,pasajes,bar,salidas);
            suma_pasajes = suma_pasajes+pasajes;
            suma_bar = suma_bar+bar;
            suma_salidas = suma_salidas+salidas;
            
            cadenatotales = String.format("%-15s%-15.2f%-15.2f%.2f\n","Totales",suma_pasajes,suma_bar,suma_salidas);
            
            suma_total = suma_pasajes+suma_bar+suma_salidas;
        }
        System.out.println(cadenafinal);
        System.out.println(cadenatotales);
        if ( sueldo > suma_total){
            System.out.println("A usted le sobra dinero.");
        }else{
            if ( sueldo < suma_total){
                System.out.println("A usted le falta dinero.");
            }else{
                System.out.println("Usted tiene el dinero necesario.");
            }
        }
    }
    
}
