Algoritmo diagonales_ceros
	Definir matriz, n, m Como Entero
	n=6
	m=6
	Dimension matriz(n,m)
	rellenarMatriz(matriz,n,m)
	imprimirMatriz(matriz,n,m)
	
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz,n,m)
	Definir i, j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta m-1 Hacer
			Si i = j Entonces
				matriz[i,j] = 0
			SiNo
				matriz[i,j] = Aleatorio(1,50)
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(matriz, filas, columnas)
	
	Definir i,j Como Entero
	Escribir "Matriz diligenciada queda así:"
	Para i<-0 Hasta filas - 1 Hacer
		Para j<-0 Hasta columnas - 1 Hacer
			Escribir Sin Saltar matriz[i,j], "|"
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
