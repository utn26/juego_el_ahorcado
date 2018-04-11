package controladores;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import modelos.Palabras;

import vistas.VistaPrincipal;
import vistas.VistaResultado;

public class ControladorJuego implements ActionListener
{   
	private ArrayList<String> palabra = new ArrayList<String>();
	private VistaPrincipal vP;
	private Palabras ps;
	private String palabraAleatoria = "";
	private boolean seAgregoLetras = false;
//	private int numeroImagen=0;
	private Operador operador;
	
//	private String palabraDinamica="";
	//----------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------
	public ControladorJuego(VistaPrincipal vista, Palabras palabras)
	{
		
		
		vP = vista;
		ps = palabras;
		operador = new Operador();
		vP.reiniciar.addActionListener(this);
		this.iniciarPalabra();
		vP.panelJuego.panelIngresarPalabra.ingresar.addActionListener(new EscuchaIngresar());
		vP.panelJuego.panelIngresarPalabra.ingresarPalabra.addKeyListener(new EscuchaIngresar());
		
		
	}
	//------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------
	public void iniciarPalabra()
	{
		operador.setNumeroImagen(0);
//		palabra = new ArrayList();
//		vP.panelJuego.card.show(vP.panelJuego.cardImagen,"0");
		int n = operador.numeroAleatorio(ps.getPalabras().size());
		palabraAleatoria = ps.getPalabras().get(n);
		palabra = operador.cargarPalabra(palabraAleatoria);
		int nA = operador.numeroAleatorio(palabra.size());
		operador.despejarLetra(nA, palabra);
		operador.mostrarPalabra(vP,palabra);
		
	}

	//------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------
	

	
	public void actionPerformed(ActionEvent arg0)
	{
		
		iniciarPalabra();
		
	}
	//------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------
	class EscuchaIngresar implements ActionListener, KeyListener
	{

		public void actionPerformed(ActionEvent arg0)
		{
			String letra = vP.panelJuego.panelIngresarPalabra.ingresarPalabra.getText();
			
			operador.gestionarIngreso(letra, palabraAleatoria, palabra, vP);

			
		}

		public void keyPressed(KeyEvent e)
		{
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
			{
				String letra = vP.panelJuego.panelIngresarPalabra.ingresarPalabra.getText();
				
				operador.gestionarIngreso(letra, palabraAleatoria, palabra, vP);
			}
			
		}

		public void keyReleased(KeyEvent arg0)
		{
			// TODO Auto-generated method stub
			
		}

		public void keyTyped(KeyEvent arg0)
		{
			// TODO Auto-generated method stub
			
		}
		
	}

}
