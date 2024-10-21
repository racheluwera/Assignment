/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leap;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Leap {

    public static void main(String[] args) {
       int year;
        System.out.println("Enter a year");
         Scanner n =new Scanner(System.in);
        year=n.nextInt();
if ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)) {
System.out.println("It is leap year");
}
else {

 System.out.println("It is not leap year");       
        
    
}
}
}
    
