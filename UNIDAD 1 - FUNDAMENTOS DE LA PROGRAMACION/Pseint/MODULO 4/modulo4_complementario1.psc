///Desarrolla un programa que calcule el promedio de una secuencia de 
///números ingresados por el usuario a través del teclado. 
///La secuencia finaliza con un -1. Por ejemplo: 5, 3, 0, 2, 4, 4, 0, 0, 2, 3, 6, 0, ..., -1. 
///Se asume que el usuario no ingresará números negativos. 
///Utiliza la estructura repetitiva mientras para resolver esta actividad.

Algoritmo complementario1
	Definir num, sumatoria Como Real
	
	Definir contador Como Entero
	
	num=0
	sumatoria=1
	contador=-1
	
	Repetir
		Escribir "Ingresar un numero positivo: "
		Leer num
		sumatoria=sumatoria+num
		contador=contador+1
	Hasta Que num=-1
	
	Si contador=0 Entonces
		contador=1
	FinSi
	Escribir "El promedio de la secuencia es: " sumatoria/contador
	
FinAlgoritmo
