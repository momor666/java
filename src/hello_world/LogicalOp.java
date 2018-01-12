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
public class LogicalOp {
    public static void main (String args []){
    int boy, girl;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the boy's age: ");
    boy=input.nextInt();
    System.out.println("Enter the girl's age: ");
    girl=input.nextInt();
    
    if (boy >18 && girl >21 )//both conditions must be true
    {
    System.out.println("You can party!!");
    } else 
        System.out.println("You're young guise.. Chill yo");
    }
}
