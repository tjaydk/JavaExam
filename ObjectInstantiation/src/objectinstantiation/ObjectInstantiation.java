/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectinstantiation;

/**
 *
 * @author Dennis
 */
public class ObjectInstantiation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OuterClass.NestedClass.nestedName = "Hello from Static";
        System.out.println(OuterClass.NestedClass.getNestedName());
        
        OuterClass outer = new OuterClass("Hello from Outer class");
        OuterClass.InnerClass inner = outer.new InnerClass();
        
        System.out.println(inner.getOuterClassName());
    }
    
}
