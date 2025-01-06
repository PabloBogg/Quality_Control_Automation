///Realiza un programa que lea cinco números enteros, cada uno comprendido entre 1 y 20, 
///e imprima cada número seguido de una cantidad de asteriscos equivalente a su valor. Por ejemplo:
//Para el número 5, imprimir: 5 *****
//Para el número 3, imprimir: 3 ***
//Para el número 11, imprimir: 11 ***********
//Para el número 2, imprimir: 2 **
//Para el número 9, imprimir: 9 *********


Algoritmo ejercicico1
	Definir num, i, j Como Entero
	Definir salida Como Caracter
	
	
	Para i=1 Hasta 5 Hacer
		Repetir
			Escribir "Ingresar el ", i,"º numero entre 1 y 20: "
			Leer num
		Hasta Que num>=1 Y num<=20
		
		salida=""
		Para j=1 Hasta num Hacer
			salida=Concatenar(salida,"*")
		FinPara
		
		Escribir i,"ª Numero: ",salida
		
	FinPara

	
FinAlgoritmo
