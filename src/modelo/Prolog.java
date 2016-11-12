package modelo;

public class Prolog {
	
	private String ver = "SWI-PROLOG 7.2.3";
	
	public Prolog(){}
	
	
	public void cargarBaseConocimientos(String rutaArchivo){
		
		
	}
	
	public void borrarBaseConocimientos(String rutaArchivo){
		
		
	}
	
	public String consulta(String query){
		
		return "respuesta";
	}
	
	/*Convierte una cadena de texto a constante Prolog*/
	public String txtToProlog(String cadena){
		
		cadena = quitarEspacios(cadena);
		cadena = reemplazaCaracteresEspeciales(cadena);
		cadena = minusculas(cadena);
		
		return cadena;
	}
	
	/*Convierte una constante Prolog a cadena de texto*/
	public String prologToTxt(String cadena){
		
		cadena = agregarEspacios(cadena);
		cadena = mayusculas(cadena);
		
		return cadena;
	}
	
	public String toString(){
		return ver;
	}
	
	public String quitarEspacios(String cadena){
		cadena = cadena.trim();
		cadena = cadena.replace(" ","_");
		return cadena;
	}
	
	public String agregarEspacios(String cadena){
		cadena = cadena.trim();
		cadena = cadena.replace("_"," ");
		return cadena;
	}
	
	public String minusculas(String cadena){
		cadena = cadena.toLowerCase();
		return cadena;
	}
	
	public String mayusculas(String cadena){
		
		char[] caracteres = cadena.toCharArray();
		caracteres[0] = Character.toUpperCase(caracteres[0]);
		
		for (int i=1; i<caracteres.length; i++) {
	       
		    if (caracteres[i] == ' ')
		        caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
	    }
		
		return new String(caracteres);
	}
	
	public String reemplazaCaracteresEspeciales(String input){
		
	    // Cadena de caracteres original a sustituir.
	    String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
	    // Cadena de caracteres ASCII que reemplazarán los originales.
	    String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
	    String output = input;
	    
	    for (int i=0; i<original.length(); i++) {
	        // Reemplazamos los caracteres especiales.
	        output = output.replace(original.charAt(i), ascii.charAt(i));
	    }
	    
	    return output;
	}
}
