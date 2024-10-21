
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class switchb {     
    public static void main(String[] args) {
     System.out.print("Enter your grade (A, B, C, D, F): ");
     Scanner n =new Scanner(System.in);
  String grade = n.next();
    switch (grade){
            case "A":
                System.out.println("Excellent work!");
                break;
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println("You passed!");
                break;
            case "D":
                System.out.println("You need to improve.");
                break;
            case "F":
                System.out.println("You failed. Try harder next time.");
                break;
            default:
                System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.");
                break;
        }

       n.close();
      }
}
    
