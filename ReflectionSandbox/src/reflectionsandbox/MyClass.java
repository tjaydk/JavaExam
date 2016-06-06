/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflectionsandbox;

/**
 *
 * @author Dennis
 */
public class MyClass {
    
    private String name;
    private int i;
    
    public MyClass(String name, int i) {
        this.name = name;
        this.i = i;
    }
    
    private String printClass(){
        return "This class containes name: " + this.name + ", and i: " + this.i;
    }
}
