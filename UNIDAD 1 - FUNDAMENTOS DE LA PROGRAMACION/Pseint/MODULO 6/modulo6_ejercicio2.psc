///Escribe un programa que lea un número entero y devuelva la cantidad de 
///dígitos que lo componen. Por ejemplo, si ingresamos el número 12345, 
///el programa deberá devolver 5. Este cálculo se realizará utilizando 
///operaciones matemáticas, teniendo en cuenta que las variables de tipo entero 
///truncan los números o resultados.

Algoritmo ejercicio2
	Definir num, contador, divisor Como Entero
	Definir operacion1, operacion2 Como Real
	Escribir "Ingresar numero entero: "
	Leer num
	
	contador=-1
	divisor=10
	operacion1=0
	
	si num=0 Entonces
		contador=1
	SiNo
		Repetir
			operacion2=operacion1
			operacion1=num%divisor
			contador=contador+1
			divisor=divisor*10
		Hasta Que operacion1=operacion2 Y operacion1<>0 
	FinSi

	
	
		Escribir "El numero ingresado tiene ",contador," cifras"
	
	
FinAlgoritmo
