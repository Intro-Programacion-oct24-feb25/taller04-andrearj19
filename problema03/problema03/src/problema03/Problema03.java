/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Edgar Arias
 */
import java.util.Scanner;
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner datos = new Scanner(System.in);
        
        double minutos;
        double costo;
        String nombre;
        String domicilio;
        double calculo;
        
        System.out.print("Ingrese su nombre completo: ");
        nombre = datos.nextLine();
        System.out.print("Ingrese la direccion de su domicilio: ");
        domicilio = datos.nextLine();
        System.out.print("Ingrese el costo por minutos: $");
        costo = datos.nextDouble();
        System.out.print("Ingrese los número de minutos consumidos en el mes: ");
        minutos = datos.nextDouble();
        
        calculo = costo*minutos;
        
        System.out.printf("Reporte:\nNombres completos: %s\n  Direccion: %s\n"
                + "Costo por minuto: $%.2f\n  Número de minutos consumidos: %."
                + "2f\n"
                + "    Valor a cancelar: $%.2f",
                nombre,
                domicilio,
                costo,
                minutos, 
                calculo);
    }
    
}
