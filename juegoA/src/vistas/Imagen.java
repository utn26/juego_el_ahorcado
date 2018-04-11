package vistas;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Imagen extends JPanel
{

	public String rutaImagen = "imagenes/ahorcado0.jpg";

    public String getRutaImagen()
	{
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen)
	{
		this.rutaImagen=rutaImagen;
	}

	public Imagen() {
    	
        
        this.setSize(600, 600);
    }

    @Override
    public void paint(Graphics g) 
    {
        ImageIcon Img = new ImageIcon(getClass().getResource(rutaImagen));
        g.drawImage(Img.getImage(), 0, 0, 200, 200, null);
        
    }    
	
}
