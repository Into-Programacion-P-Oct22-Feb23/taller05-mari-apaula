/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Sistemas G Didactic
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        double precio_unitario;
        double costo_pedido;
        int cantidad_producto;
        double porcentaje;
        
        System.out.println("Ingrese la cantidad de artículos que se "
                + "requiere");
        cantidad_producto = entrada.nextInt();
        System.out.println("Ingrese el precio unitario del artículos");
        precio_unitario = entrada.nextDouble();
       
        costo_pedido = cantidad_producto * precio_unitario;
        
        if (cantidad_producto > 50 ){
            porcentaje = costo_pedido / 15;
            costo_pedido = costo_pedido - porcentaje;
        } 
        
        System.out.printf("El costo del pedido es de %.2f\nLa cantidad"
                + " requerida es de %d\nEl precio unitario del artículo"
                + " es de %.2f\n", costo_pedido, cantidad_producto, 
                precio_unitario);

    }
    
}
