package vistas;

import javax.swing.*;
import java.awt.*;

public class Bienvenida extends JPanel
{
	
	public JLabel texto1;
	public JLabel texto2;
	public JLabel texto3;
//	public JPanel botones;
	public JButton iniciarJuego;
	public JButton salir;
	
	public Bienvenida()
	{
		texto1 = new JLabel("<html><body>Bienvenido a ahorcado!!!!!<br>clickea en iniciar juego <br> para comenzar a jugar.</body></html>");
		texto1.setForeground(Color.white);
		Font titulo = texto1.getFont();
		texto1.setFont(new Font(titulo.getFontName(),titulo.getStyle(),20));
//		texto2 = new JLabel("clickea en iniciar juego");
//		texto3 = new JLabel("para comenzar a jugar.");
//		botones = new JPanel();
		iniciarJuego = new JButton("Iniciar Juego");
		salir = new JButton("Salir");
		setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
//		botones.add(iniciarJuego);
//		botones.add(salir);
		
//		add(texto1);
//		add(texto2);
//		add(texto3);
//		add(botones);
		
		constraints.gridx=0;
		constraints.gridy=0;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		this.add(texto1,constraints);
		
//		constraints.gridx=0;
//		constraints.gridy=1;
//		constraints.gridwidth = 1;
//		constraints.gridheight = 1;
////		constraints.weighty = 1.0;
//		this.add(texto2,constraints);
//		
//		constraints.gridx=0;
//		constraints.gridy=2;
//		constraints.gridwidth = 1;
//		constraints.gridheight = 1;
////		constraints.weighty = 1.0;
//		this.add(texto3,constraints);
		
		constraints.gridx=0;
		constraints.gridy=3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		this.add(iniciarJuego,constraints);
		constraints.weighty = 0;
		
		constraints.gridx=1;
		constraints.gridy=3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		this.add(salir,constraints);
		
	}
	@Override
	public void paintComponent(Graphics g)
	{
		Dimension dim = getSize();
		
		ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/fondoAzul.jpg")).getImage() );
		g.drawImage(imagen.getImage(),0,0,dim.width,dim.height,null);
	}
}
