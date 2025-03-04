'''
Created on 3 mar. 2025

@author: salvatore
'''

class Calculadora:
    
    def __init__(self, primerNumero=0, operacion="", segundoNumero=0):
        self.primerNumero = primerNumero
        self.operacion = operacion
        self.segundoNumero = segundoNumero
        
    def sumar(self):
       return float(self.primerNumero) + float( self.segundoNumero)
   
   
    def indicarOperacionConNumero(self, n1, op):
        self.primerNumero = n1
        self.operacion = op
        
        
    def indicarSegundoNumero(self, n2):
        self.segundoNumero = n2
        
    def realizarOperacion(self):
        if(self.operacion=="+"):
            return self.sumar()    
        