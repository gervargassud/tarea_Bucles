/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_bucles.pkg2;

import java.util.Scanner;
        
        
public class Tarea_Bucles2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
                
        float n1,sum = 0, Prom ;
        int cont = 0 ;
        for(int i = 1; i <= 3; i++){
       
        System.out.println("Ingrese un numero: ");
        
        n1 = leer.nextFloat();
        
        sum = sum + n1;
        
        cont++;
        
        }  
       Prom = sum / cont;
        System.out.println("El primedio de los numeros ingresados es: " +Prom);
    }
    
}
