Algoritmo ejercicio3
	definir limite,num, suma Como Real
	
	escribir "ingresar el limite: "
	leer limite
	escribir "ingresar numero a sumar: "
	leer num
	suma=num
	mientras suma<=limite Hacer
		escribir "Aun no se llego al limite"
		escribir "La suma es: " suma
		escribir "Ingresar numero para sumar: "
		leer num
		suma=suma+num
		
	FinMientras
	escribir "La Suma: " suma ", supero el limite: " limite
FinAlgoritmo
