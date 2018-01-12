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
public class Switch {
    public static void main (String args []){
    int mufc;
    Scanner input = new Scanner(System.in);
    System.out.println("How many tittles do you think Manchester united has ");
    mufc=input.nextInt();
    switch(mufc){// value mufc is what is put in brackets son
            case 20:
            System.out.println("Hi 5!!! You got i right!! ");
            break;
            case 21:
            System.out.println("Hi 5!!! You got i right!! ");
            break;
            case 19:
            System.out.println("Hi 5!!! You got i right!! ");
            break; 
            default:
            System.out.println("NUgu.. hujui kitu NKT ");
    }
    
    
    } 
}
