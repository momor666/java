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
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number");
        x=input.nextInt();
        System.out.print("Enter the second number");
        y=input.nextInt();
        
        z=x+y;
        System.out.print("Sum of the two numbers is  ");
        System.out.println(z);
        // TODO code application logic here
    }
    
}

    

