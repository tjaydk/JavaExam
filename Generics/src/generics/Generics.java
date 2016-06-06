package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        
    }
    
    public void genericLists() {
        List nonGenericList = new ArrayList();
        
        nonGenericList.add(new Object());
        nonGenericList.add("String");
        nonGenericList.add(10);
        
        List<String> genericList = new ArrayList();
       
        genericList.add("String");
        genericList.add((String)new Object());
        genericList.add(new Object()); //UNABLE TO ADD OBJECTS THAT DO NOT HAVE THE RIGHT GENERIC TYPE
    }
    
    public void genericClass() {
        List<GenericClass> list = new ArrayList();
        GenericClass gc = new GenericClass("String");
        
        GenericClass<String, String, Integer> gc1 = new GenericClass("String"); //EXPECTS A STRING
    }
    
}
