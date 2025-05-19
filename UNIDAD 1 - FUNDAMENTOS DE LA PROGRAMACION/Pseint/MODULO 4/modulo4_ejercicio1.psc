Algoritmo ejercicio1
	
	Definir vocalSecreta,vocalUsuario Como Caracter
	vocalSecreta="E"
	vocalUsuario=""
	Mientras vocalSecreta<>vocalUsuario Hacer
		Escribir "Escribe una vocal y adivina la vocal secreta: "
		Leer vocalUsuario
		si vocalSecreta=vocalUsuario Entonces
			escribir "Felicitaciones, adivinaste!"
		SiNo
			escribir "No adivinaste, vuelve a intentarlo."
		FinSi
	FinMientras
FinAlgoritmo
