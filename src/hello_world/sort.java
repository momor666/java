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
public class sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        int Array_size = 3;
//        int Group2 [] = new int [Array_size];
//        
       int x=2;
       int y=4;
       int z=6;
        int Group2 [] = {x,y,z};
        int largst = Group2[0];
         int second =Group2[1];
        for(int i=0; i<3;i++)
        {
            if(largst < Group2[i])
            {
			
		largst = Group2[i];	
	    }else if(Group2[1]> Group2[2])
            {
                second = Group2[1];
            }
        }
        
        System.out.println("larg");
        System.out.println(largst);
        System.out.println("seconf");
        System.out.print(second);
    }
    
}

    

