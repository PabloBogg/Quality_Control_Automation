///7. Implemente de forma recursiva una funci�n que le d� la 
///vuelta a una cadena de caracteres. NOTA: Si la cadena es 
///un pal�ndromo, la cadena y su inversa coincidir�n. 

Algoritmo complementario7
	definir palabra Como Caracter
	Escribir "Ingresar palabra: "
	Leer palabra

	escribir "La palabra inversa es: ", invertirPalabra(palabra)
	
FinAlgoritmo

funcion resultado = invertirPalabra(palabra)
	definir resultado,aux Como Caracter
	si Longitud(palabra)>=1 Entonces
		resultado=concatenar(Subcadena(palabra,Longitud(palabra)-1,Longitud(palabra)-1),invertirPalabra(subcadena(palabra,0,(Longitud(palabra)-2))))
	FinSi
FinFuncion
