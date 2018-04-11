package vistas;

import javax.swing.*;
import java.awt.*;

public class VistaPrincipal extends JFrame
{
	private JPanel panelSur;
	private JPanel panelNorte;
	public JButton reiniciar;
	public JLabel tituloJuego;
	public JPanel cardPanel;
	public CardLayout card;
	public PanelJuego panelJuego;
	
	public VistaPrincipal()
	{
		this.setLayout(new BorderLayout());
		card = new CardLayout();
		cardPanel = new JPanel();
		cardPanel.setLayout(card);
		panelSur = new JPanel();
		panelNorte = new JPanel();
		reiniciar = new JButton("Reiniciar");
		tituloJuego = new JLabel("El Ahorcado");
		panelJuego = new PanelJuego();
		
		panelNorte.add(tituloJuego);
		panelSur.add(reiniciar);
		
		
		cardPanel.add(panelJuego,"0");
		
		
		
		this.getContentPane().add(panelNorte,BorderLayout.NORTH);
		this.getContentPane().add(cardPanel,BorderLayout.CENTER);
		this.getContentPane().add(panelSur,BorderLayout.SOUTH);
		
		this.getContentPane().setBackground(new Color(255,255,255));
		setVisible(true);
		setSize(400,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}
