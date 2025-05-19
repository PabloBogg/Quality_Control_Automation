///Desarrolla un programa que genere una matriz de tamaño 5x15. 
///Tu tarea consiste en llenar la matriz con unos y ceros, 
///donde los 1 ocupan el borde externo de la matriz y los 
///0 llenarán el área interior.

///Por ejemplo, el aspecto final de tu matriz 
///deberá ser el siguiente:
	///	
	///		j=0 /i<>  		j=c-1 /i<>
	///		
	///		111111111111111 --> i=0 /j<>
	///		100000000000001
	///		100000000000001
	///		100000000000001
	///		111111111111111 --> i=f-1 /j<>

Algoritmo ejercicio2
	Definir matriz,i,j,f,c Como Entero
	Escribir "Filas: "
	Leer f
	Escribir "Columnas: "
	Leer c
	Dimension matriz[f,c]
	
	//--LLENADO--
	Para i=0 Hasta f-1 Hacer
		Para j=0 Hasta c-1 Hacer
			si i=0 o i=f-1 o j=0 o j=c-1
				matriz[i,j]=1
			SiNo
				matriz[i,j]=0
			FinSi
		FinPara
	FinPara
	
	imprimirMatriz(matriz,f,c)
	
FinAlgoritmo

//--IMPRIMIR MATRIZ--
SubProceso imprimirMatriz(matriz,f Por Referencia,c Por Referencia)
	Definir i, j Como Entero
	Para i=0 hasta f-1 Hacer
		Para j=0 Hasta c-1 Hacer
			Escribir "|",matriz[i,j],"|" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso


