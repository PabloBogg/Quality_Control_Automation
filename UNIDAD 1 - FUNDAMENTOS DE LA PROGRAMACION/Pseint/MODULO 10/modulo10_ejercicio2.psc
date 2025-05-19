//Realiza un programa que lea 10 números reales por teclado, 
//los almacene en un arreglo y muestre por pantalla la suma y 
//multiplicación de todos los números ingresados al arreglo.

Algoritmo ejercicio2
	Definir lista,suma,multiplicacion Como Real
	Dimension lista[10]
	Definir i Como Entero
	
	suma=0
	multiplicacion=1
	Para i=0 Hasta 9 Hacer
		Escribir "Ingresar el numero ",i+1,"/10: "
		Leer lista[i]
		suma=suma+lista[i]
		multiplicacion=multiplicacion*lista[i]
	FinPara
	
	Escribir "El resultado de la suma es: " suma
	Escribir "El resultado de la multiplicacion es: " multiplicacion
FinAlgoritmo
