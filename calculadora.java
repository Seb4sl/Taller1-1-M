// CALCULADORA FINAL

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import java.util.Scanner; //libreria para poder usar Scanner
/**
 *
 * @author jlarr
 */
public class Calculadora {

    
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner (System.in); //in = imput, entrada de datos
   
   
    int n1,n2;
    float suma, resta, multiplicacion, division;
    int opcion;
        
    for(;;){
        System.out.println("CALCULADORA");
        System.out.println("Que operacion le gustaria iniciar? ");
        System.out.println(" 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division \n 5. Seno \n 6. Coseno \n 7. Tangente \n 8. Potencia \n 9. Raiz \n 10. Cal. IVA \n 11. Salir");
        do{
        System.out.println("Digite una opcion del 1-11");
        opcion = entrada.nextInt();
        
        }while(opcion<0);
   
    switch(opcion){ //porque "unreachable" statement???
        case 1 -> {
            
            
            System.out.println("Digite el primer numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        n2 = entrada.nextInt();
            suma = n1 + n2;
            System.out.println("El resultado de "+ n1 + " + "+ n2 + " es igual a "+ suma );
            Thread.sleep(5000);
            break;
            }
        
        case 2 -> {
            
            
            System.out.println("Digite el primer numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        n2 = entrada.nextInt();
            resta = n1 - n2;
            System.out.println("El resultado de "+ n1 + " - "+ n2 + " es igual a "+ resta );
            Thread.sleep(5000);
            break;
            }    
        
        case 3 -> {
            
            
            System.out.println("Digite el primer numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        n2 = entrada.nextInt();
            multiplicacion = n1 * n2;
            System.out.println("El resultado de "+ n1 + " x "+ n2 + " es igual a "+ multiplicacion );
            Thread.sleep(5000);
            break;
            }        
       
        case 4 -> {
            
            
            System.out.println("Digite el primer numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        n2 = entrada.nextInt();
            division = n1 / n2; //PORQUE NO ME APARECE EL MENSAJE DEL IF?
            if(n2==0){
                System.out.println("Error de calculo, no se puede dividir sobre 0");
            }else{
            System.out.println("El resultado de "+ n1 + " / "+ n2 + " es igual a "+ division );
            }   
            Thread.sleep(5000);
            break;
        }
        
        case 5 -> {
        double resultado;
        double angulo;
        
        
            System.out.println("Digite el Angulo en grados");
            angulo = entrada.nextDouble();
            
            double anguloRad = Math.toRadians(angulo);
            resultado = Math.sin(anguloRad);
            
            System.out.println(" El seno de "+angulo+"° es "+resultado);
            Thread.sleep(5000);
            break;
            }   
        
        case 6 -> {
        double resultado;
        double angulo;
        
        
            System.out.println("Digite el Angulo en grados");
            angulo = entrada.nextDouble();
            
            double anguloRad = Math.toRadians(angulo);
            resultado = Math.cos(anguloRad);
            
            System.out.println("El coseno de "+angulo+"° es "+resultado);
            Thread.sleep(5000);
            break;
            }   
        
        case 7 -> {
        double resultado;
        double angulo;
        
        
            System.out.println("Digite el Angulo en grados");
            angulo = entrada.nextDouble();
            
            double anguloRad = Math.toRadians(angulo);
            resultado = Math.tan(anguloRad);
            
            System.out.println("La tangente de "+angulo+"° es "+resultado);
            Thread.sleep(5000);
            break;
            }   
        
        case 8 -> {
        double base;
        double potencia;

            System.out.println("Digite la base");
            base = entrada.nextDouble();
            
            System.out.println("Digite la potencia");
            potencia = entrada.nextDouble();
            
        double resultado = Math.pow(base, potencia);
            
            System.out.println("La base "+base+" elevado a "+potencia+" = "+resultado);
            Thread.sleep(5000);
            break;
            }       
        
        case 9 -> {
        int base;
        int raiz;

            
            System.out.println("Digite la base");
            base = entrada.nextInt();

            System.out.println("Digite la raiz");
            raiz = entrada.nextInt();
            
        double resultado = Math.pow(base, 1/raiz);
        
            System.out.println(raiz+" raiz de "+base+" = "+resultado);
            Thread.sleep(5000);
             break;
        }
        
        case 10 -> {
        
        float precio;


         System.out.println("Ingrese el precio total de la compra: ");
        precio = entrada.nextFloat();
        double resultado = (precio * 0.19); 
        double total = resultado + precio;
        System.out.println("El precio total sin IVA es de: "+precio);
        System.out.println("Al producto aumentele "+resultado);
        System.out.println("El precio a pagar (IVA incluido) es de: "+total);
        Thread.sleep(5000);
             break;
        }
        
        case 11 -> {
        
       
        System.out.println("Programa finalizado");
        Thread.sleep(3000);
         System.exit(0);
        }
        default -> System.out.println("El numero no fue encontrado");
        
    }   
    }
}
    }
