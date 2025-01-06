//Desarrolla un programa que defina un vector de tamaño n, 
//que almacene números, determinando por el usuario el tamaño 
//que tendrá dicho arreglo. Este tamaño debe ser solicitado 
//al usuario por teclado, y almacenado en una variable para 
//dicho fin. 

//Haciendo uso de la variable creada para ese fin, 
//dimensionar el arreglo, y llenar cada una de sus 
//posiciones con valores aleatorios entre 1 y 25. 
//		
//Luego, se solicitará al usuario que ingrese un 
//número para buscar dentro del arreglo. El programa 
//buscará el elemento dentro del arreglo y mostrará la 
//posición donde se encuentra.
//			
//Si el número se encuentra dentro del arreglo, se imprimirán 
//todas las posiciones donde se encuentra ese valor, en caso 
//de que estuviera repetido.
//				
//Si el número a buscar no está dentro del arreglo, 
//se mostrará un mensaje indicándolo.

Algoritmo ejercicio3
	Definir lista, i, n, num, contador Como Entero
	Escribir "Ingresar el tamaño del arreglo: "
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
