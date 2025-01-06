///El mundo de la investigación se enfrenta a un nuevo desafío científico.
///Un brillante investigador, el Dr. Marlowe, ha descubierto una intrigante 
///correlación entre secuencias genéticas codificadas y patrones matriciales.

///Cada muestra de ADN se presenta como una secuencia de caracteres compuesta 
///por cuatro bases: A, B, C y D. Por ejemplo, una muestra podría ser "ACDDCADBCDABDBBA".

///El Dr. Marlowe, empleando un enfoque innovador, convierte estas secuencias 
///en matrices cuadradas (MxM) y busca patrones específicos en las diagonales
/// principales de estas matrices. El patrón específico consiste en que ambos
/// conjuntos de caracteres en las diagonales principales de la matriz sean 
///idénticos, aunque los caracteres entre sí pueden ser diferentes. 
///Por ejemplo, una muestra podría generar la siguiente matriz:
//	0 1 2 3
///	A C D D  0
///	C A D B  1
///	C D A B  2
///	D B B A  3

///	Sin embargo, lo intrigante es que el tamaño de la matriz no se conoce
/// de antemano y debe inferirse de la muestra ingresada.
//	
///Tu Misión: Desarrollar un programa que permita al usuario ingresar 
///una muestra de ADN completa y determinar su validez según los patrones
/// identificados por el Dr. Marlowe. Si la muestra es válida, el programa
/// deberá mostrar la matriz generada y un mensaje indicando si se ha encontrado
/// un patrón específico. En caso contrario, se solicitará al usuario que ingrese
/// una nueva muestra.
//			
/// Para que una muestra sea considerada válida, debe cumplir con los siguientes criterios:
//				
/// Debe tener una longitud de 9 caracteres para ser almacenada en una matriz de
/// 3x3 o de 16 caracteres para ser almacenada en una matriz de 4x4, respectivamente.
//						
///Los caracteres de la muestra deben ser exclusivamente A, B, C o D para ser 
///considerada válida.
//							
///Para encontrar el patrón especificado: 
//								
///Una vez validada la muestra ingresada, se procederá a crear la matriz 
///correspondiente para recorrer sus diagonales. Si todos los caracteres 
///de la diagonal principal 1 son iguales, indicando que cumple con el patrón,
/// se continuará analizando la diagonal principal 2. Si todos los caracteres 
///de la diagonal principal 2 también son iguales, se concluirá que la muestra 
///ingresada presenta los patrones específicos esperados. En ese caso, se mostrará 
///en pantalla el mensaje "¡Felicidades! La muestra contiene patrones específicos 
///en sus diagonales". En caso contrario, si la muestra no cumple con los patrones 
///especificados en ambas diagonales, se mostrará en pantalla el mensaje "La muestra 
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
		Escribir "¡Felicidades! La muestra contiene patrones específicos en sus diagonales"
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
	