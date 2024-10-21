/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
    int num;
        System.out.println("Enter a number");
         Scanner n =new Scanner(System.in);
        num=n.nextInt();
        if ( num% 2 == 0){
             System.out.println("The nmber is even");
        }
        else {
            System.out.println("The nmber is odd");
    }
    }
}

