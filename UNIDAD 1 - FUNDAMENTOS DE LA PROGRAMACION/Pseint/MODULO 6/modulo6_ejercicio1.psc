///Realiza un programa que lea cinco n�meros enteros, cada uno comprendido entre 1 y 20, 
///e imprima cada n�mero seguido de una cantidad de asteriscos equivalente a su valor. Por ejemplo:
//Para el n�mero 5, imprimir: 5 *****
//Para el n�mero 3, imprimir: 3 ***
//Para el n�mero 11, imprimir: 11 ***********
//Para el n�mero 2, imprimir: 2 **
//Para el n�mero 9, imprimir: 9 *********


Algoritmo ejercicico1
	Definir num, i, j Como Entero
	Definir salida Como Caracter
	
	
	Para i=1 Hasta 5 Hacer
		Repetir
			Escribir "Ingresar el ", i,"� numero entre 1 y 20: "
			Leer num
		Hasta Que num>=1 Y num<=20
		
		salida=""
		Para j=1 Hasta num Hacer
			salida=Concatenar(salida,"*")
		FinPara
		
		Escribir i,"� Numero: ",salida
		
	FinPara

	
FinAlgoritmo
