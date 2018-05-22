/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareafor;

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
        String cadenafinal;//cadena que almcena todos los reportes
        String cadenapromedio = "";//cadena que almacena los promedios totales de cada estudiante
        String rendimiento = "";//variable que almacena: Sobresaliente, muy bueno, bueno o regular
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String n_asignatura = "";
        int asignatura = 0;//límite del segundo ciclo
        int estudiantes;//límite del primer ciclo
        int edad = 0;
        double nota1 = 0;
        double nota2 = 0;
        double promedio = 0;
        double sumaedad = 0;//variable acumuladora de las edades
        double suma_promedio = 0;//variable acumuladora de los promedios entre bimestres
        double sumageneral = 0;//variable acumuladora de los promedios totales de los estudiantes 
        double promediototal = 0;// variable del promedio entre los promedios en las respectivas asignaturas
        double promedioedad = 0;
        double promediogeneral = 0;//variable del promedio entre los promedios totales de los estudiantes
        
        cadenafinal = String.format("%s\n","Reporte de calificaciones de estudiantes");
        
        System.out.println("Ingrese el número de estudiantes de quienes va a registrar los datos:");
        estudiantes = entrada.nextInt();
        for (int contadorsup = 1; contadorsup <= estudiantes; contadorsup++){
            entrada.nextLine();
            System.out.printf("%s%d%s\n","Ingrese nombre de estudiante ",contadorsup,":");
            nombre = entrada.nextLine();
            System.out.printf("%s%d%s\n","Ingrese edad de estudiante ",contadorsup,":");
            edad = entrada.nextInt();
            System.out.println("Ingrese el número de asignaturas de dicho estudiante: ");
            asignatura = entrada.nextInt();
            cadenafinal = String.format("%s%s%d%s%s\n%s%d\n%s%d\n\n",cadenafinal,"Nombre de estudiante ",contadorsup,": ",nombre,"Edad: ",edad,"Número de asignaturas: ",asignatura);
            cadenafinal = String.format("%s%s\n%-15s%-15s%-15s%s\n",cadenafinal,"Reporte de Notas","Asignatura","Bim-1","Bim-2","Promedio");
            for (int contador = 1; contador <= asignatura; contador++){
               entrada.nextLine();
                System.out.printf("%s%d%s\n","Ingrese el nombre de la asignatura ",contador,":");
                n_asignatura = entrada.nextLine();
                System.out.printf("%s\n","Ingrese la calificación del primer bimestre: ");
                nota1 = entrada.nextDouble();
                System.out.printf("%s\n","Ingrese la calificación del segundo bimestre: ");
                nota2 = entrada.nextDouble();
                promedio = (nota1+nota2)/2;
                cadenafinal = String.format("%s%-15s%-15.2f%-15.2f%.2f\n",cadenafinal,n_asignatura,nota1,nota2,promedio);
                suma_promedio = suma_promedio+promedio;
            }
               
            promediototal = suma_promedio/asignatura;
            
            suma_promedio = 0;
            
            cadenapromedio = String.format("%-30s%-15s%.2f\n\n","","Promedio Total:",promediototal);
            
            cadenafinal = String.format("%s%s",cadenafinal,cadenapromedio);
            
            if ( promediototal >= 19){
                rendimiento = "sobresaliente";
            }else{
                if ( promediototal >= 16 && promediototal < 19){
                    rendimiento = "muy bueno";
                }else{
                    if (promediototal >= 13 && promedio < 16){
                       rendimiento = "bueno";
                    }else{
                        rendimiento = "regular";
                    }
                }
            }
            cadenafinal = String.format("%s%s%s%s%s\n\n",cadenafinal,nombre.toUpperCase()," tiene un promedio de ",rendimiento,".");
            entrada.nextLine();
            sumaedad = sumaedad+edad;
            promedioedad = sumaedad/estudiantes;
            sumageneral = sumageneral+promediototal;
            promediogeneral = sumageneral/estudiantes;
        }
        System.out.println(cadenafinal);
        System.out.println("Información global de los estudiantes");
        System.out.printf("%s%.2f\n","Promedio de edad es: ",promedioedad);
        System.out.printf("%s%.2f\n","Promedio de notas de los estudientes es: ",promediogeneral);
    }    
}
    

