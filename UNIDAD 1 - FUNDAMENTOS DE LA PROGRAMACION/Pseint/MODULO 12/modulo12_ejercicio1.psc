///Crea un programa que solicite al usuario ingresar 9 valores. 
///Los valores ingresados deben ser almacenados en un único 
///arreglo bidimensional (matriz).y debe mostrarlos posteriormente 
///por pantalla. Sigue estos pasos:

///Declara el tipo de dato que almacenará la matriz.

///Define la dimensión del arreglo, en este caso, 
///3X3 (ya que precisamos almacenar 9 datos).

///Utiliza un bucle para recorrer el arreglo recién 
///creado, posición por posición, y solicita al usuario 
///que introduzca un dato. Puedes emplear una estructura 
///de bucle "Para" para esta tarea. Recuerda que necesitarás 
///bucles anidados para recorrer cada fila y cada columna, 
///siendo el bucle externo para las filas y el interno para las columnas.

Algoritmo ejercicio1
	Definir i,j,f,c Como Entero
	Definir matriz Como Real
	f=3
	c=3
	Dimension matriz[f,c]
	
	Para i=0 Hasta 3-1 Hacer
		Para j=0 Hasta  3-1 Hacer
			Escribir "Ingresar el elemento [", i,",",j,"]: "
			Leer matriz[i,j]
		FinPara
	FinPara
	
	imprimirMatriz(matriz,f,c)
	
FinAlgoritmo

SubProceso imprimirMatriz(matriz,fila,columna)
	Definir i, j Como Entero
	Para i=0 hasta fila-1 Hacer
		Para j=0 Hasta columna-1 Hacer
			Escribir "|",matriz[i,j],"|" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
