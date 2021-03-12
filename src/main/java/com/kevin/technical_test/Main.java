/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin.technical_test;

import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author kevin
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        
        String toEncode = "Kennia";
        
        Reflections reflections = new Reflections("com.kevin.technical_test");
        
        
        //We get all implementations of Encoder in this package
        Set<Class<? extends Encoder>> classes = reflections.getSubTypesOf(Encoder.class);
        
        
        /* For each implementation of encoder, we invoke the 
           encode method with the specified word. 
        */
        for(Class<? extends Encoder> encoder: classes){
            /* newInstance() is deprecated in Java9, which I        
               don't have in the computer I'm currently working on.
               We should instead use encoder.getDeclaredConstructor().newInstance()
            */    
            encoder.newInstance().encode(toEncode); 
        }
        
    }
    
}
