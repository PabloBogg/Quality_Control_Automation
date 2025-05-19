///Crea una matriz con 3 columnas y una cantidad de filas 
///definida por el usuario. En las dos primeras columnas, 
///el usuario ingresará valores enteros (puede diseñar este 
///ingreso de manera aleatoria para enviar la carga manual). 
///En la tercera columna se almacenará el resultado de sumar 
///los números de la primera y segunda columna. La matriz se 
///mostrará de la siguiente forma:

///3 | 5 | 8 ? 8 se obtuvo de sumar 3 + 5 

///4 | 3 | 7 ? 7 se obtuvo de sumar 4 + 3 

///1 | 4 | 5 ? 5 se obtuvo de sumar 1 +4 

Algoritmo ejercicio3
	Definir matriz,i,j,f,c Como Entero
	Escribir "Filas: "
	Leer f
	c=3
	Dimension matriz[f,c]
	
	Para i=0 Hasta f-1 Hacer
		Para j=0 Hasta  c-1 Hacer
			Si j=c-1 Entonces
				matriz[i,j]=matriz[i,0]+matriz[i,1]
			sino
			Escribir "Ingresar el elemento [", i,",",j,"]: "
			Leer matriz[i,j]
		FinSi
		FinPara
	FinPara
	
	imprimirMatriz(matriz,f,c)
	
FinAlgoritmo

//--IMPRIMIR MATRIZ--
SubProceso imprimirMatriz(matriz Por referencia,f Por Referencia,c Por Referencia)
	Definir i, j Como Entero
	Para i=0 hasta f-1 Hacer
		Para j=0 Hasta c-1 Hacer
			Escribir "|",matriz[i,j],"|" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
