package vistas;

import javax.swing.*;
import java.awt.*;

public class VistaResultado extends JFrame
{
	public PanelResultado panelVictoria;
	public VistaResultado(boolean gano)
	{
		
		panelVictoria = new PanelResultado(gano);
		add(panelVictoria);
		
		setVisible(true);
		setSize(400,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
}
