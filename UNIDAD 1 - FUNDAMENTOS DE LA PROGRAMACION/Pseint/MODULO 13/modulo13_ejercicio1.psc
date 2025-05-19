///Crear una matriz de tamaño n x m, donde n y m son valores
/// ingresados por el usuario. Llenar la matriz con números 
///aleatorios comprendidos entre 1 y 100, luego mostrar su 
///traspuesta. En caso de no estar familiarizado con el concepto 
///de traspuesta, puedes consultar la siguiente referencia:

Algoritmo ejercicio1
	Definir matriz, transpuesta,n,m Como Entero
	Escribir "Ingresar Numero de filas N: "
	Leer n
	Escribir "Ingresar Numero de columnas M: "
	Leer m
	Dimension matriz[n,m]
	Dimension transpuesta[m,n]
	
	
	llenadoAleatorio(matriz,n,m)
	
	Escribir "--MATRIZ--"
	imprimirMatriz(matriz,n,m)
	

	transpuestaMatriz(transpuesta, matriz,n,m)
	
	Escribir "--MATRIZ TRANSPUESTA--"
	imprimirMatriz(transpuesta,m,n)
	
FinAlgoritmo

//--LLENADO DE MATRIZ--
SubProceso llenadoAleatorio(matriz,n Por Referencia,m Por Referencia)
	Definir i,j, min,max Como Entero
	min=1
	max=100
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			matriz[i,j]=Aleatorio(min,max)
		FinPara
	FinPara
FinFuncion

//--IMPRIMIR MATRIZ--
SubProceso imprimirMatriz(matriz,n Por Referencia,m Por Referencia)
	Definir i, j Como Entero
	Para i=0 hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			Escribir "|",matriz[i,j],"|" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso

//--TRANSPUESTA---
SubProceso transpuestaMatriz(transpuesta, matriz,n Por Referencia,m Por Referencia)
	Definir i,j Como Entero
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			transpuesta[j,i]=matriz[i,j]
		FinPara
	FinPara
FinFuncion


