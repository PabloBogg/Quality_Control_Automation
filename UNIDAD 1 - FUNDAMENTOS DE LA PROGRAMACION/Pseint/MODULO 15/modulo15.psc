///Diseña un algoritmo que permita al usuario ingresar una frase.  
///Deberás asegurarte de que la longitud de la frase no exceda 
///los 100 caracteres; en caso de superar este límite, se solicitará 
///al usuario que vuelva a ingresar la frase hasta que cumpla con esta condición. 

///Una vez ingresada la frase, el programa separará los caracteres 
///en dos vectores: uno para almacenar exclusivamente las vocales
/// (A-E-I-O-U) y otro para las consonantes, así como para los 
///caracteres especiales y los espacios. 
				
///Los elementos en cada vector se acomodarán inicialmente por 
///orden de aparición en la frase. Además, se requiere la implementación 
///de un subprograma que permita mostrar los vectores creados, así como 
///el recuento total de elementos en cada uno de ellos.

Algoritmo ejercicio1
	Definir frase, vocales, resto, letra Como Caracter
	Definir i, indiceVocales, indiceResto Como entero
	indiceVocales=0
	indiceResto=0
	Dimension vocales[100], resto[100]
	
	//--INGRESAR FRASE
	Repetir 
		Escribir "Ingresar frase (limite 100 caracteres): "
		Leer frase
		Si Longitud(frase)>100 Entonces
			Escribir "La frase tiene ",Longitud(frase)," caracteres."
		FinSi
	Hasta Que Longitud(frase)<=100 
	
	
	//--SEPARAR VOCAL Y RESTO
	Para i=0 Hasta Longitud(frase)-1 Hacer
		letra=Mayusculas(Subcadena(frase,i,i))
		Si letra="A" o letra="E" o letra="I" o letra="O" o letra="U" Entonces
			vocales[indiceVocales]=letra
			indiceVocales=indiceVocales+1
		SiNo
			resto[indiceResto]=letra
			indiceResto=indiceResto+1
		FinSi
	FinPara
	
	//--MOSTRAR VECTORES
	Escribir "VOCALES"
	mostrarVector(vocales,indiceVocales)
	
	Escribir "RESTO"
	mostrarVector(resto, indiceResto)
	
	
FinAlgoritmo



SubProceso mostrarVector(vector,largo)
	Definir i como entero
	Para i=0 Hasta largo-1 Hacer
		Escribir vector[i], " | " Sin Saltar
	FinPara
	Escribir ""
	
	Escribir "El vector tiene ", largo, " caracteres."
FinSubProceso
