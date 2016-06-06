package factorypattern;


public class FactoryPattern {
    
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        
        Animal animal = factory.createAnimal("Cat", 20);
        animal.sayHello();
        
        Class c = animal.getClass();
        System.out.println("Animal class is " + c.getName());
    }
    
}
