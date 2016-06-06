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
public class SandboxClass {
    public static void main(String[] args) {
        SandboxClass sc = new SandboxClass();
        System.out.println(sc.printObject(new Object()));
        
        Test t = new Test("Helle", 22);
        System.out.println(t.id);
    }
    
    public String printObject(Object o){
        return this.toString();
    }

    public static class Test {
        private String name;
        private int id;
        
        public Test(String name) {
            this.name = name;
        }
        
        public Test(int id) {
            this.id = id;
        }
        
        public Test(String name, int id) {
            this(name);
            this.id = id;
        }
    }
}