package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	
	public Ronin(String nom, String boissonFav, int argentPossede) {
		super(nom, boissonFav, argentPossede);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentADonner = argentPossede/10;
		parler(beneficiaire +" prend ces "+argentADonner+" sous.");
		beneficiaire.recevoir(argentADonner);
		
	}
}
