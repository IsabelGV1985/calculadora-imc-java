package com.imc;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
  private App() {
  }

  /**
   * Says hello to the world.
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

    // Cierra el objeto Scanner para liberar recursos5
    scanner.close();

    System.out.println("Su peso introducido es:  " + persona1.getPeso());
    System.out.println("Su altura introducida es: " + persona1.getAltura());
    System.out.println("Su IMC corresponde a: " + persona1.getIMC());
  }
}
