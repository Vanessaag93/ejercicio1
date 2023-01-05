package n1exercici1;

public class Percusión extends Instrumentos {
	
	public Percusión() {

	}
	
	public Percusión(String nombre, int precio) {
		super(nombre, precio);
		
	
	}
	
	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de percusión");
		
	}
}
