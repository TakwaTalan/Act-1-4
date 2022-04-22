
public class Pont {
	private Integer idPont = 4;
	private String longueur;
	private String largeur;
	Voile voile;
	
	public Pont() {
		this.longueur = "TestPont1";
		this.largeur = "TestPont2";
	}
	
	public Pont(String longueur, String largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	
	public Integer getIdPont() {
		return idPont;
	}
	public void setIdPont(Integer idPont) {
		this.idPont = idPont;
	}
	public String getlongueur() {
		return longueur;
	}
	public void setlongueur(String longueur) {
		this.longueur = longueur;
	}
	public String getlargeur() {
		return largeur;
	}
	public void setlargeur(String largeur) {
		this.largeur = largeur;
	}
	public Voile getVoile() {
		return voile;
	}
	public void setVoile(Voile voile) {
		this.voile = voile;
	}
	
}
