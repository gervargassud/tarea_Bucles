/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_bucles.pkg1;

import java.util.Scanner;

public class Tarea_Bucles1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        int numero,sum1 = 0,sum2 = 0;
        for(int i = 1; i <=4 ; i++){
            
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        
        if ((numero % 2) == 0){
           sum1 = sum1 + numero; 
        } else {
            
            sum2 = sum2 + numero;
            
        }
        }
        
        System.out.println("La sumatoria de los pares es: " +sum1);
        System.out.println("La sumatoria de los impares es: " +sum2);
    }
    
}
