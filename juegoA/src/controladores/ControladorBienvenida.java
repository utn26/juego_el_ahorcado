package controladores;

import javax.swing.*;

import modelos.Palabras;
import vistas.VistaBienvenida;
import vistas.VistaPrincipal;

import java.awt.*;

import java.awt.event.*;

public class ControladorBienvenida implements ActionListener
{
	private VistaBienvenida vista;
	public ControladorBienvenida(VistaBienvenida v)
	{
		 vista = v;
		 vista.bienvenido.iniciarJuego.addActionListener(this);
		 vista.bienvenido.salir.addActionListener(new EscuchaSalir());;
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent e)
	{
		
			VistaPrincipal v = new VistaPrincipal();
			Palabras p = new Palabras();
			ControladorJuego c = new ControladorJuego(v,p);
		
			v.setVisible(true);
			vista.setVisible(false);
		
			
		
			// TODO Auto-generated method stub
		
	}
	public class EscuchaSalir implements ActionListener
	{
		public EscuchaSalir()
		{
			
		}

		public void actionPerformed(ActionEvent arg0)
		{
			System.exit(0);
			// TODO Auto-generated method stub
			
		}
	}
	
}
