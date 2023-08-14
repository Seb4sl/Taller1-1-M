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
        System.out.println(" 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division \n 5. Seno \n 6. Coseno \n 7. Tangente \n 8. Salir");
        opcion = entrada.nextInt();

    switch(opcion){
        case 1 -> {
            suma = n1 + n2;
            System.out.println("El resultado de "+ n1 + "+"+ n2 + "es igual a"+ suma );
            }
        
        case 2 -> {
            resta = n1 - n2;
            System.out.println("El resultado de "+ n1 + "-"+ n2 + "es igual a"+ resta );
            }    
        
        case 3 -> {
            multiplicacion = n1 * n2;
            System.out.println("El resultado de "+ n1 + "X"+ n2 + "es igual a"+ multiplicacion );
            }        
       
        case 4 -> {
            division = n1 / n2;
            System.out.println("El resultado de "+ n1 + "/"+ n2 + "es igual a"+ division );
            }   
