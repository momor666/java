/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello_world;

import java.util.Scanner;

/**
 *
 * @author DerrickAbucheri
 */
public class IfElse {
    

public static void main(String args[]){
    int marks;
    int marks2;
    String name;
    String name2;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the first Student's name");
    name=input.nextLine();
      
     System.out.println("Enter the second Student's name");
    name2=input.nextLine();
    
    System.out.println("Enter the first Student marks");
       marks=input.nextInt();
      
       System.out.println("Enter the second Student marks");
       marks2=input.nextInt();
      
       if(marks>marks2){
          System.out.print(name); 
         System.out.println("\tdefeated");
         System.out.print(name2); 
         System.out.print("in the exam");
       }
       else{
         System.out.print(name2);
           System.out.println("\tdefeated");
           System.out.print(name); 
         System.out.print("in the exam");
       }
        
}
}
