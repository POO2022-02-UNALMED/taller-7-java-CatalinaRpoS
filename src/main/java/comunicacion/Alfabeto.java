package comunicacion;

public class Alfabeto extends Pictograma{

    private String[] letras;
    private String interpretacion;
    
    public Alfabeto(String origen, String[] letras, String interpretacion) {
    	super(origen);
    	this.letras = letras;
    	this.interpretacion = interpretacion;
    }
    
	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
	
		int tam = this.letras.length;
		String descripcion = "";
		
		for (int i = 0; i < tam - 1; i++) {
			descripcion += letras[i] + ", ";
		}
		
		descripcion += letras[tam];
		return descripcion;
	}
    
    

}
