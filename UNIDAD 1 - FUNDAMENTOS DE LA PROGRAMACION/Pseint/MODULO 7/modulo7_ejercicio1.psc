///Diseña una función calcularSuma que calcule la suma de dos números. 
///En el programa principal, solicita al usuario los dos números y pásalos 
///a la función. La función debe calcular la suma y devolver el resultado para 
///que se imprima en el programa principal. Recuerda nombrar y guardar tu algoritmo.

Algoritmo ejercicio1
	Definir num1, num2, resultado Como Real
	
	Escribir "Ingresar el 1ª Numero: "
	Leer num1
	Escribir "Ingresar el 2ª Numero: "
	Leer num2
	
	resultado=calcularSuma(num1,num2)
	Escribir "Resultado: ", resultado
	
FinAlgoritmo

Funcion calculo=calcularSuma (numero1, numero2)
	Definir calculo Como Real
	calculo=numero1+numero2
FinFuncion
