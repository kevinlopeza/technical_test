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
public class MurcielagoEncoder implements Encoder {

    private final char[] key = {'M', 'U', 'R', 'C', 'I', 'E', 'L', 'A', 'G', 'O'};
    
    public MurcielagoEncoder() { }
    
    @Override
    public void encode(String text) {
        
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {

            result[i] = searchLetter(text.charAt(i));
        }

        System.out.println(result);
    
    }
    
     private char searchLetter(char letter) {

        for (int i = 0; i < key.length; i++) {

            if (key[i] == letter || Character.toUpperCase(letter) == key[i]) {

                return Integer.toString(i).charAt(0);

            }

        }

        return letter;

    }
}
