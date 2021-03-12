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
public class BinaryEncoder implements Encoder {

    @Override
    public void encode(String text) {
        
        String result = "";
        
        String binary = "";
        
        for(int i = 0; i < text.length(); i++){
             binary = Integer.toBinaryString(text.charAt(i)) + " ";
             
             //We now add the required padding at the beginning
             binary = String.format("%8s", binary).replace(' ', '0');
             
             result += binary + " ";
        }
        
        System.out.println(result);
    }
    
}
