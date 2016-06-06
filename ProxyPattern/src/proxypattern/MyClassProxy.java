package proxypattern;

public class MyClassProxy implements MyClassInterface {

    private String name;
    private int age;
    private String secret;
    private MyClass myClass;

    public MyClassProxy(String n, int i, String s) {
        this.name = n;
        this.age = i;
        this.secret = s;
    }

    @Override
    public String getName() {
        if (myClass == null) {
            myClass = new MyClass(name, age, secret);
        }
        return myClass.getName();
    }

    @Override
    public int getAge() {
        if (myClass == null) {
            myClass = new MyClass(name, age, secret);
        }
        return myClass.getAge();
    }

}
