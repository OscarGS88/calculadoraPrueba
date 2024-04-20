package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */

public class main {
    public static void main(String[] args) {
        
        //Creamos el objeto escaner
        Scanner entrada = new Scanner(System.in);
        
        //Creamos objetos Calculadora (usando nuestra clase Calculadora)
        Calculadora calc = new Calculadora("Casio", "DPCS1", "SN34358289");
        Calculadora calc2 = new Calculadora("Patek", "Phillipe", "Gold");
        
        //Usamos los metodos que hay dentro de la clase Calculadora
        calc.suma(3, 6);
        calc2.resta(7, 4);
        
        System.out.print("Marca: " + calc.modelo); //Sacamos atributo
        
    }
}
