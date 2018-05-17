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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenafinal;
        String cadenatotales = "";
        String dinero = "";
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int hijos = 0;
        int padres = 0;
        double sueldo = 0;
        double pasajes = 0;
        double bar = 0;
        double salidas = 0;
        double suma_pasajes = 0;
        double suma_bar = 0;
        double suma_salidas = 0;
        double suma_total = 0;
        
        cadenafinal = String.format("%s\n","Reporte Gastos de Padre de Familia");
        
        System.out.println("Ingrese el número de usuarios de quienes va a registrar los datos:");
        padres = entrada.nextInt();
        entrada.nextLine();
        for (int contadorsup = 1; contadorsup <= padres; contadorsup++){
            System.out.println("¿Cuál es su nombre?");
            nombre = entrada.nextLine();
            System.out.println("¿Cuánto gana semanalmente?");
            sueldo = entrada.nextDouble();
            System.out.println("¿Cuántos hijos tiene?");
            hijos = entrada.nextInt();
            entrada.nextLine();
            cadenafinal = String.format("%s%s%s\n%s%.2f\n%s%d\n\n",cadenafinal,"Nombre del padre de familia: ",nombre,"Sueldo Semanal: ",sueldo,"Número de hijos: ",hijos);
            cadenafinal = String.format("%s%s\n%-15s%-15s%-15s%s\n",cadenafinal,"Reporte de Gastos","Persona","Pasajes","Bar","Salidas");
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
            
                cadenatotales = String.format("%-15s%-15.2f%-15.2f%.2f\n\n","Totales",suma_pasajes,suma_bar,suma_salidas);
                
                cadenafinal = String.format("%s%s",cadenafinal,cadenatotales);
            
                suma_total = suma_pasajes+suma_bar+suma_salidas;
            }
            suma_pasajes = 0;
            suma_bar = 0;
            suma_salidas = 0;
            if ( sueldo > suma_total){
                dinero = "sobra";
            }else{
                if ( sueldo < suma_total){
                    dinero = "falta";
                }else{
                    dinero = "alcanza";
                }
            }
            cadenafinal = String.format("%s%s%s%s%s%s\n\n",cadenafinal,"El padre de familia ",nombre," le ",dinero," el dinero.");
            entrada.nextLine();
        }
        System.out.println(cadenafinal);
    }
    
}
