package Examen2;

public enum PelucheEnum {
	PEQUE�O(2),MEDIANO(5),GRANDE(7);
	
	private int precio;
	
	PelucheEnum(int precio){
		this.precio=precio;
	}

	public int getPrecio(){
		return precio;
	}
	
}
