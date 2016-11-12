package modelo;

import java.util.Map;
import org.jpl7.*;

public class Prolog {
	
	private String ver = "SWI-PROLOG 7.2.3";
	private String mapa;
	private Query viajes;
	private Query distancias;
	
	public Prolog(){}
	
	
	public String cargarBaseConocimientoDistancias(String nombreArchivo){
		
        String consult = "consult('"+nombreArchivo+"')";
		distancias = new Query(consult);

		return consult+ " " + (distancias.hasSolution() ? " => Conexión correcta con "+ nombreArchivo : " => Fallado");
	}
	
	public String cargarBaseConocimientoViajes(String nombreArchivo){
		
        String consult = "consult('"+nombreArchivo+"')";
		viajes = new Query(consult);
		
		return consult+ " " + (viajes.hasSolution() ? " => Conexión correcta con "+ nombreArchivo : " => Fallado");
	}
	
	public String borrarBaseConocimientosDistancias(){
		
		distancias = null;
		return ("Base de cocimientos distancias desconectada");
	}
	
	public String borrarBaseConocimientosviajes(){
		
		viajes = null;
		return ("Base de cocimientos viajes desconectada");
	}
	
	public String consulta(String query){
		System.out.println("\nEstan conectadas las cuidades?\n");

		Variable X = new Variable("X");

		Query q1 = new Query( new Compound("distancia", new Term[]{ new Atom("tokyo"), new Atom("sydney"), X } ));

		Map<String, Term> solucion1;

		while(q1.hasMoreSolutions()){
			solucion1 = q1.nextSolution();
			System.out.println(" X = "+ solucion1.get("X"));
		}
		return "respuesta";
	}
	
	/*Convierte una cadena de texto a constante Prolog*/
	public String txtToProlog(String cadena){
		
		cadena = Parser.quitarEspacios(cadena);
		cadena = Parser.reemplazaCaracteresEspeciales(cadena);
		cadena = Parser.minusculas(cadena);
		
		return cadena;
	}
	
	/*Convierte una constante Prolog a cadena de texto*/
	public String prologToTxt(String cadena){
		
		cadena = Parser.agregarEspacios(cadena);
		cadena = Parser.mayusculas(cadena);
		
		return cadena;
	}
	
	public String toString(){
		return ver;
	}
	
	public String getMapa() {
		return mapa;
	}

	public void setMapa(String mapa) {
		this.mapa = mapa;
	}
}
