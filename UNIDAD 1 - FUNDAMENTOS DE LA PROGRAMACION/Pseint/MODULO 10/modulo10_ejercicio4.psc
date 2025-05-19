//Desarrolla un programa que rellene un vector de tamaño N, 
//con valores numéricos ingresados por el usuario. A continuación, 
//se deberá crear una función que reciba el vector y devuelva 
//el valor más grande del arreglo.

Algoritmo ejercicio4
	Definir lista, i, n  Como Entero
	Escribir "Ingresar tamaño del arreglo: "
	Leer n
	Dimension lista[n]
	
	Para i=0 Hasta n-1 Hacer
		Escribir "Ingresar el numero ",i+1,"/",n,": "
		Leer lista[i]
	FinPara
	
	Escribir "El maximo del arreglo es: ", maximo(lista,n)
	
FinAlgoritmo

Funcion resultado=maximo(lista,n)
	Definir resultado,i Como Entero
	resultado=0
	Para i=0 Hasta n-1 Hacer
		Si resultado>lista[i]
			resultado=resultado
		SiNo
			resultado=lista[i]
		FinSi
	FinPara
	
FinFuncion
