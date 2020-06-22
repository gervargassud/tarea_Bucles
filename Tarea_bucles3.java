/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_bucles.pkg3;

import java.util.Scanner;
        
        
public class Tarea_bucles3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long n1, i = 0, res;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero para multiplicar: ");
        n1 = entrada.nextLong();
        
        while (i <=20){
            
            res = n1 * i;
            
            System.out.print("el resultado de multiplicarlo por " + i);
            System.out.println(" Es : " + res);
            
            i++;
            
        }
        
    }
    
}
