from car import Car

if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license="TJO30E"
    car.driver="Lina Nieto"
    print(vars(car))
    
    car2 = Car()
    car2.license="GCK477"
    car2.driver="Luis Chavez"
    print(vars(car2))