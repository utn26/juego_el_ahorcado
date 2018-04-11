package controladores;
	import java.awt.*;
	import javax.swing.*;

import modelos.Palabras;
import vistas.VistaPrincipal;
import vistas.VistaResultado;

import java.awt.event.*;
public class ControladorVistaVictoria implements ActionListener
{
	VistaResultado v;
	public ControladorVistaVictoria(VistaResultado vista)
	{
		v=vista;
		
		v.panelVictoria.reiniciarJuego.addActionListener(this);
		v.panelVictoria.salir.addActionListener(new EscucharSalir());
	}

	public void actionPerformed(ActionEvent arg0)
	{
		VistaPrincipal vis = new VistaPrincipal();
		Palabras p = new Palabras();
		ControladorJuego c = new ControladorJuego(vis,p);
	
		vis.setVisible(true);
		v.setVisible(false);
		
	}
	public class EscucharSalir implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
			
		}
		
	}
}
