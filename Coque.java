

public class Coque {
	private Integer idCoque = 2;
	private String longueur;
	private String matiere;
	
	public Coque() {
		this.longueur = "longueur";
		this.matiere = "matiere";
	}
	
	public Coque(String longueur, String matiere) {
		this.longueur = longueur;
		this.matiere = matiere;
	}

	public Integer getIdCoque() {
		return idCoque;
	}

	public void setIdCoque(Integer idCoque) {
		this.idCoque = idCoque;
	}

	public String getlongueur() {
		return longueur;
	}

	public void setlongueur(String longueur) {
		this.longueur = longueur;
	}

	public String getmatiere() {
		return matiere;
	}

	public void setmatiere(String matiere) {
		this.matiere = matiere;
	}
}
