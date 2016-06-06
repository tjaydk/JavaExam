/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import reflectionsandbox.ReflectionSandbox;

/**
 *
 * @author Dennis
 */
public class Tester {
    
    public Tester() {
//        System.setProperty("java.security.policy", "file:/C:/Users/Dennis/Documents/NetBeansProjects/ReflectionSandbox/src/reflectionsandbox/MySecurity.policy");
//        System.setSecurityManager(new SecurityManager());
    }
    
    @Before
    public void setup(){
    }
    
    @Test
    public void testAccessible() {
        ReflectionSandbox rs = new ReflectionSandbox();
        
        Assert.assertEquals("This class containes name: Kurt, and i: 1", rs.getInformatino("Kurt", 1));
    }
    
}
