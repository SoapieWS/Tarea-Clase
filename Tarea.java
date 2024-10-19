/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double CC,FF;
        
        System.out.println("Ingrese los grados en Farenheit: ");
        FF = entrada.nextDouble();
        CC = (FF-32)*5/9;
        
        System.out.println("Sus grados Celsius son: "+CC);
        
    }
    
}
