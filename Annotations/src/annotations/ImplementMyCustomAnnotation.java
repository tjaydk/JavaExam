package annotations;

public class ImplementMyCustomAnnotation {

    @MyCustomAnnotation(needed = "This is needed") //HERE IM IMPLEMENTING MY CUSTOM ANNOTATION
    public String name;

    /**
     * Gets name from class
     * 
     * @return String
     */
    public String getName() {
        return this.name;
    }
}
