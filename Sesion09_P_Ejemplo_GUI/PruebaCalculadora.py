


'''
Created on 11 mar. 2024

@author: salvatore

0. Descargar e instalar PYTHON

1. Descargar PYDEV como plugin de ECLIPSE
        
        http://www.pydev.org/updates

2. Agregar el INTERPRETE de python a Pydev en las PREFERENCAS DE ECLIPSE

'''

from tkinter import *
import tkinter as tk 
from tkinter import messagebox as msg
from LogicaCalculadora import Calculadora

calculadora = Calculadora()
 
ventana_inicio = Tk()
ventana_inicio.title("GUI con PYTHON")
ventana_inicio.geometry("450x500")

numeros = StringVar()
caja_operaciones = Entry(ventana_inicio, bg="green", 
                        fg="white", font=("roboto", 20, "bold"),
                        width=30, 
                        justify=tk.RIGHT,
                        textvariable=numeros)

caja_operaciones.grid(row=0, columnspan=4)

#primer fila de botones
btn_ac = Button(ventana_inicio, text="AC", width=5, height=5, bg="gray", fg="black")
btn_ac.grid(row=1, column=0)

btn_pos_neg = Button(ventana_inicio, text="+/-", width=5, height=5, bg="gray", fg="black")
btn_pos_neg.grid(row=1, column=1)
btn_residuo = Button(ventana_inicio, text="%", width=5, height=5, bg="gray", fg="black")
btn_residuo.grid(row=1, column=2)
btn_division = Button(ventana_inicio, text="/", width=5, height=5, bg="gray", fg="black")
btn_division.grid(row=1, column=3)


def mostrarNumero(num):
    print("7")
    #msg.showinfo("title", "7")
    #numeros.set( numeros.get() + "7")
    numeros.set( numeros.get() + num)
    
#SEGUNDA fila de botones
btn_7 = Button(ventana_inicio, text="7", width=5, height=5, bg="gray", fg="black",
               command=lambda:mostrarNumero("7"))
btn_7.grid(row=2, column=0)
    
btn_8 = Button(ventana_inicio, text="8", width=5, height=5, bg="gray", fg="black",
               command=lambda:mostrarNumero("8"))
btn_8.grid(row=2, column=1)

btn_9 = Button(ventana_inicio, text="9", width=5, height=5, bg="gray", fg="black")
btn_9.grid(row=2, column=2)
btn_mult = Button(ventana_inicio, text="*", width=5, height=5, bg="gray", fg="black")
btn_mult.grid(row=2, column=3)

#Tercera fila de botones
btn_4 = Button(ventana_inicio, text="4", width=5, height=5, bg="gray", fg="black")
btn_4.grid(row=3, column=0)
btn_5 = Button(ventana_inicio, text="5", width=5, height=5, bg="gray", fg="black")
btn_5.grid(row=3, column=1)
btn_6 = Button(ventana_inicio, text="6", width=5, height=5, bg="gray", fg="black")
btn_6.grid(row=3, column=2)
btn_resta = Button(ventana_inicio, text="-", width=5, height=5, bg="gray", fg="black")
btn_resta.grid(row=3, column=3)

#Cuarta fila de botones
btn_1 = Button(ventana_inicio, text="1", width=5, height=5, bg="gray", fg="black")
btn_1.grid(row=4, column=0)
btn_2 = Button(ventana_inicio, text="2", width=5, height=5, bg="gray", fg="black")
btn_2.grid(row=4, column=1)
btn_3 = Button(ventana_inicio, text="3", width=5, height=5, bg="gray", fg="black")
btn_3.grid(row=4, column=2)

def indicarSuma():
    calculadora.indicarOperacionConNumero(numeros.get(), "+")
    numeros.set("")
    
btn_suma = Button(ventana_inicio, text="+", width=5, height=5, bg="gray", fg="black",
                  command=indicarSuma)
btn_suma.grid(row=4, column=3)

#Quinta fila de botones
btn_cero = Button(ventana_inicio, text="0", width=17, height=5, bg="gray", fg="black")
btn_cero.grid(row=5, column=0, columnspan=2)
btn_punto = Button(ventana_inicio, text=".", width=5, height=5, bg="gray", fg="black")
btn_punto.grid(row=5, column=2)


def clacularResultado():
    calculadora.indicarSegundoNumero(numeros.get())
    numeros.set(calculadora.realizarOperacion())

btn_igual = Button(ventana_inicio, text="=", width=5, height=5, bg="gray", fg="black",
                   command=clacularResultado)

btn_igual.grid(row=5, column=3)

ventana_inicio.mainloop()





















