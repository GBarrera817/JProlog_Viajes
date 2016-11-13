# [Proyecto planificación de viajes]

Creando mini Sistema Experto para la planificación de viajes con Prolog implementado en Java.

## Contexto

Se crea un sistema que permite realizar planes de viajes y posteriormente hacer las consultas.
La representacion de los destinos de viajes estan situados en la La Serena,Coquimbo, Chile.
En el proyecto existe una imagen de referencia para los posibles destinos a visitar

## El planificador de viajes tiene 3 módulos

	- Planifidor de viajes: Este módulo se pueden hacer consulta sobre los posibles lugares a visitar, entre las 
							variables se encuentran el destino, tipo de alojamiento y numero de dias. Ademas se 
							puede obtener información sobre el costo de los pasajes a determinada localidad.
							
	- Distancia Vecinos: Este módulo comprueba si las localidades son vecinas (que estan conectadas directamente
						 o a lo más por un vecino).
						 y entrega la distancia entre estas.
	- Experto: En este modulo se pueden agregar, editar y eliminar reglas para este sistema. 

## Dependencias

	- Conexión con Prolog-Java (SWI-Prolog): jpl.jar
	- Calendario (toedter): jcalendar-1.4.jar
	- Tema para la GUI (synthetica):  
		- synthetica.jar 
		- syntheticaAluOxide.jar 

## Preparando el ambiente de desarrollo Prolog-Java

### Se deben agregar las siguientes variables del sistema al Path de Windows:

	# Variables de Prolog

	- C:\Program Files\swipl\bin
	- C:\Program Files\swipl\lib\jpl.jar

	# Variables de Java

	- C:\Program Files\Java\jdk1.X.X_XX\bin
	- C:\Program Files\Java\jdk1.X.X_XX\lib\tools.jar
	- C:\Program Files\Java\jdk1.X.X_XX\jre\lib\rt.jar


### Se debe agregar además la siguiente variable tanto para Variables del Sistema como para Variables de usuario

	 Nombre de la variable: SWI_HOME_DIR
	 Valor de la variable:  C:\Program Files\swipl
	 
## Funcionamiento del sistema

	Para ejecutar el sistema se deben cargar los hechos y las reglas hechas en prolog, especificamente los
	archivos "distancia_ls.pl" y "planificador_de_viajes_ls.pl" ademas de cargar el listado de localidades 
	a visitar en "localidades.map".