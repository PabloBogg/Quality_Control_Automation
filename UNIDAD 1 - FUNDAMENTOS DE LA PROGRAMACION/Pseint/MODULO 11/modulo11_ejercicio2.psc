///Crea un vector que contenga 100 notas de 100 supuestos estudiantes, 
///con valores entre 0 y 10 generadas aleatoriamente.. Luego, de acuerdo 
///a las notas almacenadas en el arreglo, el programa debe indicar 
///ucántos estudiantes son:

///Deficientes: 0-3
	
///Regulares: 4-6
	
///Buenos: 7-8
	
///Excelentes: 9-10

Algoritmo ejercicio2
	Definir notas, i, contadorD, contadorR, contadorB, contadorE Como Entero
	Dimension notas[100]
	
	contadorD=0
	contadorR=0
	contadorB=0
	contadorE=0
	
	Para i=0 Hasta 100-1 Hacer
		notas[i]=Aleatorio(1,10)
		Si notas[i] >=0 y notas[i]<=3 Entonces
			contadorD=contadorD+1
			Sino Si notas[i] >=4 y notas[i]<=6 Entonces
				contadorR=contadorR+1
				Sino Si notas[i] >=7 y notas[i]<=8 Entonces
					contadorB=contadorB+1
					Sino Si notas[i] >=9 y notas[i]<=10 Entonces
						contadorE=contadorE+1
					FinSi
				FinSi		
			FinSi
		FinSi
	FinPara
	
	Escribir "Hay ", contadorD " estudiantes Deficientes"
	Escribir "Hay ", contadorR " estudiantes Regulares"
	Escribir "Hay ", contadorB " estudiantes Buenos"
	Escribir "Hay ", contadorE " estudiantes Excelentes"
	
FinAlgoritmo
