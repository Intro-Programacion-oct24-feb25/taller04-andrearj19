/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Edgar Arias
 */
import java.util.Scanner;
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner componentes = new Scanner(System.in);
        
        String nombre;
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double total;

        System.out.print("Ingrese el nombre del cliente: ");
        nombre = componentes.nextLine();
        System.out.print("Ingrese el costo del CPU: $");
        cpu = componentes.nextDouble();
        System.out.print("Ingrese el costo del teclado: $");
        teclado = componentes.nextDouble();
        System.out.print("Ingrese el valor de la pantalla; $");
        pantalla = componentes.nextDouble();
        System.out.print("Ingrese el valor del ratón: $");
        raton = componentes.nextDouble();
        
        
        total = cpu+pantalla+raton+teclado;
        /*Segun la indicacion al imprimir el resultado debe ser un valor entero
        sin decimlaes algunos !!/esto no(7.oo), entonces para seguir al pie la 
        indicacion cancelamos todos los decimales a la hora de imprimir para que 
        salga un valor exacto ($7)*/
        System.out.printf("Reporte: \nNombres del cliente: %s\nValores "
                + "iniciales:"
                + "\nCPU:  $ %.0f\nTeclado:  $ %.0f\nRatón:  $ %.0f\n"
                + "Pantalla:  $ %.0f\n\n\nValor a cancelar: $%.0f",
                nombre,
                cpu,
                teclado,
                raton,
                pantalla,
                total);
    
    }
    
}
