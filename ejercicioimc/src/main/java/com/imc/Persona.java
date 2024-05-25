package com.imc;

public class Persona {
    private double peso; // es de tipo DOUBLE ya que es numerico
    private double altura;

    // Generate Getters and Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double nuevoPeso) {
        this.peso = nuevoPeso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double nuevaAltura) {
        this.altura = nuevaAltura;
    }

    public double getIMC() {
        return peso / Math.pow(altura, 2);
    }
}
