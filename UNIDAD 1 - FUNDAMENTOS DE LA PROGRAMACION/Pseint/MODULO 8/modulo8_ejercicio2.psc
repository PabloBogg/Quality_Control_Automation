///Crea un procedimiento que calcule la temperatura media de un 
///d�a a partir de la temperatura m�xima y m�nima. Luego, desarrolla 
///un programa principal que, utilizando este procedimiento, solicite 
///la temperatura m�xima y m�nima de n d�as y muestre la media de cada d�a. 
///El programa pedir� al usuario el n�mero de d�as a introducir. 
///Recuerda nombrar y guardar tu algoritmo.

Algoritmo ejercicio2
	Definir nDias ,i Como Entero
	Definir tMax, tMin, tPromedio Como Real
	
	Escribir "Ingresar la cantidad de dias: "
	Leer nDias
	
	Para i=1 Hasta nDias Hacer
		Escribir "Ingresar la Tmax del dia ",i,": "
		Leer tMax
		Escribir "Ingresar la Tmin del dia ",i,": "
		Leer tMin
		promedio(tMax,tMin,tPromedio)
		Escribir "La temperatura promedio del dia ",i, " es: ", tPromedio, "�C"
		
	FinPara
	
FinAlgoritmo

SubProceso promedio(tMax Por valor,tMin Por valor,tPromedio Por Referencia)
	tPromedio=(tMax+tMin)/2
FinSubProceso
	