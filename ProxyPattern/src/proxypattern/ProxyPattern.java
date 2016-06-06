package proxypattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ProxyPattern {

    public static void main(String[] args) throws Exception {
        MyClass myClassInstance = new MyClass("Hans", 20, "A secret");
        System.out.println(myClassInstance.getSecret());
        
        
        MyClassInterface myProxy = new MyClassProxy("Helle", 20, "A secret");
        
        System.out.println("Name in class: " + myProxy.getName());
        System.out.println("Age in class: " + myProxy.getAge());
//        System.out.println("Secret in class: " + myProxy.getSecret()); //Unable to gain access to secret;
        
        
//        TRYING TO DO REFLECTION
        Class realClass = MyClass.class;
        Class proxyClass = MyClassProxy.class;
        
        Method[] methodsInRealClass = realClass.getMethods();
        Method[] methodsInProxyClass = realClass.getMethods();
        
        Method[] methodsInRealClassDecl = realClass.getDeclaredMethods();
        Method[] methodsInProxyClassDecl = realClass.getDeclaredMethods();
        
        printMethods(methodsInProxyClassDecl, "methodsInProxyClassDecl");
        
        
    }
    
    public static void printMethods(Method[] m, String name){
        for (Method method : m) {
            method.setAccessible(true);
            System.out.println("Method in " + name + " is: " + method.getName());
        }
    }
    
}
