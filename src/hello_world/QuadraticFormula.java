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
public class QuadraticFormula {
    /*
    
    x=b^2- v4ac/2a
    
    
    */
  public static void main(String args[]){
      float a, b, c, x, y, disc;
      Scanner input= new Scanner(System.in);
      System.out.println("Enter the values of a b & c");
      a=input.nextFloat();
      b=input.nextFloat();
      c=input.nextFloat();
      disc =(float) ((Math.pow(b, 2))-(4*a*c));
      if (disc<0){
            System.out.println("Has no real roots");
      } else if(disc==0){
            System.out.println("has identical roots");
            x=(float) ((-b+(Math.sqrt(disc)))/(2*a));
          y=(float) ((-b-(Math.sqrt(disc)))/(2*a));
           System.out.println("the first value of x is" + x);
       System.out.println("the second value of x is" + y);
      }else if(disc >0){
          x=(float) ((-b+(Math.sqrt(disc)))/(2*a));
          y=(float) ((-b-(Math.sqrt(disc)))/(2*a));
          
       System.out.println("the first value of x is" + x);
       System.out.println("the second value of x is" + y);
      }
      
      
       
      
  }  
}
