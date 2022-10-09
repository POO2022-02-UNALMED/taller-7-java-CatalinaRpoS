package comunicacion;

public class Libro extends Escrito{
	
	private String coautor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String coautor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.coautor = coautor;
		this.editorial = editorial;
		this.setEdicion(edicion);
		this.interpretacion = interpretacion;
	}

	// Métodos get y set
	public String getCoautor() {
		return coautor;
	}

	public void setCoautor(String coautor) {
		this.coautor = coautor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	// Implementación del método abstracto palabrasTotales()
	@Override
	int palabrasTotales(int palabrasPagina) {
		return super.getPaginas() * palabrasPagina * 2;
	}

	// Implementación del método abstracto interpretación()
	@Override
	String interpretacion() {
		return this.interpretacion;
	}
	
	// Implementación del método abstracto toString()
	@Override
	public String toString() {
		String descripcion = super.getOrigen() + "\n" + 
				super.getTitulo() + "\n" + 
				super.getAutor() + "\n" + 
				Integer.toString(super.getPaginas()) + "\n" + 
				this.coautor + "\n" + 
				this.editorial + "\n" + 
				this.edicion;
		
		return descripcion;
	}

	

	
	
	
}
