///Crea un programa que cumpla con las 
///siguientes condiciones:

///Define y dimensiona una matriz de 5x5 
///para almacenar datos numéricos enteros.
	
///Rellena la matriz de manera aleatoria 
///con números comprendidos entre 10 y 40.
	
///Permite al usuario ingresar un número 
///para buscarlo dentro de la matriz.
		
///Si el número se encuentra, muestra en pantalla 
///un mensaje adecuado junto con las coordenadas en 
///la matriz (fila y columna). En caso de que el número 
///esté repetido, solo se mostrará la posición de la 
///primera ocurrencia.
			
///Si el número no se encuentra, informa por pantalla.


Algoritmo ejercicio3
	Definir matriz, num,fila,columna,min,max Como Entero
	fila=5
	columna=5
	min=10
	max=40
	Dimension matriz[fila,columna]
	
	Escribir "Ingresar el numero a buscar en la matriz: "
	leer num
	
	llenadoAleatorio(matriz,fila,columna,min,max)
	buscar(matriz,fila,columna,num)
	imprimirMatriz(matriz,fila,columna)
FinAlgoritmo

//--LLENADO DE MATRIZ--
SubProceso llenadoAleatorio(matriz Por Referencia,fila Por Referencia,columna Por Referencia,min Por Referencia,max Por Referencia)
	definir i,j Como Entero
	Para i=0 Hasta fila-1 Hacer
		Para j=0 Hasta columna-1 Hacer
			matriz[i,j]=Aleatorio(min,max)
		FinPara
	FinPara
FinFuncion

//--BUSCAR NUMERO--
SubProceso buscar(matriz Por Referencia,fila Por Referencia,columna Por Referencia,num Por Referencia)
	definir i,j Como Entero
	Para i=0 Hasta fila-1 Hacer
		Para j=0 Hasta columna-1 Hacer
			Si matriz[i,j]=num Entonces
				Escribir "El numero ",num, " se encuentra en la Fila ",i+1," y Columna ",j+1,"."
				i=fila-1
				j=columna-1
			SiNo
				Escribir "El numero no se encuentra en la matriz"
			FinSi
		FinPara
	FinPara
FinSubProceso

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
