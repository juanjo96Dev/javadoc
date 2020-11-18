package libreria;

	/** Interfaz que incorpora la capacidad de ser descargado de la red.
	*/
public interface Downloadable{


	//Métodos
	/** Descarga el elemento por la red.
	 *  @param anchoBanda ancho de banda del sistema (en Kb/seg)
	*/
	public abstract double descargar(double anchoBanda) throws IllegalArgumentException;


}