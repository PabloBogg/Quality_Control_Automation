///Programa un juego en el que la computadora elija un número aleatorio entre 1 y 10, y el jugador 
///tenga que adivinarlo. El programa seguirá estos pasos:

///La computadora elige al azar un número "n" entre 1 y 10.

///El usuario ingresa un número "x".

///Si "x" no es el número exacto, el programa indica si "n" es mayor o menor que "x".	

///Se repite desde el paso 2 hasta que "x" sea igual a "n". 
///El programa imprimirá los mensajes adecuados para guiar al usuario hasta que adivine el número. 

Algoritmo complementario
	Definir numUsuario como Entero
	
	Definir numAleatorio Como Entero
	
	numAleatorio=Aleatorio(0,10)
	
	Repetir
		Escribir "Ingresar numeros: "
		Leer numUsuario
		
		si numUsuario>numAleatorio entonces
			Escribir "El numero ingresado es mayor"
		FinSi
		
		si numUsuario<numAleatorio Entonces
			Escribir "El numero ingresado es menor"
		FinSi
		
	Hasta Que numUsuario=numAleatorio 
	
	Escribir "El numero es: ", num
	
FinAlgoritmo
