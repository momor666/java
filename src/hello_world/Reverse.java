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
public class Reverse {
    public static void main (String args[]){
    //iteration
    int n;
    int total= 0;
    Scanner input = new Scanner (System.in);
    System.out.println("Enter the number you want to reverse");
    n= input.nextInt();
    while(n>0){
    total = total*10 + n%10;
    n=n/10;
    }
    System.out.println("The reverse is " + total);
    }
    
}
