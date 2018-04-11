package vistas;

import javax.swing.*;
import java.awt.*;
public class PanelResultado extends JPanel
{
	public JLabel textoGanador;
	public JLabel textoPerdedor;
	public Imagen imagen;

	public JButton reiniciarJuego;
	public JButton salir;
	
	public PanelResultado(boolean gano)
	{
		textoPerdedor = new JLabel("<html><body>perdiste!!!!!<br>clickea en reiniciar juego <br> para comenzar a jugar de nuevo.</body></html>");
		textoGanador = new JLabel("<html><body>Ganaste!!!!!<br>clickea en reiniciar juego <br> para comenzar a jugar de nuevo.</body></html>");
		imagen = new Imagen();
		imagen.setRutaImagen("imagenes/imagen6.jpg");
		textoGanador.setForeground(Color.white);
		textoPerdedor.setForeground(Color.white);
		Font titulo = textoGanador.getFont();
		textoGanador.setFont(new Font(titulo.getFontName(),titulo.getStyle(),18));
		Font titulo1 = textoPerdedor.getFont();  
		textoPerdedor.setFont(new Font(titulo1.getFontName(),titulo.getStyle(),18));

		reiniciarJuego = new JButton("reiniciar Juego");
		salir = new JButton("Salir");
		setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		

		if(gano)
		{
			constraints.gridx=0;
			constraints.gridy=0;
			constraints.gridwidth = 2;
			constraints.gridheight = 1;
			constraints.weighty = 1.0;
			this.add(textoGanador,constraints);
			constraints.weighty = 0;
	
			
			constraints.gridx=0;
			constraints.gridy=3;
			constraints.gridwidth = 1;
			constraints.gridheight = 1;
			constraints.weighty = 1.0;
			this.add(reiniciarJuego,constraints);
			constraints.weighty = 0;
			
			constraints.gridx=1;
			constraints.gridy=3;
			constraints.gridwidth = 1;
			constraints.gridheight = 1;
			constraints.weighty = 1.0;
			this.add(salir,constraints);
		
		
		}else
		{
			constraints.gridx=0;
			constraints.gridy=0;
			constraints.gridwidth = 2;
			constraints.gridheight = 1;
			constraints.weighty = 1.0;
			this.add(textoPerdedor,constraints);
			constraints.weighty = 0;
	
			constraints.gridx=0;
			constraints.gridy=1;
			constraints.gridwidth = 2;
			constraints.gridheight = 1;
			constraints.weighty = 1.0;
			
			constraints.fill = GridBagConstraints.BOTH;
			this.add(imagen,constraints);
			constraints.weighty = 0;
			
			
			constraints.gridx=0;
			constraints.gridy=3;
			constraints.gridwidth = 1;
			constraints.gridheight = 1;
			constraints.weighty = 1.0;
			constraints.fill = GridBagConstraints.CENTER;
			this.add(reiniciarJuego,constraints);
			constraints.weighty = 0;
			
		
			constraints.gridx=1;
			constraints.gridy=3;
			constraints.gridwidth = 1;
			constraints.gridheight = 1;
			constraints.weighty = 1.0;
			constraints.fill = GridBagConstraints.CENTER;
			this.add(salir,constraints);
		}
		
	}
	@Override
	public void paintComponent(Graphics g)
	{
		Dimension dim = getSize();
		
		ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/fondoAzul.jpg")).getImage() );
		g.drawImage(imagen.getImage(),0,0,dim.width,dim.height,null);
	}
}
