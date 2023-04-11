from car import Car # Importar clase
from account import Account # Importar clase

if __name__ == "__main__":
    print("Hola mundo")
    
    car=Car("TJO30E", Account("Lina Nieto", "LIN123")) #Creación de objeto con método constructor
    #car = Car() #Creación de Objetos
    #car.license = "TJO30E" #Asignación de valores de manera directa al objeto
    #car.driver = "Lina Nieto" #Asignación de valores de manera directa al objeto
    print(vars(car))
    print(vars(car.driver))
    
    car2 = Car()
    car2.license = "GCK47F"
    car2.driver = "Luis Chavez"
    print(vars(car2))