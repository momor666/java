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
public class Select {
    public static void main(String args[]){
    //program that accepts values from user, and gets smallest(sholud take 1st value as the number of inputs to accept from user)
    int x, y, z;
    int largest;
    int smallest;
    Scanner input =new Scanner(System.in);
    
    System.out.println("Enter the three numbers");
     x=input.nextInt();
      y=input.nextInt();
       z=input.nextInt();
       /*using 3= 123,132,213,231,312,321*/
       if(x>y && x>z){
        largest=x;
       }else if(y>z && y>x){
       largest=y;
       }else{
       largest=z;
       }
       
     System.out.println("The largest of the three numbers is "+ largest);  
       
    }
    
}
