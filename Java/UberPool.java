class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){
        super/*super representa a la superclase*/(license, driver)
        this/*Representa la clase hija */.brand = brand;
        this.model = model;
    }
}