package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, resul;
		
		x=Integer.parseInt(JOptionPane.showInputDialog("Escribe el 1� Numero"));
		y=Integer.parseInt(JOptionPane.showInputDialog("Escribe el 2� Numero"));
		
		resul=x%y;
		
		if (resul==0) {
			System.out.println("Es multiplo");
		}
		else {System.out.println("No es multiplo");}
	}

}
