/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
 import java.util.Scanner;
public class Largest {
   
    public static void main(String[] args) {
    int a,b,c;
        System.out.println("Enter 3 a numbers");
         Scanner n =new Scanner(System.in);
          a=n.nextInt();
           b=n.nextInt();
            c =n.nextInt();
            if (a> b&& a>c){
                System.out.println("The largest number is a");
                        }
            else if(b> a&& b>c){
                System.out.println("The largest number is b");
                        }
            else{
                System.out.println("The largest number is c");
                       
                        
            }
            }
}
