/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partidos;

import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Partidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los partidos ganados");
        int ganados = entrada.nextInt();
        
        System.out.println("Ingrese los partidos empatados");
        int empatados = entrada.nextInt();
        
        System.out.println("Ingrese los partidos perdidos");
        var perdidos = entrada.nextInt();
        
        int puntos = ganados*3+empatados;
        
        System.out.println("Los puntos son: "+puntos);
        
    }
    
}
