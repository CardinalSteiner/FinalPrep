/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.prep;

import java.util.Scanner;

/**
 *
 * @author Cardinal Steiner
 */
public class FinalPrep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word");
        String x = input.next();
        char[] y = new char[x.length()];
        for(int i = 0; i< x.length(); i++){
        y[i] = x.charAt(i);
        }
        char[] z = new char[x.length()];
        for(int i = 0 ; i< x.length(); i++){
        z[i] = y[x.length()-1-i];
        }
        
        System.out.println(z);
        System.out.println("This is going to be the change in commits");
        System.out.println("This is the change we will pull from the repository");
        
        
        
        
    }
    
}
