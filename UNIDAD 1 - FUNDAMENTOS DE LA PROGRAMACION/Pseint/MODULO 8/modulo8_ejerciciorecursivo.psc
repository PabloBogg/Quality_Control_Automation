Algoritmo ejercicio
	definir num Como Entero
	escribir "Ingresar Numero: "
	Leer num
	
	Escribir "La suma hasta ",num, " es: ",sumaRecursiva(num)
	
FinAlgoritmo

funcion resultado=sumaRecursiva(num)
	definir resultado, i Como Entero
	
	si num=1 Entonces
		resultado=num
	SiNo
		resultado=num+sumaRecursiva(num-1)
	FinSi
FinFuncion
