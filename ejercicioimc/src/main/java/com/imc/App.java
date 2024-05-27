package com.imc;

import java.util.Scanner;


public final class App {
  private App() {
  }

  /**
   * 
   * @param args The arguments of the program.
   */
  public static void main(String[] args) {
    Persona persona1 = new Persona();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, ingresa tu peso (kg): ");
    double peso = scanner.nextDouble(); // Lee la línea de texto peso
    persona1.setPeso(peso);

    System.out.println("Por favor, ingresa su altura (m): ");
    double altura = scanner.nextDouble(); // Lee la línea de texto altura
    persona1.setAltura(altura);

    // Cierra el objeto Scanner para liberar recursos
    scanner.close();

    System.out.println("Su peso introducido es:  " + persona1.getPeso());
    System.out.println("Su altura introducida es: " + persona1.getAltura());
    System.out.println("Su IMC corresponde a: " + persona1.getIMC());

    if (persona1.getIMC() < 17.0) {
      System.out.println("Delgadez Severa");
    } else if (persona1.getIMC() < 18.5) {
      System.out.println("Delgadez Moderada");
    } else if (persona1.getIMC() < 25) {
      System.out.println("Peso normal");
    } else if (persona1.getIMC() < 30) {
      System.out.println("Sobrepeso");
    } else if (persona1.getIMC() < 35) {
      System.out.println("Obesidad leve"); 
    } else if (persona1.getIMC() < 40) {
      System.out.println("Obesidad moderada");
    } else if (persona1.getIMC() > 40) {
      System.out.println("Obesidad mórbida");
    }

    }
  }

