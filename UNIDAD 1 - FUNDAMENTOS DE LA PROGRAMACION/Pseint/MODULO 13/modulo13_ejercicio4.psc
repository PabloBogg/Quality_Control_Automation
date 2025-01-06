///Desarrolla un programa que calcule la multiplicación de 
///dos matrices de enteros de tamaño 3x3. Asegúrate de 
///inicializar las matrices para evitar tener que ingresar 
///datos desde el teclado. La multiplicación se almacenará 
///en una tercera matriz, donde cada elemento será el resultado 
///de multiplicar los elementos correspondientes en la misma 
///posición de las matrices A y B. Por ejemplo, el elemento 
///en la posición (0,0) de la matriz C será el resultado de 
///multiplicar el elemento en la posición (0,0) de la matriz 
///A con el elemento en la posición (0,0) de la matriz B.


Algoritmo ejericio4
	Definir mA,mB,mC,f,c,i,j Como Entero
	f=3
	c=3
	Dimension mA[3,3],mB[3,3],mC[3,3]
	llenadoAleatorio(mA,f,c)
	llenadoAleatorio(mB,f,c)
	multiplicarMatriz(mA,mB,mC,f,c)
	
	Escribir "MATRIZ A"
	imprimirMatriz(mA,f,c)
	Escribir "MATRIZ B"
	imprimirMatriz(mB,f,c)
	Escribir "MATRIZ C"
	imprimirMatriz(mC,f,c)

	
	
	
	
FinAlgoritmo

//--LLENADO DE MATRIZ--
SubProceso llenadoAleatorio(matriz,f,c)
	Definir i,j, min,max Como Entero
	min=1
	max=10
	Para i=0 Hasta f-1 Hacer
		Para j=0 Hasta c-1 Hacer
			matriz[i,j]=Aleatorio(min,max)
		FinPara
	FinPara
FinFuncion

//--MULTIPLICAR MATRIZ--
SubProceso multiplicarMatriz(mA,mB,mC,f,c)
	Definir i,j Como Entero
	Para i=0 Hasta f-1 Hacer
		Para j=0 Hasta c-1 Hacer
			mC[i,j]=mA[i,j]*mB[i,j]
		FinPara
	FinPara
FinFuncion

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


