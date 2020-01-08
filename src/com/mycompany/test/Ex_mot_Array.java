/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;
import java.util.Scanner;

/**
 *
 * @author admins
 */
public class Ex_mot_Array {
  public static void main(String[] args) {
  int n;
   Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = scanner.nextInt();
    System.out.println("Nhập nhiệt độ: ");
    for (int i = 0; i < n; i++) {
        System.out.print("A[" + i + "] = ");
    }
}
           
}
