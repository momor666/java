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
public class CompoundInterest {
    public static void main(String args []){
    // A=P(1+R)^n
    double amount;
    double principle = 10000;
    double rate;
    rate=.1;
    for(int day=1;day<=20;day++){
        amount=principle*Math.pow(1+rate, day);
        System.out.println(day+ " "+ amount);
    }
    }
}
