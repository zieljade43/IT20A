/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author admin
 */
public class Activity5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decFormat = new DecimalFormat("#,###.00");
        String name = "";
        int age = 0;
        float grade = 1.25f;
        double cash = 1.10;
        boolean isSingle;       
        
        System.out.print("Enter name:");
        name = scan.nextLine();
        
        System.out.print("Enter age:");
        age = scan.nextInt();
        
        System.out.print("Enter grade:");
        grade = scan.nextFloat();
        
        System.out.print("Enter cash: ");
        cash = scan.nextDouble();
        
        System.out.print("Enter status (true or false):");
        isSingle = scan.nextBoolean();
        
        System.out.println("Hi, " + name + "!" + "You are " + age + " years old." );
        System.out.println("Your grade is " + grade + ". Your cash is " + decFormat.format(cash));
        System.out.println("Are you single?: "+ isSingle);
    }
}
