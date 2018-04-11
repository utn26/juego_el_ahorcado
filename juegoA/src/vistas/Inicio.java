package vistas;

import controladores.ControladorBienvenida;
import controladores.ControladorJuego;
import modelos.Palabras;

public class Inicio
{

	public static void main(String[] args)
	{
		VistaBienvenida v = new VistaBienvenida();
		ControladorBienvenida c = new ControladorBienvenida(v);
		

	}

}
