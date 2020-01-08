/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex2_Array {
    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);
         
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
         
        System.out.println("Nhập vào số các số nguyên có trong dãy: ");
        n = scanner.nextInt();
       
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhập số thứ " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }
         
        avgNumber = (float) sum / n;
        System.out.println("Trung bình là = " + decimalFormat.format(avgNumber));
             
    }
    
}
