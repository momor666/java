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
public class If {
 public static void main (String args[]) {
     Scanner input= new Scanner(System.in);
      System.out.println("Enter any number");
     int x=input.nextInt();
    
     if (x<10){
     System.out.println("The number you entered is less than 10 ");
     }
     System.out.println("The number you entered is greater than 10 "); 
 }  
}
