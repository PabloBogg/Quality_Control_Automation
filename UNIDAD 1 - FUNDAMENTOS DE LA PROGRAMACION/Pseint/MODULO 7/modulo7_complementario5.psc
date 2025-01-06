///Crea una función que devuelva el término n de la sucesión de Fibonacci. 

///La sucesión de Fibonacci es: 1, 1, 2, 3, 5, 8, 13, 21, 34, ... donde cada número 
///se calcula sumando los dos anteriores. Por ejemplo:
///Fibonacci(2) = 1 + 1
///Fibonacci(3) = 1 + 2
///Fibonacci(5) = 2 + 3

///La sucesión de Fibonacci se define como:
///Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2) para todo n > 1
///Fibonacci(n) = 1 para todo n <= 1

///Crea una función que reciba el valor de n y calcule la serie hasta llegar a ese valor.


Algoritmo ejercicioComplementario5
	Definir elementoN, resultado1 Como Entero
	
	Escribir "Ingresar el elemento n: "
	Leer elementoN
	
	resultado1=funcion1(elementoN)
	Escribir "Elelemento ",elementoN, " de la Serie de Fibonacci es: ", resultado1
	
FinAlgoritmo

Funcion resultado=funcion1(num)
	Definir resultado,i, elementoN_1, elementoN_2 Como Entero
	elementoN_1=1
	elementoN_2=1
	Si num>1 Entonces
		Para i=2 Hasta num Hacer
			resultado=elementoN_1+elementoN_2
			elementoN_1=elementoN_2
			elementoN_2=resultado
		FinPara
	SiNo
		resultado=1
		
	FinSi
FinFuncion
