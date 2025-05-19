///Crea un programa que solicite al usuario ingresar una frase y luego la muestre en 
///pantalla con un espacio entre cada letra. Es importante, almacenar esta nueva palabra 
///con espacios en una variable destinada a dicho fin. Por ejemplo:


Algoritmo ejercicio2
	Definir frase, fraseEspacios Como Caracter
	Definir i Como Entero
	
	Escribir "Ingresar frase: "
	Leer frase
	
	fraseEspacios=""
	
	Para i=0 Hasta Longitud(frase) Hacer
		
		fraseEspacios= fraseEspacios + SubCadena(frase,i,i) + " "
		
	FinPara
	
	Escribir fraseEspacios
	
FinAlgoritmo
