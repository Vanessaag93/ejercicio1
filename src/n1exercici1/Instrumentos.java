package n1exercici1;

public abstract class Instrumentos {
	
		String nombre;
		int precio;
		
		protected Instrumentos() {
			
		}
		
		public Instrumentos(String nombre, int precio) {
			this.nombre = nombre;
			this.precio = precio;
		}


		public abstract void tocar();
		
		
		
	
}



	
	
