package factorypattern;

public class AnimalFactory {

    public Animal createAnimal(String type, int weight) {
        Animal a = null;
        
        switch (type) {
            case "Cat":
                a = new Cat(type, weight);
                break;
            case "Dog":
                a = new Dog(type, weight);
                break;
            default:
                break;
        }
        return a;
    }

}
