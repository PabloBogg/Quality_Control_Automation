///Crea una funci�n esMultiplo que reciba dos n�meros proporcionados 
///por el usuario y valide si el primer n�mero es m�ltiplo del segundo. 
///La funci�n debe devolver True si el primer n�mero es m�ltiplo del 
///segundo, y False en caso contrario. Recuerda nombrar y guardar tu algoritmo.

Algoritmo ejercicio3
	Definir num1, num2 Como Real
	Definir resultado Como Logico
	Escribir "Ingresar el 1� Numero: "
	Leer num1
	Escribir "Ingresar el 2� Numero: "
	Leer num2
	
	resultado=esMultiplo(num1,num2)
	Escribir "El 1� numero es multiplo del 2� numero: ", resultado
	
FinAlgoritmo

Funcion resultado=esMultiplo(num1,num2)
	Definir resultado Como Logico
	si num1%num2=0 Entonces
		resultado=Verdadero
	SiNo
		resultado=Falso
	FinSi
FinFuncion
