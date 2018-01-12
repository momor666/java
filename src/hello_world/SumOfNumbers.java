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
public class SumOfNumbers {
    public static void main (String args[]){
    
    int num,sum=0,r = 0;
    Scanner input=new Scanner(System.in);
  System.out.println("Enter a number: ");
  num=input.nextInt();
  /*for(;num!=0;num=num/10){    
      r=num%10;
      sum=sum+r;
  }*/
  
  while(num!=0){
   r=num%10;
   num=num/10;
   sum=sum+r;
  
  }
  System.out.println("The sum of the digit is: "+sum);
}
}