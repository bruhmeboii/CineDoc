package CinePK;

public class cine {
	private int aforo;
	private int butacasOcupadas;
	private String tituloPelicula;
	private int precioEntrada;
	private int ningunparametro;
	/**
	 * 
	 * @param aforo
	 * @param butacasOcupadas
	 * @param tituloPelicula
	 * @param precioEntrada
	 */
	

	public cine(int aforo, int butacasOcupadas, String tituloPelicula, int precioEntrada) {
		super();
		this.aforo = aforo;
		this.butacasOcupadas = butacasOcupadas;
		this.tituloPelicula = tituloPelicula;
		this.precioEntrada = precioEntrada;
		this.setNingunparametro(0);
	}

	public cine() {
		super();
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public int getButacasOcupadas() {
		return butacasOcupadas;
	}

	public void setButacasOcupadas(int butacasOcupadas) {
		this.butacasOcupadas = butacasOcupadas;
	}

	public String getTituloPelicula() {
		return tituloPelicula;
	}

	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}

	public int getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public int getNingunparametro() {
		return ningunparametro;
	}

	public void setNingunparametro(int ningunparametro) {
		this.ningunparametro = ningunparametro;
	}
	public int butacasLibres(int aforo, int butacasOcupadas) {
		int butacasLibres=aforo-butacasOcupadas;
		return butacasLibres ;
	}
	public int porcentajeOcupacion(int aforo, int butacasOcupadas) {
		int porcentaje=(butacasOcupadas/aforo)*100;
		return porcentaje;
	}
}
