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
public class ControlStructures {
  

public static void main(String args []){

    int marks;
    String name;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the Student name");
    name=input.nextLine();
      System.out.println("Enter the Student marks");
       marks=input.nextInt();
       if(marks>50){
          System.out.print(name); 
         System.out.println("\tPassed the exam");}
       else{
         System.out.print(name);
           System.out.println("Failed");
       }
        
}
}

