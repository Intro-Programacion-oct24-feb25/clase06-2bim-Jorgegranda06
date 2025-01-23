/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];

        for (int i = 0; i < valor; i++) {
            try {
                System.out.print("Ingrese el dividendo: ");
                int dividendo = entrada.nextInt();
                System.out.print("Ingrese el divisor: ");
                int divisor = entrada.nextInt(); 
                resultados[i] = dividendo / divisor;
                System.out.println("Resultado: " + resultados[i]);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("ArithmeticException: La división no puede "
                        + "ser por cero");
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("InputMismatchException: Solo debe ingresar "
                        + "números enteros.");
            }
        }
    }
}