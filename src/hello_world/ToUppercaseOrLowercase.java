/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triallllll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author DerrickAbucheri
 */
public class ToUppercaseOrLowercase {
    public static void main(String args []) throws IOException{
 System.out.println("Enter sentence");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String sentence = "";
    for(int i=0;i<str.length();i++)
    {
        if(Character.isUpperCase(str.charAt(i))==true)
        {
            char ch2= (char)(str.charAt(i)+32);
            sentence = sentence + ch2;
        }
        else if(Character.isLowerCase(str.charAt(i))==true)
        {
            char ch2= (char)(str.charAt(i)-32);
            sentence = sentence + ch2;
        }
        else
        sentence= sentence + str.charAt(i);

    }
    System.out.println(sentence);
    
    }   
}
