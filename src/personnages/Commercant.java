package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFav, int argentPossede) {
		super(nom, boissonFav,argentPossede);
	}
	
	public int seFaireExtorquer(){
		argentPossede = (argentPossede-20);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return 20;
	}
	
	public void recevoir(int argent) {
		parler(argent +" sous ! Je te remercie généreux donateur!");
	}
}
