//Las clases deben llamarse exactamente igual a los archivos de cada una
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo"); // Línea base para imprimir en pantalla

        UberX uberX = new UberX( /* Declaración de un objeto utilizando el método constructor */
                "TJO30E",
                new Account( // Declaración de un objeto utilizando el método constructor
                        "Lina Nieto",
                        "LIN123"),
                "Chevrolet", "Spark");

        uberX.setPassenger(4); // llamado encapsulado
        uberX.printDataCar(); // Invocación de métodos

        // car.license = "TJO30E"; // Asignación de valores de manera directa al objeto
        // car.driver = "Lina Nieto"; // Asignación de valores de manera directa al
        // objeto
        // uberX.passenger = 2; // Asignación de valores de manera directa al objeto
        // System.out.println("Placa del vehículo: " + car.license); // Manera de
        // imprimir un atributo específico

        // Car car2 = new Car("GCK47F", new Account("Luis Chavez", "LUI147"));
        // car2.license = "GCK47F";
        // car2.driver = "Luis Chavez";
        // car2.passenger = 2;
        // System.out.println("Placa del vehículo: " + car2.license);
        // car2.printDataCar();

        UberVan uberVan = new UberVan("RPM953", new Account("Alvaro Camacho", "CAM147"));
        uberVan.setPassenger(6);
        uberVan.printDataCar(); // Invocación de métodos

    }
}
