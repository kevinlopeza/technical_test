/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin.technical_test;

import java.util.List;
import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author kevin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        String toEncode = "Kennia";
        
        //We get all implementations of Encoder
        Reflections reflections = new Reflections("com.kevin.technical_test");
        
        Set<Class<? extends Encoder>> classes = reflections.getSubTypesOf(Encoder.class);
        
        List<Encoder> encoders = null;
      
        for(Class<? extends Encoder> encoder: classes){
            encoder.newInstance().encode(toEncode);
        }
        
    }
    
}
