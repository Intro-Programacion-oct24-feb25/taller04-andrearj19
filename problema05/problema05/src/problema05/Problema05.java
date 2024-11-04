/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author Edgar Arias
 */
import java.util.Scanner;
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        
        double net;
        double yt;
        double db;
        double sf;
        double des1;
        double dy;
        double des2;
        double cal;
        double sd;
        
        
        System.out.print("Ingrese el valor de consumo de netflix: $");
        net = datos.nextDouble();
        System.out.print("Ingrese el valor de consumo de Youtbe Premium: $");
        yt = datos.nextDouble();
        System.out.print("Ingrese el valor de consumo de Dropbox: $");
        db = datos.nextDouble();
        System.out.print("Ingrese el valor de consumo de spotify: $");
        sf = datos.nextDouble();
        
        sd = net+yt+db+sf;
        dy = net * 0.77;
        des1 = yt*0.77;
        des2 = db*0.55;
        
        cal = dy+des1+des2+sf;
        
        System.out.printf("__________________________________________________"
                + "_____"
                + "_____\n"
                + "-Reporte sobre el total mensual de los servicios "
                + "digitales-\n________________________________________________"
                + "___"
                + "_______"
                + "__\nSubtotal: $%.2f\nDescuentos: \n\tNetflix 23%%: $"
                + "%.2f\n\tYoutube Premium 23%%: $%.2f\n\tDropbox 45%%: $%.2f\n"
                + "Sin descuento: \n\tSpotify: $%.2f\n_________________________"
                + "_____"
                + "______________________________\nTotal: $%.2f"
                + "\n__________________________________________________________"
                + "__\n",
                sd,
                dy,
                des1,
                des2,
                sf,
                cal);
    }
    
}
