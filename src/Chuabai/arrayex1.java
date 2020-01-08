/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuabai;

import java.util.Scanner;

/**
 *
 * @author admins
 */
public class arrayex1 {
    public static void main(String[] args) {
        Scanner console  = new Scanner(System.in);
        System.out.println("How many day");
        int numDays  = console.nextInt();
        int[] temps = new int [numDays];
        // record tempertratures and find aveage
    int sum=0;
        for (int i = 0; i < numDays; i++) {
            System.out.println("Day " + (i+1) + "hightem");
            temps [i] = console.nextInt();
            sum += temps[i];
                 
        }
        double average = (double) sum/numDays;
        // count days above aver age
        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            if(temps[i] > average){
            above++;
           
            }
            
        }
        //report result
        System.out.println("");
        System.out.println("Average = "+ average);
        System.out.println(above + " days above average");
        
        
        
        
    }
             
}
 
     
