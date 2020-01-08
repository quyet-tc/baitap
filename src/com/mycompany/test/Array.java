/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.mycompany.test;

/**
*
* @author cuong
*/
public class Array {
public static void main(String[] args) {
int[] intArray = new int[10];

for (int i =0; i< intArray.length;i++) {
intArray[i]=i;
}
for (int i: intArray) {
System.out.println(i);
}

int max = intArray[0];
int min = intArray[0];
for (int i=0; i < intArray.length; i++) {
if (intArray[i] > max){
max=intArray[i];
}
if (intArray[i] < min) {
min=intArray[i];
}
}
System.out.println("Max = "+max);
System.out.println("Min = "+min);


}

}