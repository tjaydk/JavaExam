package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class Lambda {

    public static void main(String[] args) {
        String[] names = {"Helle", "Bo", "Jan"};
        
        sortNamesAndPrint(names);
        sortNamesAndPrintLambda(names);
        
        Runnable task = () -> {System.out.println("Thread lambda, that's me!");};
        task.run();
        
        MyFunctionalInterface<String> print = (name) -> System.out.println(name); //MY OWN LAMBDA
        print.printName("Hello from my lambda");
    }
    
    public static void sortNamesAndPrint(String[] sa) {
        Comparator<String> comp = new Comparator<String>() {
        //CREATING AN ANONYMOUS CLASS
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        
        Arrays.sort(sa, comp);
        for (String name : sa) {
            System.out.println(name);
        }
    }
    
    public static void sortNamesAndPrintLambda(String[] sa) {
        //THE SAME WITH LAMBDA
        Arrays.sort(sa, (String o1, String o2) -> o1.compareTo(o2));
        for (String name : sa) {
            System.out.println(name);
        }
    }

}