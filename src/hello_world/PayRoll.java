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
public class PayRoll {
    public static void main (String args[]){
        int tax,NetPay = 0,GrossPay,NSSF;
        int NHIF = 320;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employees Gross pay");
        GrossPay= input.nextInt();
        int JobGroup = 0;
        if (GrossPay>=60000 && GrossPay <=90000){
                JobGroup=10;
		tax= (int) (0.3*GrossPay);
		NSSF = (int) (0.07*GrossPay);
		
		NetPay = (GrossPay + 30000+5000)-NHIF - NSSF - tax;
		
        } else
       
               if (GrossPay>=91000 && GrossPay <=130000){
                   JobGroup=11;
                        tax= (int) (0.3*GrossPay);
                        NSSF = (int) (0.1*GrossPay);
		
		NetPay = (GrossPay + 45000+8500)-NHIF - NSSF - tax;
               
               }
          else
                if (GrossPay>=131000 && GrossPay <=150000){
                    JobGroup=12;
                	tax= (int) (0.3*GrossPay);
                        NSSF =(int) (0.12*GrossPay);
		
		NetPay = (GrossPay + 56000+9900)-NHIF - NSSF - tax;
                
                }
               else
                     if (GrossPay>=151000 && GrossPay <=200000){
                         JobGroup=13;
                     	tax= (int) (0.3*GrossPay);
                        NSSF =(int) (0.13*GrossPay);
		
		NetPay = (GrossPay + 66000+11000)-NHIF - NSSF - tax;
                     }
                     else {
                     System.out.println("The employees NetPay cannot be calculated ");
                     }
        
       
         System.out.println("The employee Job Group is " + JobGroup);
     System.out.println("The employee NetPay is " + NetPay);
    }
    
}
