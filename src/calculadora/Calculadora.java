package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */

public class Calculadora {

 //Atributos (siempre en privado)
 private String marca; //Modo privado (solo dentro de la clase)
 String modelo; //Modo publico o default (todo el mundo);
 protected String nserie; //Modo protegido (solo se accede dentro de la clase o en otra clase del mismo paquete)
 

 //Constructor (siempre publico)
 public Calculadora(String marca, String modelo, String nserie){
 this.marca = marca;
 this.modelo = modelo;
 this.nserie = nserie;
 }

 public Calculadora() {
 }
 

 

 //Métodos (depende de lo que quieras hacer)
 public double suma(double n1, double n2) {
 return n1+n2;
}
 
 public void suma(int n1, int n2) { //Sobrecarga: es decir, creamos un metodo igual, pero con otros datos, entonces dependiendo del tipo usa uno u otro.
    System.out.println("La suma de enteros" + n1 + " mas " + n2 + " es " + (n1+n2));
}
 
 public double resta(double n1, double n2) {
    return n1-n2;
}
 
 public double multiplica(double n1, double n2) {
    return n1*n2;
}
 
 public double divide(double n1, double n2) {
   return n1/n2;
}
 
    public static int calcularModulo(int dividendo, int divisor) {
        // Asegurarse de que el divisor no sea cero
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        
        // Calcular el módulo utilizando el operador % (módulo)
        int modulo = dividendo % divisor;
        
        return modulo;
    }
 
 //Getters y Setters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNserie() {
        return nserie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }
 
}
