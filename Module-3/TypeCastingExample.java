public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 45.67;
        int intValue = (int) doubleValue;
        System.out.println("Double to int casting:");
        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting to int: " + intValue);
        int wholeNumber = 25;
        double convertedDouble = wholeNumber;
        System.out.println("\nInt to double casting:");
        System.out.println("Original int value: " + wholeNumber);
        System.out.println("After casting to double: " + convertedDouble);
    }
}
