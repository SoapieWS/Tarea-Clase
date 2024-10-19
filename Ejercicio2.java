/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base");
        double base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        double altura = entrada.nextDouble();
        double perimetro = base*2 + altura*2;
        System.out.println("el perimetro es: "+perimetro);
    }
    
}
