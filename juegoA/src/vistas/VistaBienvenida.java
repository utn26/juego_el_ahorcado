package vistas;

import javax.swing.*;
import java.awt.*;

public class VistaBienvenida extends JFrame
{
	public Bienvenida bienvenido;
	
	public VistaBienvenida()
	{
		
		bienvenido = new Bienvenida();
		add(bienvenido);
		setVisible(true);
		setSize(400,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// TODO Auto-generated constructor stub
	}
}
