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
public class NetPay {
    
    public static void main (String args []){
        
        Scanner input = new Scanner(System.in);
    double NetPay = 0;
    double amount;
    double tax;
    double GrossPay = 0;
    
    System.out.println("Enter the employees salary");
        GrossPay=input.nextDouble();
        
        if (GrossPay >= 50000&& GrossPay<=100000){
        tax = 0.3*GrossPay;
        NetPay = GrossPay - tax;
        }
        else if  (GrossPay >= 40000&& GrossPay<50000){
        tax = 0.25*GrossPay;
        NetPay = GrossPay - tax;
        }
        else if (GrossPay >= 30000&& GrossPay<40000){
        tax = 0.2*GrossPay;
        NetPay = GrossPay - tax;
        }
        else if (GrossPay >= 20000&& GrossPay<30000){
        tax = 0.15*GrossPay;
        NetPay = GrossPay - tax;
        }
        else if (GrossPay >= 10000&& GrossPay<20000){
        tax = 0.1*GrossPay;
        NetPay = GrossPay - tax;
        }
        else  {
        System.out.println("The employees Net Pay is: "+ NetPay);
            
        }
  
         System.out.println("Input out of range");
    }
        }
    

