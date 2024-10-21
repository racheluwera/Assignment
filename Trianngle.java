/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

import java.util.Scanner;
public class Trianngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.print("Enter the length of triangle ");
        int num = sc.nextInt();

        // Loop to print the right-angled triangle
        for (int i = 1; i <= num; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line
        }}


}
