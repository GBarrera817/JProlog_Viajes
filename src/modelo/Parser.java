package modelo;

public class Parser {

	public static String quitarEspacios(String cadena){
		cadena = cadena.trim();
		cadena = cadena.replace(" ","_");
		return cadena;
	}
	
	public static String agregarEspacios(String cadena){
		cadena = cadena.trim();
		cadena = cadena.replace("_"," ");
		return cadena;
	}
	
	public static String minusculas(String cadena){
		cadena = cadena.toLowerCase();
		return cadena;
	}
	
	public static String mayusculas(String cadena){
		
		char[] caracteres = cadena.toCharArray();
		caracteres[0] = Character.toUpperCase(caracteres[0]);
		
		for (int i=1; i<caracteres.length; i++) {
	       
		    if (caracteres[i] == ' ')
		        caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
	    }
		
		return new String(caracteres);
	}
	
	public static String reemplazaCaracteresEspeciales(String input){
		
	    // Cadena de caracteres original a sustituir.
	    String original = "��������������u�������������������";
	    // Cadena de caracteres ASCII que reemplazar�n los originales.
	    String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
	    String output = input;
	    
	    for (int i=0; i<original.length(); i++) {
	        // Reemplazamos los caracteres especiales.
	        output = output.replace(original.charAt(i), ascii.charAt(i));
	    }
	    
	    return output;
	}
}
