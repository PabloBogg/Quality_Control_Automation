///Crea una función esMultiplo que reciba dos números proporcionados 
///por el usuario y valide si el primer número es múltiplo del segundo. 
///La función debe devolver True si el primer número es múltiplo del 
///segundo, y False en caso contrario. Recuerda nombrar y guardar tu algoritmo.

Algoritmo ejercicio3
	Definir num1, num2 Como Real
	Definir resultado Como Logico
	Escribir "Ingresar el 1ª Numero: "
	Leer num1
	Escribir "Ingresar el 2ª Numero: "
	Leer num2
	
	resultado=esMultiplo(num1,num2)
	Escribir "El 1ª numero es multiplo del 2ª numero: ", resultado
	
FinAlgoritmo

Funcion resultado=esMultiplo(num1,num2)
	Definir resultado Como Logico
	si num1%num2=0 Entonces
		resultado=Verdadero
	SiNo
		resultado=Falso
	FinSi
FinFuncion
