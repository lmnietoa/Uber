public class Car {
    private Integer id; // Atributos de la clase, variables glabales de la clase
    private String license; // Atributos de la clase
    private Account driver; // Atributos de la clase
    protected Integer passenger; // Atributos de la clase encapsulado

    public Car(String license/* variables locales */, Account driver /* variables locales */) {
        // Método constructor
        this/* this representa el objeto en cuestión */.license /* variable global */ = license/* variable local */;
        this.driver = driver;
    }

    void printDataCar() {
        // Métodos de la clase
        if (passenger != null) {
            System.out.println("Placa: " + license + " Conductor: " + driver.name + " Pasajeros: " + passenger);
        }
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if (passenger < 5) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar hasta máximo 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}
