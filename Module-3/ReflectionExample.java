import java.lang.reflect.*;
class Demo {
    public void show() {
        System.out.println("Hello from show()");
    }
}
public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Demo");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        Method method = cls.getMethod("show");
        method.invoke(obj);
    }
}
