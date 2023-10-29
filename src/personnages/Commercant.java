package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFav, int argentPossede) {
		super(nom, boissonFav,argentPossede);
	}
	
	public int seFaireExtorquer(){
		int argent = argentPossede;
		argentPossede = 0;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		parler(argent +" sous ! Je te remercie généreux donateur!");
	}
}
