Proyecto planificación de viajes

Creando mini Sistema Experto para la planificación de viajes con Prolog implementado en Java.

Contexto: Este es un proyecto en donde se usa un mapa de referencia de la ciudad de La Serena.

El planificador de viajes tiene 3 módulos: 

	- Distancia Vecinos: este módulo entrega la distancia de las localidades que se encuentren conectadas.

	- Planifidor de viajes: 
	- Experto:

Dependencias:

	- Conexión con Prolog-Java SWI-Prolog: jpl.jar
	- Calendario: jcalendar-1.4.jar
	- Tema para la GUI: synthetica 
		- synthetica.jar 
		- syntheticaAluOxide.jar 

Preparando el ambiente de desarrollo Prolog-Java:

1) Se deben agregar las siguientes variables del sistema al Path de Windows:

	# Varibles de Prolog

	C:\Program Files\swipl\bin
	C:\Program Files\swipl\lib\jpl.jar

	# Varibles de Java

	C:\Program Files\Java\jdk1.X.X_XX\bin
	C:\Program Files\Java\jdk1.X.X_XX\lib\tools.jar
	C:\Program Files\Java\jdk1.X.X_XX\jre\lib\rt.jar


2) Se debe agregar además la siguiente variable tanto para Variables del Sistema como para Variables de usuario

	 Nombre de la variable: SWI_HOME_DIR
	 Valor de la variable:  C:\Program Files\swipl