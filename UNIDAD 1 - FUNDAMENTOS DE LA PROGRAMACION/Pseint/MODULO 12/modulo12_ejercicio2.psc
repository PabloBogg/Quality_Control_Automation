///Dada una matriz de tamaño n x m, donde n y m son valores 
///ingresados por el usuario, se requiere implementar dos subprogramas:

///El primer subprograma se encargará de llenar la 
///matriz con números aleatorios.

///El segundo subprograma calculará y mostrará la 
///suma de todos los elementos de la matriz.

///Después de ejecutar ambos subprogramas, se mostrará 
///la matriz generada junto con los resultados de la suma por pantalla.


Algoritmo ejercicio2
	Definir matriz,n,m,suma Como Entero
	Escribir "Ingresar Numero de filas N: "
	Leer n
	Escribir "Ingresar Numero de columnas M: "
	Leer m
	Dimension matriz[n,m]
	suma=0
	
	
	llenadoAleatorio(matriz,n,m)
	sumatoria(matriz,n,m,suma)
	Escribir "Matriz"
	ImprimirMatriz(matriz,n,m)
	Escribir "La sumatoria de sus elementos es: " suma
FinAlgoritmo

//--LLENADO DE MATRIZ--
SubProceso llenadoAleatorio(matriz Por Referencia,n Por Referencia,m Por Referencia)
	Definir i,j, min,max Como Entero
	
	Escribir "Para el llenado aleatorio, ingresar el valor minimo: "
	Leer min
	Escribir "Ahora, ingresar el valor maximo: "
	Leer max
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			matriz[i,j]=Aleatorio(min,max)
		FinPara
	FinPara
FinFuncion

//--SUMATORIA DE ELEMENTOS--
SubProceso  sumatoria(matriz Por Referencia,n Por Referencia,m Por Referencia,suma Por Referencia)
	Definir i,j Como Entero
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			suma=suma+matriz[i,j]
		FinPara
	FinPara
FinFuncion


//--IMPRIMIR MATRIZ--
SubProceso imprimirMatriz(matriz,fila,columna)
	Definir i, j Como Entero
	Para i=0 hasta fila-1 Hacer
		Para j=0 Hasta columna-1 Hacer
			Escribir "|",matriz[i,j],"|" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
