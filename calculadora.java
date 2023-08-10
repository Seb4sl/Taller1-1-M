package com.mycompany.calculadora;

import java.util.Scanner; //importar la clase Scanner del paquete

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //se utiliza para leer la entrada del usuario desde la consola o desde otro flujo de entrada

        System.out.println("Bienvenido a su calculadora basica");
        System.out.print("Ingresa el primer número: "); 
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Elige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
      System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
          case 2:
                resultado = restar(num1, num2);
              break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opción inválida");

  
