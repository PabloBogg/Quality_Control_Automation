///Dise�a una funci�n calcularSuma que calcule la suma de dos n�meros. 
///En el programa principal, solicita al usuario los dos n�meros y p�salos 
///a la funci�n. La funci�n debe calcular la suma y devolver el resultado para 
///que se imprima en el programa principal. Recuerda nombrar y guardar tu algoritmo.

Algoritmo ejercicio1
	Definir num1, num2, resultado Como Real
	
	Escribir "Ingresar el 1� Numero: "
	Leer num1
	Escribir "Ingresar el 2� Numero: "
	Leer num2
	
	resultado=calcularSuma(num1,num2)
	Escribir "Resultado: ", resultado
	
FinAlgoritmo

Funcion calculo=calcularSuma (numero1, numero2)
	Definir calculo Como Real
	calculo=numero1+numero2
FinFuncion
