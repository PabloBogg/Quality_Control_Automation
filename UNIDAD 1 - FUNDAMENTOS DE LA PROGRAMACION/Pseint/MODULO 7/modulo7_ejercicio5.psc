///Crea una función que determine si un número ingresado por el 
///usuario es primo. Un número es primo si solo es divisible por 
///1 y por sí mismo (por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc.) . 
///Recuerda nombrar y guardar tu algoritmo.


Algoritmo ejercicio5
	Definir num Como Entero
	Definir resultado Como Logico
	Escribir "Ingresar Numero: "
	Leer num
	
	Segun num Hacer
		0:
			resultado=Falso
		1:
			resultado=Falso
		De Otro Modo:
			resultado=esPrimo(num)
	FinSegun
	
	
	Escribir "El numero es primo: ", resultado
	
FinAlgoritmo

Funcion resultado=esPrimo(num)
	Definir resultado Como Logico
	Definir i, contador Como Entero
	contador=0
	Para i=2 Hasta num-1 Hacer
		Si num%i=0 Entonces
			contador=contador+1
		FinSi
	FinPara
	
	Si contador>=1 Entonces
		resultado=Falso
	SiNo
		resultado=Verdadero
	FinSi

FinFuncion
	