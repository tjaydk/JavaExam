package proxypattern;

public class MyClass implements MyClassInterface {
    
    private String name;
    private int age;
    private String secret;
    
    
    public MyClass(String n, int i, String s) {
        this.name = n;
        this.age = i;
        this.secret = s;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public int getAge() {
        return age;
    }
    
    public String getSecret() {
        return this.secret;
    }
    
}
