/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;
       
/**
 *
 * @author Sistemas G Didactic
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        double costo_kwhora; 
        double kw_consumidos;
        int edad;
        double total_planilla;
        double porcentaje_descuento;
        
        System.out.println("Ingrese el costo por Kw/h");
        costo_kwhora = entrada.nextDouble();
        System.out.println("Ingrese los Kw consumidos");
        kw_consumidos = entrada.nextDouble();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        
        total_planilla = costo_kwhora * kw_consumidos;
        
        if (edad > 65 ){
            porcentaje_descuento = total_planilla / 10;
            total_planilla = total_planilla - porcentaje_descuento;
        } 
        
        System.out.printf("El valor a cancelar de la planilla de luz "
                + "es de %.2f", total_planilla);
    }  
    }
    

