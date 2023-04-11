from account import Account # Importar clase
# Creación de clases en python
class Car:
    id          =int # Atributos de la clase
    license     =str # Atributos de la clase
    driver      = Account("","") # Atributos de la clase, Atributo que hereda de la clase Account
    passenger   =str # Atributos de la clase
    
    def __init__(self, license, driver):
        # Método constructor
        self.license=license
        self.driver=driver