Algoritmo ejercicio2
	definir num1,num2 Como Entero
	definir operacion Como Caracter
	escribir "Ingresar los 2 numeros: "
	Leer num1,num2
	Escribir "Ingresar Operacion Matematica: S (suma), R (restar), M (multiplicar) o D (dividir): "
	Leer operacion
	segun operacion hacer
		"S":
			Escribir "La SUMA es: ", num1+num2
		"R":
			Escribir "La RESTA es: ", num1-num2
		"M":
			Escribir "La MULTIPLICACION es: ", num1*num2
		"D":
			Escribir "La DIVISION es: ", num1/num2
		De Otro Modo:
			Escribir "Los datos ingresado no corresponden"
			
	FinSegun
FinAlgoritmo
