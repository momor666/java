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
public class ProdDiv6 {
    public static void main(String args[]){
    
    int x, prod=1;
    for(x=10;x<=30;x++){
    if(x%6==0)System.out.println(x);
    prod= prod*x;
   
    }
    System.out.println("The product is "+ prod);
    }
    
    
}
