///Crea una función esImpar que determine si un número es impar. 
///Si es impar, la función debe devolver True; en caso contrario, 
///debe devolver False. Nota: la función no debe incluir mensajes 
///que indiquen si el número es par o impar; esto debe manejarse en 
///el programa principal. Recuerda nombrar y guardar tu algoritmo.


Algoritmo ejercicio2
	Definir num Como Entero
	Definir resultado Como Logico
	Escribir "Ingresar Numero: "
	Leer num
	
	resultado=esImpar(num)
	Escribir "El numero es Impar: ", resultado
FinAlgoritmo

Funcion calculo=esImpar(num)
	Definir calculo Como Logico
	si num%2=0 Entonces
		calculo=Falso
	SiNo
		calculo=Verdadero
	FinSi
FinFuncion
