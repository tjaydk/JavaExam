package factorypattern;

public abstract class Animal {
    private String type;
    private int weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void sayHello() {
        System.out.println(type + " says hello");
    }
}
