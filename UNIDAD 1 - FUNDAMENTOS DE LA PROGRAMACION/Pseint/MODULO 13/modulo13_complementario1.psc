///Una distribuidora de Nescafé cuenta con 4 representantes que 
///recorren toda Argentina para ofrecer sus productos.
///Para la gestión administrativa, el país está dividido 
///en cinco zonas: Norte, Sur, Este, Oeste y Centro. 
///Mensualmente, la empresa registra los datos de ventas 
///de los representantes en cada zona y recopila diversas 
///estadísticas sobre su desempeño.

///Se requiere un programa que lea el monto de las ventas 
///de los representantes en cada zona y realice los siguientes cálculos:
	
///Total de ventas de una zona especificada por el usuario.
	
///Total de ventas de un representante seleccionado por 
///el usuario en cada una de las zonas.
	
///Total de ventas de todos los representantes.

Algoritmo complementario1
	Definir i, j, f, c Como Entero
	Definir matriz Como Real
	Definir personas,zonas Como cadena
	f=4
	c=5
	Dimension matriz[f,c],personas[f],zonas[c]
	//DEFINIR PERSONAS
	personas[0]="Persona 1"
	personas[1]="Persona 2"
	personas[2]="Persona 3"
	personas[3]="Persona 4"
	
	//DEFINIR ZONAS
	zonas[0]="Norte"
	zonas[1]="Sur"
	zonas[2]="Este"
	zonas[3]="Oeste"
	zonas[4]="Centro"
	
	
	Para i=0 Hasta f-1 Hacer
		Para j=0 Hasta  c-1 Hacer
			Si j=c-1 Entonces
				matriz[i,j]=matriz[i,0]+matriz[i,1]
			sino
				Escribir "Ingresar el elemento [", i,",",j,"]: "
				Leer matriz[i,j]
			FinSi
		FinPara
	FinPara
	
FinAlgoritmo
