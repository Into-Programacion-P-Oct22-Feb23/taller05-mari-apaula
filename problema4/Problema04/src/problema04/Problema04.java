/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Sistemas G Didactic
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        int descuento1 = 10;
        int descuento2 = 15;
        int descuento3 = 20;
        double valor_descuento;
        int dias_hospedaje;
        double precio_habitacion;
        double subtotal;
        double total;
        
        System.out.println("Ingrese el nuemero de dias que se va a "
                + "hospedar");
        dias_hospedaje = entrada.nextInt();
        System.out.println("Ingrese el precio diario por la habitación");
        precio_habitacion = entrada.nextDouble();
        
        subtotal = dias_hospedaje * precio_habitacion;
        
        if ((dias_hospedaje > 5) && (dias_hospedaje <= 10)) {
            valor_descuento = (subtotal * descuento1)/ 100;
            total = subtotal - valor_descuento;
            
            System.out.println("---------------------------------------");
            System.out.printf("El subtotal es de: %.2f\nDescuento : "
                    + "%d porciento\nEl total es: %.2f\n", subtotal,
                    descuento1,total);
            
        } else if ((dias_hospedaje > 10) && (dias_hospedaje <= 15)) {
            valor_descuento = (subtotal * descuento2)/ 100;
            total = subtotal - valor_descuento;
            
            System.out.println("-----------------------------------------");
            System.out.printf("El subtotal es de: %.2f\nDescuento : "
                    + "%d porciento\nEl total es: %.2f\n", subtotal,
                    descuento2,total);
            
            } else if (dias_hospedaje > 15) {
            valor_descuento = (subtotal * descuento3)/ 100;
            total = subtotal - valor_descuento;
            
            System.out.println("-----------------------------------------");
           System.out.printf("El subtotal es de: %.2f\nDescuento : "
                    + "%d porciento\nEl total es: %.2f\n", subtotal,
                    descuento3,total);
            
            
            
            }
        
        
        
        
        
        
        
    }
    
}
