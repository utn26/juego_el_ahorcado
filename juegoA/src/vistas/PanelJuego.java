package vistas;

import javax.swing.*;
import java.awt.*;

public class PanelJuego extends JPanel
{
		
		public ImageIcon imagenes[];
		
		public JLabel imagen;
		public CardLayout card;
		public PanelIngresarPalabra panelIngresarPalabra;
		public JLabel palabraAEncontrar;
//		private JPanel panel;
		
	
	public PanelJuego()
	{
		imagenes = new ImageIcon[7];
		for(int i = 0; i<7 ; i++)
		{
			imagenes[i]= new ImageIcon(getClass().getResource("imagenes/imagen"+i+".jpg"));
		}
		imagen = new JLabel();
		imagen.setIcon(imagenes[0]);
		
		panelIngresarPalabra = new PanelIngresarPalabra();
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		card = new CardLayout();
		
		
		palabraAEncontrar = new JLabel("Palabra a encontrar");
		palabraAEncontrar.setForeground(Color.WHITE);
		
		this.setBackground(new Color(31,79,118));
		
		constraints.gridx=0;
		constraints.gridy=0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
//		constraints.weighty = 1.0;
//		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.CENTER;
		
		this.add(imagen,constraints);
		constraints.weighty = 0.0;
//		constraints.weightx = 0.0;
		
		Font titulo = palabraAEncontrar.getFont();
		palabraAEncontrar.setFont(new Font(titulo.getFontName(),titulo.getStyle(),30));
		
		constraints.gridx=0;
		constraints.gridy=1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(palabraAEncontrar,constraints);
		constraints.weighty = 0.0;
		
		constraints.gridx=0;
		constraints.gridy=2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		this.add(panelIngresarPalabra,constraints);
		
		
		
	}
	

}
