//Desarrolla un programa que rellene un vector de tama�o N, 
//con valores num�ricos ingresados por el usuario. A continuaci�n, 
//se deber� crear una funci�n que reciba el vector y devuelva 
//el valor m�s grande del arreglo.

Algoritmo ejercicio4
	Definir lista, i, n  Como Entero
	Escribir "Ingresar tama�o del arreglo: "
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
