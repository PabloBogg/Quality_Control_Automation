///Crea un programa que solicite al usuario ingresar 5 valores. 
///Los valores ingresados deben ser almacenados en un único arreglo y 
///debe mostrarlos posteriormente por pantalla. Sigue estos pasos:

Algoritmo ejercicio1
	definir vector, i Como Entero
	Dimension vector[5]
	
	para i=0 Hasta 4 Hacer
		Escribir "Ingresar el numero ",i+1,"/5: "
		Leer vector[i]
	FinPara
	
	Escribir "Los numeros ingresados son: " Sin Saltar
	Para i=0 Hasta 4 Hacer
		Si i=4 Entonces
			Escribir vector[i]
		SiNo
			Escribir vector[i], ", " Sin Saltar
		FinSi
	FinPara
	
FinAlgoritmo
