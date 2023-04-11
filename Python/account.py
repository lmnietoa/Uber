# Creación de clases en python
class Account:
    id          = int # Atributos de la clase
    name        = str # Atributos de la clase 
    document    = str # Atributos de la clase
    email       = str # Atributos de la clase
    password    = str # Atributos de la clase
    
    def __init__(self, name, document):
        # Método constructor
        self.name=name
        self.document=document