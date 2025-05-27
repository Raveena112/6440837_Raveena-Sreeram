class Car {
    String make;
    String model;
    int year;
    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
}
public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        myCar.displayDetails();
    }
}
