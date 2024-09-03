/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class EVA1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTURA
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        //CREAR NUESTRO ESCANER
        Scanner captu;
        captu = new Scanner(System.in);
        //capturar:
        System.out.println("CAPTURA EL NOMBRE DE LA PELICULA");
        nombre = captu.nextLine();
        System.out.println("CAPTURA EL GENERO");
        genero = captu.nextLine();
        System.out.println("CAPTURA LA DURACION");
        duracion = captu.nextInt();
        System.out.println("CAPTURA EL REPARTO");
        reparto = captu.nextLine();
        System.out.println("CAPTURA LA CLASIFICACION");
        clasificacion = captu.nextLine();
        //IMPRECION:
        System.out.println("SECCIÓN DE IMPRESIÓN DE DATOS");
        System.out.println("NOMBRE:");
        System.out.println(nombre);
        System.out.println("GENERO:");
        System.out.println(genero);
        System.out.println("DURACION:");
        System.out.println(duracion);
        System.out.println("REPARTO:");
        System.out.println(reparto);
        System.out.println("CLASIFICACION:");
        System.out.println(clasificacion);
        

        
        
        

        
        
        
                
    }
    
}
