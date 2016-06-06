package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Annotations {

    public static void main(String[] args) {
        ImplementMyCustomAnnotation imca = new ImplementMyCustomAnnotation();
        imca.getName(); //SUPPLIES JAVADOC INFO AT SOURCE LEVEL
        
        Class c = new ImplementMyCustomAnnotation().getClass();
        Field[] fields = c.getDeclaredFields();
        
        for (Field field : fields) {
            if(field.isAnnotationPresent(MyCustomAnnotation.class)) {
                System.out.println("Found MyCustomAnnotation annotation on field: " + field.getName() + "\nThis annotation contains information:");
                Annotation a = field.getAnnotation(MyCustomAnnotation.class);
                System.out.println(a.toString());
            } else {
                System.out.println("No annotations present at runtime");
            }
        }
    }
}
