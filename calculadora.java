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
    int n1,n2;
    float suma, resta, multiplicacion, division;

    int opcion;
    
        System.out.println("CALCULADORA");
        
        System.out.println("Digite el primer numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        n2 = entrada.nextInt();
        
        System.out.println("Que operacion le gustaria iniciar? ");
        System.out.println(" 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division \n 5. Seno \n 6. Coseno \n 7. Tangente \n 8. Potencia \n 9. Raiz \n 10. Cal. IVA \n 11. Salir");
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
            division = n1 / n2; //PORQUE NO ME APARECE EL MENSAJE DEL IF?
            if(n2==0){
                System.out.println("Error de calculo, no se puede dividir sobre 0");
            }else{
            System.out.println("El resultado de "+ n1 + "/"+ n2 + "es igual a"+ division );
            }   
        }
        
        case 5 -> {
        double resultado;
        double angulo;
        
        
            System.out.println("Digite el Angulo en grados");
            angulo = entrada.nextDouble();
            
            double anguloRad = Math.toRadians(angulo);
            resultado = Math.sin(anguloRad);
            
            System.out.println("El seno de "+angulo+"° es "+resultado);
            }   
        
        case 6 -> {
        double resultado;
        double angulo;
        
        
            System.out.println("Digite el Angulo en grados");
            angulo = entrada.nextDouble();
            
            double anguloRad = Math.toRadians(angulo);
            resultado = Math.cos(anguloRad);
            
            System.out.println("El coseno de "+angulo+"° es "+resultado);
            }   
        
        case 7 -> {
        double resultado;
        double angulo;
        
        
            System.out.println("Digite el Angulo en grados");
            angulo = entrada.nextDouble();
            
            double anguloRad = Math.toRadians(angulo);
            resultado = Math.tan(anguloRad);
            
            System.out.println("La tangente de "+angulo+"° es "+resultado);
            }   
        
        case 8 -> {
        double base;
        double potencia;

            System.out.println("Digite la base");
            base = entrada.nextDouble();
            
            System.out.println("Digite la potencia");
            potencia = entrada.nextDouble();
            
        double resultado = Math.pow(base, potencia);
            
            System.out.println(+base+"^"+potencia+"="+resultado);
            }       
        
        case 9 -> {
        int base;
        int raiz;

            
            System.out.println("Digite la base");
            base = entrada.nextInt();

            System.out.println("Digite la raiz");
            raiz = entrada.nextInt();
            
        double resultado = Math.pow(base, 1/raiz);
        
            System.out.println(+raiz+"raiz de "+base+"="+resultado);
             
        }
        
        default -> System.out.println("El numero no fue encontrado");      
        
        
    }
       
    }
}
