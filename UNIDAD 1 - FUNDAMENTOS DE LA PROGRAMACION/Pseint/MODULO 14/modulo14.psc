Algoritmo PalabrasCruzadas
	Definir matriz Como Caracter
	Definir filas, columnas, i,posicionRMayor Como Entero
	posicionRMayor=0
	filas = 9
	columnas = 12
	Dimension matriz(filas,columnas)
	inicializarMatriz(matriz, 9, columnas)
	agregarPalabra(matriz, 0, "PARA")
	agregarPalabra(matriz, 1, "MATRIX")
	agregarPalabra(matriz, 2, "PROGRAMA")
	agregarPalabra(matriz, 3, "SUBPROGRAMA")
	agregarPalabra(matriz, 4, "SUBPROCESO")
	agregarPalabra(matriz, 5, "VARIABLE")
	agregarPalabra(matriz, 6, "ENTERO")
	agregarPalabra(matriz, 7, "PARA")
	agregarPalabra(matriz, 8, "MIENTRAS")
	imprimirMatriz(matriz, filas, columnas)
	Escribir buscarR(matriz, 1, columnas)
	
	//ENCONTRAR R MAYOR
	Para i=0 Hasta filas-1 Con Paso 1 Hacer
		si buscarR(matriz, i, columnas ) > posicionRMayor Entonces
			posicionRMayor = buscarR(matriz, i, columnas )
		FinSi
	Fin Para
	
	para i=0 Hasta filas-1 Hacer
		acomodarPalabra(matriz, i, filas, columnas,posicionRMayor)
	FinPara
	
	imprimirMatriz(matriz, filas, columnas)
FinAlgoritmo

SubProceso inicializarMatriz(matriz, filas, columnas)
	Definir i,j Como Entero
	Para i = 0 Hasta filas - 1 Hacer
		Para j = 0 Hasta columnas - 1 Hacer
			matriz[i,j] = "*"
		Fin Para
	Fin Para
FinSubProceso

SubProceso imprimirMatriz(matriz, filas, columnas)
	Definir i,j Como Entero
	Para i = 0 Hasta filas - 1 Hacer
		Para j = 0 Hasta columnas - 1 Hacer
			Escribir matriz[i,j], " " sin saltar
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso

SubProceso agregarPalabra(matriz, fila, palabra)
	Definir j Como Entero
	Para j = 0 Hasta Longitud(palabra) - 1 Hacer
		matriz[fila, j] = Subcadena(palabra, j ,j)
	Fin Para
FinSubProceso

Funcion posicionR<- buscarR(matriz, fila, columnas)
	definir j, posicionR Como Entero
	Para j = 0 Hasta columnas -1 Hacer
		si matriz[fila,j] == "R" Entonces
			posicionR = j
			j = columnas - 1
		FinSi
	Fin Para
FinSubProceso

SubProceso acomodarPalabra(matriz, fila ,filas, columnas,posicionRMayor)
	Definir auxiliar1, auxiliar2 Como Caracter
	definir i,j,k, posicionRPalabra Como Entero
	posicionRPalabra = 0
	
	posicionRPalabra = buscarR(matriz, fila, columnas )
	
	Para j = columnas -1 Hasta 0 Con Paso -1 Hacer
		si matriz(fila, j) <> "*" Entonces
			matriz(fila, j + (posicionRMayor-posicionRPalabra)) = matriz(fila,j)
		FinSi
	FinPara
	
	si posicionRMayor - posicionRPalabra <> 0 Entonces
		para k = 0 Hasta posicionRMayor - posicionRPalabra -1 Hacer
			matriz(fila,k) = "*"
		FinPara
	FinSi
	
	
FinSubProceso