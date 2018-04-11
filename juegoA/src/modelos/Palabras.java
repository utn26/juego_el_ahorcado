package modelos;

import java.util.ArrayList;

public class Palabras
{
	private ArrayList<String> palabras;
	
	public Palabras()
	{
		palabras = new ArrayList<String>();
		palabras.add("agua");
		palabras.add("barco");
		palabras.add("ciudad");
		palabras.add("dinosaurio");
		palabras.add("elefante");
		palabras.add("hercules");
		palabras.add("zanahoria");
		palabras.add("alfiler");
		palabras.add("almohada");
		palabras.add("carpintero");
		palabras.add("herrero");
		palabras.add("psicologia");
		palabras.add("estructura");
		palabras.add("extraterrestre");
		palabras.add("extraordinario");
		palabras.add("flamenco");
		palabras.add("cocinero");
		palabras.add("gallina");
		palabras.add("catarata");
		palabras.add("mansion");
		palabras.add("ciclope");
	}

	public ArrayList<String> getPalabras()
	{
		return palabras;
	}

	public void setPalabras(ArrayList<String> palabras)
	{
		this.palabras=palabras;
	}
}