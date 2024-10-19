/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nota_final;

import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Nota_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float promedio,calificacion1,calificacion2,calificacion3,examen,trabajo,promedio_final;
        System.out.println("Ingrese sus 3 calificaciones");
        calificacion1 = entrada.nextFloat();
        calificacion2 = entrada.nextFloat();
        calificacion3 = entrada.nextFloat();
        promedio = (calificacion1+calificacion2+calificacion3)/3;
        
        System.out.println("Ingrese la calificacion de su examen final");
        examen = entrada.nextFloat();
        System.out.println("Ingrese la nota de su trabajo final");
        trabajo = entrada.nextFloat();
        promedio_final = (promedio * .55f) + (examen * .30f) + (trabajo * .15f);
        System.out.println("El promedio final de la materia de algoritmos es"+promedio_final);
    }
    
}
