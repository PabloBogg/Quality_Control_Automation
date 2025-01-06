//Desarrolla un programa que defina un vector de tama�o n, 
//que almacene n�meros, determinando por el usuario el tama�o 
//que tendr� dicho arreglo. Este tama�o debe ser solicitado 
//al usuario por teclado, y almacenado en una variable para 
//dicho fin. 

//Haciendo uso de la variable creada para ese fin, 
//dimensionar el arreglo, y llenar cada una de sus 
//posiciones con valores aleatorios entre 1 y 25. 
//		
//Luego, se solicitar� al usuario que ingrese un 
//n�mero para buscar dentro del arreglo. El programa 
//buscar� el elemento dentro del arreglo y mostrar� la 
//posici�n donde se encuentra.
//			
//Si el n�mero se encuentra dentro del arreglo, se imprimir�n 
//todas las posiciones donde se encuentra ese valor, en caso 
//de que estuviera repetido.
//				
//Si el n�mero a buscar no est� dentro del arreglo, 
//se mostrar� un mensaje indic�ndolo.

Algoritmo ejercicio3
	Definir lista, i, n, num, contador Como Entero
	Escribir "Ingresar el tama�o del arreglo: "
	Leer n
	Dimension lista[n]
	Escribir "Ingresar el numero a buscar: "
	Leer num
	contador=0
	Para i=0 Hasta n-1 Hacer
		lista[i]=Aleatorio(1,25)
		Escribir lista[i]
		Si lista[i]=num Entonces
			contador=contador+1
		SiNo
			contador=0
		FinSi
	FinPara
	
	
	
	Si contador=0 Entonces
		Escribir "El numero ",num," no se encuentra en el arreglo."
	SiNo
		Escribir "El numero ",num, "esta en la/s posicion/es: " Sin Saltar
		Para i=0 Hasta n-1 Hacer
			Si lista[i]=num Entonces
				Escribir i,", " Sin saltar
			Fin si
		FinPara
	FinSi
	
	
FinAlgoritmo
