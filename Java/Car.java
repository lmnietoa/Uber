import java.time.LocalDate;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    void printDataCar() {
        System.out.println("License: " + license + " Driver: " + driver);
    }
}
