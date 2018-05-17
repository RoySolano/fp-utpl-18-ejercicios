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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenafinal;
        String cadenasubtotal = "";
        String cadenaiva = "";
        String cadenatotal = "";
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String articulo;
        boolean opcion = true;
        int cantidad = 0;
        double precio = 0;
        double preciototal = 0;
        double subtotal = 0;
        double iva = 0;
        double total = 0;
        
        cadenafinal = String.format("\t\t%s\n\n%s \"%s\"\n","Factura","Supermercado","Todo a menor precio");
        
        System.out.println("Ingrese su nombre y apellido: ");
        nombre = entrada.nextLine();
        cadenafinal = String.format("%s%s%s\n\n",cadenafinal,"Nombre del cliente: ",nombre);
        cadenafinal = String.format("%s%-16s%-16s%-24s%s\n",cadenafinal,"Artículo","Cantidad","Precio Unitario","Precio Total");
        
        while (opcion){
            System.out.println("Ingrese el nombre del artículo: ");
            articulo = entrada.nextLine();
            System.out.println("Ingrese la cantidad de dicho artículo: ");
            cantidad = entrada.nextInt();
            System.out.println("Ingrese el precio del artículo: ");
            precio = entrada.nextDouble();
            
            preciototal = precio*cantidad;
            cadenafinal = String.format("%s%-16s%-16d%-24.2f%.2f\n",cadenafinal,articulo,cantidad,precio,preciototal);
            subtotal = subtotal+preciototal;
            iva = subtotal*0.14;
            total = subtotal+iva;
            cadenasubtotal = String.format("%32s%-24s%.2f","","Subtotal",subtotal);
            cadenaiva = String.format("%32s%-24s%.2f","","Iva",iva);
            cadenatotal = String.format("%32s%-24s%.2f","","Total",total);
            
            entrada.nextLine();
            System.out.println("¿Desea salir del sistema?");
            String temporal = entrada.nextLine();
            if (temporal.equals("si") || temporal.equals("Si")){
                opcion  = false;
            }
        }
        System.out.println(cadenafinal);
        System.out.println(cadenasubtotal);
        System.out.println(cadenaiva);
        System.out.println(cadenatotal);
    }
    
}
