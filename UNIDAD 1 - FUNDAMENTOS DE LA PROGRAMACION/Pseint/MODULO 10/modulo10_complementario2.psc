Algoritmo fraseEnVector
	
	Definir vectorCaracteres, letraInsertar Como Caracter
	Definir fraseUsuario Como Cadena
	Definir i, posInsertar Como Entero
	
	Dimension vectorCaracteres[20]
	
	fraseUsuario = ""
	Repetir
		Escribir "Ingresa una frase de 20 o menos caracteres"
		Leer fraseUsuario
	Mientras Que Longitud(fraseUsuario) > 20
	
	//Llenar vector caracteres
	Para i<-0 Hasta 19 Hacer
		Si(i < Longitud(fraseUsuario)) Entonces
			vectorCaracteres[i] = Subcadena(fraseUsuario, i, i)
		SiNo
			vectorCaracteres[i] = " "
		FinSi
		
	FinPara
	
	//verificar cómo quedó con la frase base
	imprimirVector(vectorCaracteres)
	
	Escribir "ingresar una letra y una posición dónde insertarla en el arreglo"
	Leer letraInsertar, posInsertar
	
	Si(vectorCaracteres[posInsertar] = " ") Entonces
		vectorCaracteres[posInsertar] = letraInsertar
	SiNo
		Escribir "la posición ya esta ocupada con la letra ", vectorCaracteres[posInsertar]
	FinSi
	
	//verificar cómo quedó al final
	imprimirVector(vectorCaracteres)
	
FinAlgoritmo


SubProceso imprimirVector(vectorCaracteres)
	Definir j Como Entero
	//Revisar vector Caracteres
	Para j<-0 Hasta 19 Hacer
		Escribir Sin Saltar vectorCaracteres[j], " | "
	FinPara
	Escribir ""
FinSubProceso
