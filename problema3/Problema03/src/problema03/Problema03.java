/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Sistemas G Didactic
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        String marca;
        String origen;
        double costo;
        double impuesto;
        double precio_venta;
        
        System.out.println("Ingrese la marca de automóvil");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen del automóvil");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automóvil");
        costo = entrada.nextDouble();
        
        if (origen.equals ("Alemania")) {
            impuesto = costo *0.20;
            precio_venta = costo + impuesto;
            
        } else if (origen.equals ("Japon")) {
            impuesto = costo * 0.30;
            precio_venta = costo + impuesto;
            
            } else if (origen.equals ("Italia")) {
                impuesto = costo * 0.15;
                precio_venta = costo + impuesto;
                
                } else if (origen.equals ("USA")) {
                    impuesto = costo * 0.08;
                    precio_venta = costo + impuesto;
                    
                    } else {
                        impuesto = 0;
                        precio_venta = costo + impuesto;
                    }
                
            
        
        System.out.printf("Marca: %s\nOrigen : %s\nCosto: %.2f\n"
                + "Impuesto: %.2f\nPrecio de venta: %.2f\n", marca,
                origen, costo, impuesto, precio_venta);
        
    }    
}    
    

