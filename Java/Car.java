public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver) {

    }

    void printDataCar() {
        System.out.println("License: " + license + " Driver: " + driver);
    }
}
