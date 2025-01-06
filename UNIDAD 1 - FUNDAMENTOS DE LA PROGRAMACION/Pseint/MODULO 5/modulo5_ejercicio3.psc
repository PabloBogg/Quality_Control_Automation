///Dise�a un programa que cuente la cantidad de n�meros entre 1 y 100 que son m�ltiplos de 2 o de 3. 
///Recuerda nombrar y guardar tu algoritmo.

///Nota: Si un n�mero cumple ambas condiciones, debe ser contabilizado en ambos casos. 
///Por ejemplo, el n�mero 18 es m�ltiplo de 2 y, a su vez, es m�ltiplo de 3


Algoritmo ejercicio3
	Definir inicioRango, finRango, i Como Entero
	Definir multiploDos, multiploTres Como Caracter
	
	Escribir "Ingresar el Inicio del Rango: "
	Leer inicioRango
	
	Escribir "Ingresar el Final del Rango: "
	Leer finRango
	
	multiploDos=""
	multiploTres=""
	Para i=inicioRango Hasta finRango Hacer
		si i%2=0 Entonces
			multiploDos= multiploDos + " - "+ConvertirATexto(i)
		FinSi
		
		Si i%3=0 Entonces
			multiploTres=multiploTres + " - "+ConvertirATexto(i)
		FinSi
	FinPara
	
	Escribir "Los multiplos de 2, en el rango ",inicioRango, "-",finRango," son: ", multiploDos
	Escribir "Los multiplos de 3, en el rango ",inicioRango, "-",finRango," son: ", multiploTres
	
FinAlgoritmo
