# CasoJuegoDados

Nuestro programa se conforma de 3 clases: JuegoDado, Dado y Calculadora.

La clase Calculadora tiene la única función de sumar dos números entregados.
La clase Dado tiene de atributo caraSuperior y un método lanzarDado que le asigna a caraSuperior un número del 1 al 6.
La clase JuegoDado depende de Dado y Calculadora, instanciando dos Dados, haciendo uso del metodo lanzarDado para cada dado y sumando el valor de las caras de cada Dado con el método de la Calculadora sumar.
