public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("TJO30E", new Account("Lina Nieto", "LIN123"));
        // car.license = "TJO30E";
        // car.driver = "Lina Nieto";
        car.passenger = 2;
        // System.out.println("Placa del vehículo: " + car.license);
        car.printDataCar();

        Car car2 = new Car("GCK47F", new Account("Luis Chavez", "LUI147"));
        // car2.license = "GCK47F";
        // car2.driver = "Luis Chavez";
        car2.passenger = 2;
        // System.out.println("Placa del vehículo: " + car2.license);
        car2.printDataCar();
    }
}
