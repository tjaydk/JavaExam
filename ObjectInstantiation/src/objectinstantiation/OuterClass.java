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
public class OuterClass {
    
    private String name;
    
    public OuterClass(String s){
        this.name = s;
    }
    
    class InnerClass{
        public String getOuterClassName() {
            return name;
        }
    }
    
    static class NestedClass {
        static String nestedName;
        
        static String getNestedName() {
            return nestedName;
        }
    }
}
