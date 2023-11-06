package personnages;
import personnages.Commercant;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 4;
	
	
	public Yakuza(String nom, String boissonFav, int argentPossede, String clan) {
		super(nom, boissonFav, argentPossede);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler( victime +" , si tu tiens à la vie donne moi ta bourse !");
		int argentVole;
		argentVole = victime.seFaireExtorquer();
		argentPossede += argentVole;
		reputation += 1;
		parler("J’ai piqué les "+argentVole+" sous de "+victime+", ce qui me fait "+argentPossede+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argent = argentPossede;
		argentPossede = 0;
		reputation--;
		parler("J’ai perdu mon duel et mes "+argent+" sous, snif... J'ai déshonoré le clan de Warsong.");
		return argent;
	}
	
	public void gagner(int gain) {
		argentPossede += argentPossede + gain;
		reputation++;
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de Warsong ?\n Je l'ai dépouillé de ses "+gain+" sous.");
	}
	
	public int getReputation() {
		int rep = reputation;
		return rep;
	}
}
