package vistas;

import javax.swing.*;
import java.awt.*;

public class PanelIngresarPalabra extends JPanel
{
	public JTextField ingresarPalabra;
	public JButton ingresar;
	
	public PanelIngresarPalabra()
	{
		this.setBackground(new Color(31,79,118));
		ingresarPalabra = new JTextField(10);
		ingresar = new JButton("ingresar");
		
		this.add(ingresarPalabra);
		this.add(ingresar);
		
	}
}
