/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.ciclo.pkgwhile;

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
        String cadenaorigen = "";
        Scanner entrada = new Scanner(System.in);
        String origen;
        String marca;
        int limite = 0;
        int contador = 1;
        int contador_a = 0;
        int contador_c = 0;
        int contador_ch = 0;
        int contador_o = 0;
        double costo = 0;
        double precioventa = 0;
        double impuesto = 0;
        double porcentaje = 0;
        double totalimp = 0;
        double totalpv = 0;
        
        cadenafinal = String.format("\t\t%s\n\n","Reporte de Autos Importados");
        cadenafinal = String.format("%s%-16s%-16s%-15s%-18s%s\n",cadenafinal,"Marca","Origen","Costo","Impuesto","Precio Venta");
        
        System.out.println("Ingrese el número de autos a registrar: ");
        limite = entrada.nextInt();
        entrada.nextLine();
        while (contador <= limite){
            System.out.println("Ingrese la marca del auto: ");
            marca = entrada.nextLine();
            System.out.println("Ingrese el origen del auto: ");
            origen = entrada.nextLine();
            System.out.println("Ingrese el costo del auto: ");
            costo = entrada.nextDouble();
            
            if (origen.equals("Argentina") || origen.equals("argentina")){
                porcentaje = 0.2;
                contador_a = contador_a+1;
            }else{
                if (origen.equals("Colombia") || origen.equals("colombia")){
                    porcentaje = 0.25;
                    contador_c = contador_c+1;
                }else{
                    if (origen.equals("Chile") || origen.equals("chile")){
                       porcentaje = 0.3;
                       contador_ch = contador_ch+1;
                    }else{
                       porcentaje = 0.4;
                       contador_o = contador_o+1;
                    }
                }
            }
            
            impuesto = costo*porcentaje;
            precioventa = costo+impuesto;
            cadenafinal = String.format("%s%-16s%-16s%-15.2f%-18.2f%.2f\n",cadenafinal,marca,origen,costo,impuesto,precioventa);
            totalimp = totalimp+impuesto;
            totalpv = totalpv+precioventa;
            cadenatotales = String.format("%-16s%-8d%-11s%-12.2f%-18s%.2f\n","Total Autos: ",contador,"Tot. Imps: ",totalimp,"Tot. PV:",totalpv);
            contador = contador+1;
        }
        cadenaorigen = String.format("%-24s%d\n%-24s%d\n%-24s%d\n%-24s%d\n","Argentina: ",contador_a,"Colombia",contador_c,"Chile: ",contador_ch,"Resto de países: ",contador_o);
        System.out.println(cadenafinal);
        System.out.println(cadenatotales);
        System.out.println(cadenaorigen);
    }
    
}
