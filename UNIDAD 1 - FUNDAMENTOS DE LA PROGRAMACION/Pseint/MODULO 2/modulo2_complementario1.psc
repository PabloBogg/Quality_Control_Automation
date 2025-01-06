Algoritmo complementario1
	definir primerNumero, ultimoNumero, num Como Real
	Escribir "Ingresar numero: "
	Leer num
	
	primerNumero=(num-(num%100))/100
	ultimoNumero=num%10
	escribir primerNumero
	escribir ultimoNumero
	
	si primerNumero=ultimoNumero Entonces
		escribir "El numero es capicua"
	sino 
		escribir "El numero NO es capicua"
	FinSi
	
FinAlgoritmo
