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
public class LogicalOperators3 // comparing three values
{
    public static void main (String args []){
    int x, y, z;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the three numbers to be compared: ");
     x=input.nextInt();
     y=input.nextInt();
     z=input.nextInt();
    if (x > y && x > z){
    System.out.println(" X is the largest");
    } else if (y > z){
    System.out.println("Y is the largest");
    }
    if (y > x && y > z){
    System.out.println(" Y is the largest");
    } else if (z > x){
    System.out.println("Z is the largest");
    }
    
    }
}
