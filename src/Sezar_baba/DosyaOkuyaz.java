/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sezar_baba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author MDT
 */
public class DosyaOkuyaz {
     public static void dosyayaYaz(String metin, File file ){
        try{
        FileOutputStream fileOutputStream =new FileOutputStream(file);
        byte[] yazilacak = metin.getBytes();
        fileOutputStream.write(yazilacak);
        fileOutputStream.close();
        }
        catch(IOException ioExp){
            ioExp.printStackTrace();
        }
    }
    
    public static String dosyadanOku(File file){
        String okunanmetin="";
        try{
        FileInputStream fileInputStream =new FileInputStream(file);
        byte[] okunan =new byte[fileInputStream.available()];
        fileInputStream.read(okunan);
        fileInputStream.close();
        okunanmetin = new String(okunan);
        }
        catch(IOException ioExp){
            ioExp.printStackTrace();
        }
        return okunanmetin;
    }
}
