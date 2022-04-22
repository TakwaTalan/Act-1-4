
public class Cabine {
	private Integer idCabine = 3;
	private String surface;
	private String couleur;
	
	public Cabine() {
	this.surface = "surface";
	this.couleur = "couleur";
	}
	
	public Cabine(String ca1, String ca2) {
	this.surface = surface;
	this.couleur = couleur;
	}

	public Integer getIdCabine() {
		return idCabine;
	}

	public void setIdCabine(Integer idCabine) {
		this.idCabine = idCabine;
	}

	public String getsurface() {
		return surface;
	}

	public void setsurface(String surface) {
		this.surface = surface;
	}

	public String couleur() {
		return couleur;
	}

	public void setcouleur(String couleur) {
		this.couleur = couleur;
	}
}
