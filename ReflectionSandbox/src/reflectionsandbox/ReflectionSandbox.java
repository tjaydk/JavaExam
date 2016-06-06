package reflectionsandbox;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReflectionSandbox {

    public static void main(String[] args) throws KeyStoreException, FileNotFoundException, IOException, NoSuchAlgorithmException, CertificateException {
        //Changing the privacy.policy file at cmd:
        // java -Djava.security.policy==C:\Users\Dennis\Documents\NetBeansProjects\ReflectionSandbox\src\reflectionsandbox\MySecurity.policy -jar reflectionsandbox.jar
        // = will add a policy file
        // == will override the existing policy file

        //How to create a keystore at cmd
        // 1. Generate the keystore : keytool -keystore clientkeystore -genkey -alias client
        // 2. Generate the csr cert : keytool -keystore clientkeystore -certreq -alias client -keyalg rsa -file client.csr
//        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
//        char[] password = "password".toCharArray();
//        java.io.FileInputStream fis = null;
//        try {
//            fis = new java.io.FileInputStream("C:/Users/Dennis/Documents/NetBeansProjects/ReflectionSandbox/src/reflectionsandbox/clientkeystore");
//            ks.load(fis, password);
//        } finally {
//            if (fis != null) {
//                fis.close();
//            }
//        }
        
        
//        System.setProperty("java.security.policy", "C:/Program Files/Java/jre1.8.0_65/lib/security/java.policy");
        System.setProperty("java.security.policy", "file:/C:/Users/Dennis/Documents/NetBeansProjects/ReflectionSandbox/src/reflectionsandbox/MySecurity.policy");

        
        System.setSecurityManager(new SecurityManager());
        SecurityManager securityManager = System.getSecurityManager();

        if (securityManager == null) {
            System.out.println("There is no security manager");
        }

        ReflectionSandbox rb = new ReflectionSandbox();
        System.out.println(rb.getInformatino("some value", 20));

    }

    public String getInformatino(String s, int i) {
        try {
            Class myClass = MyClass.class;
            Class[] constructorParameters = new Class[]{String.class, int.class};

            Constructor constructor = myClass.getDeclaredConstructor(constructorParameters);
            MyClass instanceOfMyClass = (MyClass) constructor.newInstance("Helle", 1);

            Field field = myClass.getDeclaredField("name");
            field.setAccessible(true);
            field.set(instanceOfMyClass, s);

            Method method = myClass.getDeclaredMethod("printClass");
            method.setAccessible(true);

            return "" + method.invoke(instanceOfMyClass);

        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchFieldException ex) {
            Logger.getLogger(ReflectionSandbox.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
