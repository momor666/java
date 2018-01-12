/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello_world;

/**
 *
 * @author DerrickAbucheri
 */
public class PrimeNumbers {
    public static void main(String [] args){
    int num =1000;
        for(int i =2; i<num; i++){
            int p=1;
            for(int j=2; j<i/2; j++){
            
            if(i%j==0)
                p=p*0;
            else 
                p=p*1;
            }
            if (p==1){
            System.out.print(i+ ",");
            }
        }
    }
}
