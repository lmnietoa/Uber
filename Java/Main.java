public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car();
        car.license = "TJO30E";
        car.driver = "Lina Nieto";
        car.passenger = 2;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "GCK477";
        car2.driver = "Luis Chavez";
        car2.passenger = 4;
        car2.printDataCar();
    }
}
