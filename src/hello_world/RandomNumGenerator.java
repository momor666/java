/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello_world;
import java.util.Random;
/**
 *
 * @author DerrickAbucheri
 */
public class RandomNumGenerator {
    public static void main (String args []){
        Random dice= new Random();
        int number;
            for(int counter=1; counter<=10; counter++){
               /*
                prints 10 random numbers
                */ 
               // number=dice.nextInt(6);//includes 0 in output
                number=1+dice.nextInt(10); //excludes 0 from output
                System.out.println(number +" ");
                
            }
    }
}
