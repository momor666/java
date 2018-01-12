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
public class Cat1qncpp {
    
    public static void main(String args[]){
    
    int x, n, i, square = 0;
    Scanner input=new Scanner (System.in);
    
    System.out.println("Enter value for x: ");
    x=input.nextInt();
    System.out.println("Enter value for n: ");
    n=input.nextInt();
    
    for (i=0;i<n;i++){
       square=x*square;
       
    }
    System.out.println("The square is "+ square);
    }
}
