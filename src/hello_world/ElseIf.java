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
public class ElseIf {
    public static void main(String args[]){
    String name;
    int marks;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the students name");
      name=input.nextLine();
      System.out.println("Enter the students marks");
      marks=input.nextInt();
      if(marks>100)
          System.out.println("Invalid Marks Input");
      else if(marks>80)
          System.out.println("A");
      else if(marks>75)
          System.out.println("A-");
      else if(marks>70)
          System.out.println("B+");
      else if(marks>65)
          System.out.println("B");
      else if(marks>60)
          System.out.println("B-");
      else if(marks>55)
          System.out.println("C+");
      else if(marks>50)
          System.out.println("C");
      else if(marks>45)
          System.out.println("C-");
      else if(marks>40)
          System.out.println("D+");
      
      else 
      System.out.println("Fail");
      
      
      
    }
    
}
