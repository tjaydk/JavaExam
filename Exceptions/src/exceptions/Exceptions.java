/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(true) {
            try {
                throw new MyException("This is my own fault!!");
            } catch (MyException ex) {
                Logger.getLogger(Exceptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
