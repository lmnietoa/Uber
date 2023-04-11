// Creación de clases en JavaScript
function Car(license, driver/*Al colocar las variables aqui, creamos el método constructor*/ ) {
    this.id; // Atributos de la clase
    this.license = license; // Atributos de la clase, Asigna directamente las variables locales a las globales
    this.driver = driver; // Atributos de la clase, Asigna directamente las variables locales a las globales
    this.passenger; // Atributos de la clase
}

Car.prototype.printDataCar = function () {
    //Método de la clase
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}
