/// Dise�a un programa que calcule el cuadrado de los primeros 9 n�meros naturales 
/// e imprima por pantalla cada n�mero seguido de su cuadrado. Por ejemplo, "2 elevado 
/// al cuadrado es igual a 4", y as� sucesivamente. Recuerda nombrar y guardar tu algoritmo.

///Nota: Los primeros 9 n�meros naturales son: 1, 2, 3, 4, 5, 6, 7, 8, 9.


Algoritmo ejercicio1
	Definir inicio, i Como Real
	
	Escribir "Ingresar numero de inicio: "
	Leer inicio
	Para i=inicio Hasta inicio+8 Hacer
		Escribir "El numero ", i, " elevado al cuadrado es: ", i^2
	FinPara
FinAlgoritmo
