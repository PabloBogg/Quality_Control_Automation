//Crea un programa que solicite al usuario ingresar 
//el tama�o deseado para dos vectores. El primero almacenar� 
//	nombres de personas como cadenas, mientras que el segundo vector 
//	contendr� la longitud de cada uno de los nombres. Luego, se 
//	mostrar�n en pantalla los nombres junto con su respectiva longitud.

Algoritmo ejercicio1
	Definir nombres Como Caracter
	Definir longitudes, i, n Como Entero
	
	Repetir
		Escribir "Ingresar el largo de los arreglos: "
		Leer n
	Hasta Que n>0 

	
	Dimension nombres[n], longitudes[n]
	
	Para i=0 Hasta n-1 Hacer
		Escribir "Ingresar el nombre N� ",i+1,"/",n-1,": "
		Leer nombres[i]
		longitudes[i]=Longitud(nombres[i])
	FinPara
	
	Para i=0 Hasta n-1 Hacer
		Escribir "El nombre N�",i+1," es ->",nombres[i], "<- y tiene una longitud de ->", longitudes[i], "<-"
	FinPara
	

FinAlgoritmo
