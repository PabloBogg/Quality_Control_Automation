//Crea un programa que solicite al usuario ingresar 
//el tamaño deseado para dos vectores. El primero almacenará 
//	nombres de personas como cadenas, mientras que el segundo vector 
//	contendrá la longitud de cada uno de los nombres. Luego, se 
//	mostrarán en pantalla los nombres junto con su respectiva longitud.

Algoritmo ejercicio1
	Definir nombres Como Caracter
	Definir longitudes, i, n Como Entero
	
	Repetir
		Escribir "Ingresar el largo de los arreglos: "
		Leer n
	Hasta Que n>0 

	
	Dimension nombres[n], longitudes[n]
	
	Para i=0 Hasta n-1 Hacer
		Escribir "Ingresar el nombre Nº ",i+1,"/",n-1,": "
		Leer nombres[i]
		longitudes[i]=Longitud(nombres[i])
	FinPara
	
	Para i=0 Hasta n-1 Hacer
		Escribir "El nombre Nº",i+1," es ->",nombres[i], "<- y tiene una longitud de ->", longitudes[i], "<-"
	FinPara
	

FinAlgoritmo
