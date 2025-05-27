public class PatternSwitch {
    public static void checkType(Object obj) {
        switch (obj) {
            case String s -> System.out.println("It's a string: " + s);
            case Integer i -> System.out.println("It's an integer: " + i);
            case Double d -> System.out.println("It's a double: " + d);
            default -> System.out.println("Unknown type");
        }
    }
    public static void main(String[] args) {
        checkType("Hello");
        checkType(123);
        checkType(45.67);
        checkType(true);
    }
}
