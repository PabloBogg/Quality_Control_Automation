///El mundo de la investigaci�n se enfrenta a un nuevo desaf�o cient�fico.
///Un brillante investigador, el Dr. Marlowe, ha descubierto una intrigante 
///correlaci�n entre secuencias gen�ticas codificadas y patrones matriciales.

///Cada muestra de ADN se presenta como una secuencia de caracteres compuesta 
///por cuatro bases: A, B, C y D. Por ejemplo, una muestra podr�a ser "ACDDCADBCDABDBBA".

///El Dr. Marlowe, empleando un enfoque innovador, convierte estas secuencias 
///en matrices cuadradas (MxM) y busca patrones espec�ficos en las diagonales
/// principales de estas matrices. El patr�n espec�fico consiste en que ambos
/// conjuntos de caracteres en las diagonales principales de la matriz sean 
///id�nticos, aunque los caracteres entre s� pueden ser diferentes. 
///Por ejemplo, una muestra podr�a generar la siguiente matriz:
//	0 1 2 3
///	A C D D  0
///	C A D B  1
///	C D A B  2
///	D B B A  3

///	Sin embargo, lo intrigante es que el tama�o de la matriz no se conoce
/// de antemano y debe inferirse de la muestra ingresada.
//	
///Tu Misi�n: Desarrollar un programa que permita al usuario ingresar 
///una muestra de ADN completa y determinar su validez seg�n los patrones
/// identificados por el Dr. Marlowe. Si la muestra es v�lida, el programa
/// deber� mostrar la matriz generada y un mensaje indicando si se ha encontrado
/// un patr�n espec�fico. En caso contrario, se solicitar� al usuario que ingrese
/// una nueva muestra.
//			
/// Para que una muestra sea considerada v�lida, debe cumplir con los siguientes criterios:
//				
/// Debe tener una longitud de 9 caracteres para ser almacenada en una matriz de
/// 3x3 o de 16 caracteres para ser almacenada en una matriz de 4x4, respectivamente.
//						
///Los caracteres de la muestra deben ser exclusivamente A, B, C o D para ser 
///considerada v�lida.
//							
///Para encontrar el patr�n especificado: 
//								
///Una vez validada la muestra ingresada, se proceder� a crear la matriz 
///correspondiente para recorrer sus diagonales. Si todos los caracteres 
///de la diagonal principal 1 son iguales, indicando que cumple con el patr�n,
/// se continuar� analizando la diagonal principal 2. Si todos los caracteres 
///de la diagonal principal 2 tambi�n son iguales, se concluir� que la muestra 
///ingresada presenta los patrones espec�ficos esperados. En ese caso, se mostrar� 
///en pantalla el mensaje "�Felicidades! La muestra contiene patrones espec�ficos 
///en sus diagonales". En caso contrario, si la muestra no cumple con los patrones 
///especificados en ambas diagonales, se mostrar� en pantalla el mensaje "La muestra 
///NO contiene los patrones especificados en sus diagonales".
Algoritmo complementario
	Definir adn, matriz,letra Como Caracter
	Definir validacion Como Logico
	Definir filas, columnas, i,j,indiceADN Como Entero
	indiceADN=0
	
	
	//--VALIDACION
	Repetir
		Escribir "Ingresar el ADN: "
		Leer adn
		Si Longitud(adn)<>9 Y Longitud(adn)<>16 Entonces
			Escribir "El ADN debe tener una longitud de 9 o 16 caracteres"
		FinSi
		adn=Mayusculas(adn)
		Para i=0 Hasta Longitud(adn)-1 Hacer
			letra=Subcadena(adn,i,i)
			Si letra="A" o letra="B" o letra="C" o letra="D" Entonces
				validacion=Verdadero
			SiNo
				validacion=Falso
				i=Longitud(adn)-1
			FinSi
		FinPara
		Si validacion = falso 
			Escribir "El ADN solo debe contener los caracter A, B, C o D"
		FinSi
	Hasta Que (longitud(adn)=9 o Longitud(adn)=16) y validacion=Verdadero
	
	//--DEFINIR matriz
	Si Longitud(adn)=9 Entonces
		filas=3
		columnas=3
	SiNo
		filas=4
		columnas=4
	FinSi
	Dimension matriz[filas, columnas]
	Para i=0 hasta filas-1 Hacer
		Para j=0 hasta columnas-1 Hacer
			matriz[i,j]=Subcadena(adn,indiceADN,indiceADN)
			indiceADN=indiceADN+1
		FinPara
	FinPara
	
	
	
	//--DETERMINAR PATRON
	buscarPatron(matriz,filas,columnas)
	
	//--MOSTRAR MATRIZ
	imprimirMatriz(matriz,filas, columnas)
	
	
	
FinAlgoritmo

SubProceso buscarPatron(matriz,filas,columnas)
	Definir i, j Como Entero
	Definir diagonal1,diagonal2 Como Logico
	
	
	diagonal1=Falso
	diagonal2=Falso
	Para i=0 hasta filas-1 Hacer
		Para j=1 Hasta  columnas-1 Hacer
			Si i=j Entonces
				Si matriz[i,j]=matriz[0,0]
					diagonal1=Verdadero
				FinSi
			FinSi
			Si i+j=filas-1 Entonces
				Si matriz[i,j]=matriz[0,columnas-1]
					diagonal2=Verdadero
				FinSi
			FinSi
		FinPara
	FinPara
	
	Si diagonal1 y diagonal2 Entonces
		Escribir "�Felicidades! La muestra contiene patrones espec�ficos en sus diagonales"
	SiNo
		Escribir "La muestra NO contiene los patrones especificados en sus diagonales"
	FinSi
FinSubProceso

//--IMPRIMIR MATRIZ--
SubProceso imprimirMatriz(matriz,filas, columnas)
	Definir i, j Como Entero
	Para i=0 hasta filas-1 Hacer
		Para j=0 Hasta columnas-1 Hacer
			Escribir "|",matriz[i,j],"|" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	