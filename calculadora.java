// cambio de sintaxis
  
package com.mycompany.calculadora;
import java.util.Scanner; //libreria para poder usar Scanner
/**
 *
 * @author jlarr
 */
public class Calculadora {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //in = imput, entrada de datos
    float n1, n2, suma, resta, multiplicacion, division;
    int opcion;
    
        System.out.println("CALCULADORA");
        
        System.out.println("Digite el primer numero: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite el segundo numero: ");
        n2 = entrada.nextFloat();
        
        System.out.println("Que operacion le gustaria iniciar? ");
        System.out.println(" 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division");
        opcion = entrada.nextInt();
        

       
    switch(opcion){
