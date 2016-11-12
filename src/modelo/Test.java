package modelo;

/**
 * Creado por Gabriela Barrera el 09-11-2016.
 * Proyecto: JProlog_Viajes
 */


public class Test {

    public static void main(String[] args) {

		/*
        String consult = "consult('distancia.pl')";
		Query conexion = new Query(consult);
		System.out.println(consult+ " " + (conexion.hasSolution() ? " => Correcto" : " => Fallado"));

		System.out.println("\nEstan conectadas las cuidades?\n");

		Variable X = new Variable("X");

		Query q1 = new Query( new Compound("distancia", new Term[]{ new Atom("tokyo"), new Atom("sydney"), X } ));

		Map<String, Term> solucion1, solucion2;

		while(q1.hasMoreSolutions()){
			solucion1 = q1.nextSolution();
			System.out.println(" X = "+ solucion1.get("X"));
		}


		Query q2 = new Query( new Compound("conectadas", new Term[] { new Atom("london"), new Atom("sydney"), new Variable("X")}));

		while(q2.hasMoreSolutions()){
			solucion2 = q2.nextSolution();
			System.out.println(" X = "+ solucion2.get("X"));
		}
		*/
    }
}
