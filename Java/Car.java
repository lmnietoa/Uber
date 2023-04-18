public class Car {
    Integer id; // Atributos de la clase, variables glabales de la clase
    String license; // Atributos de la clase
    Account driver; // Atributos de la clase
    Integer passenger; // Atributos de la clase

    public Car(String license/* variables locales */, Account driver /* variables locales */) {
        // Método constructor
        this/* this representa el objeto en cuestión */.license /* variable global */ = license/* variable local */;
        this.driver = driver;
    }

    void printDataCar() {
        // Métodos de la clase
        System.out.println("Placa: " + license + " Conductor: " + driver.name + "Pasajeros: " + passenger);
    }
}
