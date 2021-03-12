/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin.technical_test;

/**
 *
 * @author kevin
 */
public class MorseEncoder implements Encoder {

    final private char[] key1 = { 'a', 'b', 'c', 'd', 'e', 'f', 
                          'g', 'h', 'i', 'j', 'k', 'l', 
                          'm', 'n', 'o', 'p', 'q', 'r', 
                          's', 't', 'u', 'v', 'w', 'x', 
                          'y', 'z'}; 
    
    final private String[] key2 
        = { ".-",   "-...", "-.-.", "-..",  ".", 
            "..-.", "--.",  "....", "..",   ".---", 
            "-.-",  ".-..", "--",   "-.",   "---", 
            ".--.", "--.-", ".-.",  "...",  "-", 
            "..-",  "...-", ".--",  "-..-", "-.--", 
            "--.." }; 
    
    public MorseEncoder() { }
        
    
    @Override
    public void encode(String text) {
        
        String result = "";
        
        for (int i = 0; i < text.length(); i++) { 
            for (int j = 0; j < key1.length; j++) { 
                if (text.charAt(i) == key1[j] || text.charAt(i) == Character.toUpperCase(key1[j]) ) { 
                    result += key2[j] + " "; 
                    break; 
                } 
            } 
        } 
        
        System.out.println(result);
    }
}
