///Realiza un procedimiento que permita intercambiar el valor de dos 
///variables de tipo entero. La variable A debe terminar con el valor 
///de la variable B, y viceversa. Este cambio debe ser de forma permanente, 
///es decir, los valores deben ser sobre escritos.  Recuerda nombrar y guardar tu algoritmo.

///Nota: Ten presente el paso por referencia, el cual te permite modificar 
///los valores de variables declaradas en el algoritmo principal
Algoritmo ejercicio1
	Definir num1, num2 Como Entero
	Escribir "Ingresar numero 1: "
	Leer num1
	Escribir "Ingresar numero 2: "
	Leer num2
	
	intercambio(num1,num2)
	Escribir "Numero 1: ",num1
	Escribir "Numero 2: ",num2
	
FinAlgoritmo

SubProceso intercambio (num1 Por Referencia, num2 Por Referencia)
	Definir aux Como Entero
	aux=num1
	num1=num2
	num2=aux
FinSubProceso

	