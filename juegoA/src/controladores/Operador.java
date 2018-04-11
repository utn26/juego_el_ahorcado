package controladores;
	import javax.swing.*;

import vistas.VistaPrincipal;
import vistas.VistaResultado;

import java.awt.*;
import java.util.ArrayList;
public class Operador
{
	private boolean seAgregoLetras = false;
	private int numeroImagen=0;
	private boolean gano;
	
	public ArrayList<String> cargarPalabra(String p)
	{
		ArrayList<String> palabra = new ArrayList<String>();
		for(int i=0 ; i<p.length();i++ )
		{
			palabra.add(Character.toString(p.charAt(i)));
		}
		return palabra;
	}
	//------------------------------------------------------------------------------------
	//devuelve un nuemero aleatoria entre uno y n:
	//------------------------------------------------------------------------------------
	public int numeroAleatorio(int n)
	{
		int numeroAleatorio = (int) (Math.random() * (n-1)) + 1;
		return numeroAleatorio;
	}
	//------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------
	public void mostrarPalabra(VistaPrincipal vP, ArrayList<String> palabra)
	{
		String p="";
		for(String e: palabra)
		{
			p=p+e;
		}
		vP.panelJuego.palabraAEncontrar.setText(p);
	}
	//------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------	
	public void despejarLetra(int pos, ArrayList<String> palabra)
	{
		String p = palabra.get(pos);
		for(int i=0;i< palabra.size();i++)
		{
			if(i!=pos && !(p.equals(palabra.get(i))) )
			{
				palabra.set(i,"_ ");
			}
			
		}
		
	}
	//------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------	
	public ArrayList<String> agregarLetra(String letra, String palabraAleatoria,ArrayList<String> palabra )
	{
		seAgregoLetras = false;
		for(int i = 0 ; i< palabraAleatoria.length();i++ )
		{
			if(Character.toString(palabraAleatoria.charAt(i)).equals(letra)&& !(palabra.get(i).equals(letra)))
			{
				palabra.set(i,letra);
				seAgregoLetras = true;
				
				
			}
			
		}
		return palabra;
	}
	//--------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------	
	public void gestionarIngreso(String letra,String palabraAleatoria,ArrayList<String> palabra,VistaPrincipal vP)
	{
		
		if(letra.length()<2)
		{
			this.agregarLetra(letra,palabraAleatoria,palabra);
			if(!seAgregoLetras)
				{
					numeroImagen++;
				}
			if(!terminoElJuego(palabraAleatoria,palabra))
			{
				mostrarDibujo(vP);
				mostrarPalabra(vP,palabra);
				
			}else
			{
				VistaResultado v = new VistaResultado(gano);
				ControladorVistaVictoria c = new ControladorVistaVictoria(v);
				v.setVisible(true);
				vP.setVisible(false);
			}
			
		}else
		{
			if(letra.equals(palabraAleatoria))
			{
				gano=true;
			}
			else
			{
				gano=false;
			}
			VistaResultado v = new VistaResultado(gano);
			ControladorVistaVictoria c = new ControladorVistaVictoria(v);
			v.setVisible(true);
			vP.setVisible(false);
		}
		
	}
//	-----------------------------------------------------------------------------------------------------------
//	-----------------------------------------------------------------------------------------------------------
	public void mostrarDibujo(VistaPrincipal vP)
	{
		
			
			vP.panelJuego.imagen.setIcon(vP.panelJuego.imagenes[numeroImagen]);
			vP.panelJuego.imagen.updateUI();
		
	}
	//---------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------
	public boolean terminoElJuego(String palabraAleatoria, ArrayList<String> palabra)
	{
		boolean termino = false;
		if(sonIguales(palabraAleatoria,palabra)){
			termino = true;
			gano=true;
		}else
			if(numeroImagen>5)
			{
				termino = true;
				gano = false;
			}
		
		return termino;
	}
	//---------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------
	public boolean sonIguales(String palabraAleatoria, ArrayList<String> palabra)
	{
		boolean iguales = true;
		for(int i=0;i<palabraAleatoria.length();i++ )
		{
			if(!(Character.toString(palabraAleatoria.charAt(i)).equals(palabra.get(i))))
			{
				iguales = false;
			}
		}
		return iguales;
	}
	
	//---------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------
		
	public boolean isSeAgregoLetras()
	{
		return seAgregoLetras;
	}
	public void setSeAgregoLetras(boolean seAgregoLetras)
	{
		this.seAgregoLetras=seAgregoLetras;
	}
	public int getNumeroImagen()
	{
		return numeroImagen;
	}
	public void setNumeroImagen(int numeroImagen)
	{
		this.numeroImagen=numeroImagen;
	}
}
