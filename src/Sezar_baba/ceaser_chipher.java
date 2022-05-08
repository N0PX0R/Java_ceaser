/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sezar_baba;

/**
 *
 * @author MDT
 */
public class ceaser_chipher { 
    public static char[] encrypt(String metin,int shifter){
        char[] metinarr= metin.toCharArray();
        char[] sifreli = new char[metinarr.length];
        int count =0;
        for(int eleman:metinarr){               
                  eleman+=shifter;
                  sifreli[count]=(char)eleman;
                  count++;   
        }
        return (char[])sifreli;
    }
    
    public static char[] decrypt(String chiphertext,int shifter){
        char[] chipher_arr= chiphertext.toCharArray();
        char[] cozulmus = new char[chipher_arr.length];
        int count=0;
        for(int eleman:chipher_arr){               
                  eleman-=shifter;
                  cozulmus[count]=(char)eleman;
                  count++;   
        }
        return (char[])cozulmus;
    }
}
