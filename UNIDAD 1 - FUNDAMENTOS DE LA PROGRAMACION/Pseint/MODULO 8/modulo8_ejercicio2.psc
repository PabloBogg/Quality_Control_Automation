///Crea un procedimiento que calcule la temperatura media de un 
///día a partir de la temperatura máxima y mínima. Luego, desarrolla 
///un programa principal que, utilizando este procedimiento, solicite 
///la temperatura máxima y mínima de n días y muestre la media de cada día. 
///El programa pedirá al usuario el número de días a introducir. 
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
		Escribir "La temperatura promedio del dia ",i, " es: ", tPromedio, "ºC"
		
	FinPara
	
FinAlgoritmo

SubProceso promedio(tMax Por valor,tMin Por valor,tPromedio Por Referencia)
	tPromedio=(tMax+tMin)/2
FinSubProceso
	