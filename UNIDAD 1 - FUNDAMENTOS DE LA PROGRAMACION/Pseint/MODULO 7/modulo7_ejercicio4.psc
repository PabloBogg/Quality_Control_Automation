///Diseña una función que reciba una frase y una letra proporcionadas 
///por el usuario y devuelva la cantidad de veces que la letra aparece 
///en la frase. Recuerda nombrar y guardar tu algoritmo.


Algoritmo ejercicio4
	Definir frase, letra Como Caracter
	Definir resultado Como Entero
	Escribir "Ingresar frase: "
	Leer frase
	Escribir "Ingfresar letra: "
	Leer letra
	
	resultado=contarLetra(frase,letra)
	Escribir "La letra ",letra, " aparece ", resultado, " veces."	
FinAlgoritmo

Funcion resultado=contarLetra(frase,letra)
	Definir resultado, i Como Entero
	resultado=0
	Para i=0 Hasta Longitud(frase) Hacer
		Si Subcadena(frase,i,i)=letra Entonces
			resultado=resultado+1
		FinSi
	FinPara
	
FinFuncion
