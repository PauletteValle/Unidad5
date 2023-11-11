/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac2u4u5metodos;

/**
 *
 * @author moram
 */
public class Prac2U4U5Metodos {

    public static void main(String[] args) {
        
        // Ejemplo de uso de los métodos que igual dejo de tarea
        double numero1 = 10;
        double numero2 = 5;
        double resultado;

        double sumaResultado = suma(numero1, numero2);
        
        double restaResultado = resta(numero1, numero2);
        
        double multiplicacionResultado = multiplicacion(numero1, numero2);
        
        double divisionResultado = division(numero1, numero2);

        // Mostrar resultados de cada opracion
        
        System.out.println("Suma: " + sumaResultado);
        
        System.out.println("Resta: " + restaResultado);
        
        System.out.println("Multiplicación: " + multiplicacionResultado);
        
        System.out.println("División: " + divisionResultado);
    }

    // metodo para la suma (+)
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    // metodo para laa resta (-)
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    // metodo para la multiplicacion (*)
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    // metodo para la divicon (/)
    public static double division(double num1, double num2) {
double resultado = num1/num2; 
        if (num2 != 0) {
            return resultado; 
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0.0;
        }
    }

    }
