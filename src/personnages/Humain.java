package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argentPossede;
	
	public Humain(String nom, String boissonFav, int argentPossede) {
		this.nom = nom;
		this.argentPossede = argentPossede;
		this.boissonFav = boissonFav;
	}
	
	public void gagnerArgent(int gain) {
		argentPossede += gain;
	}
	
	public void perdreArgent(int perte) {
		if(argentPossede - perte <= 0) {
			argentPossede = 0;		
		}
		
		else {
			argentPossede -= perte;
		}	
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boissonFav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonFav+"! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(prix > argentPossede) {
			parler("J'ai "+argentPossede+" sous en poche. Je vais pouvoir m'offrir une "+bien+" à "+prix+" sous");
			perdreArgent(prix);
		}
		
		else {
			parler("Je n'ai plus que "+argentPossede+" sous en poche. Je ne peux même pas m'offrir un "+bien+" à "+prix+" sous.");
		}
	}
	
	public void parler(String texte) {
		System.out.println( "("+nom+") - " + texte);
	}
}
