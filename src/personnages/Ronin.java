package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	private int force = honneur*2;
	
	public Ronin(String nom, String boissonFav, int argentPossede) {
		super(nom, boissonFav, argentPossede);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentADonner = argentPossede/10;
		parler(beneficiaire +" prend ces "+argentADonner+" sous.");
		beneficiaire.recevoir(argentADonner);
	}
	
	public void provoquer(Yakuza adversaire) {
		if(force >= adversaire.getReputation()){
			parler(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t’ai eu petit yakusa!");
			int argentGagne = adversaire.perdre();
			argentPossede += argentGagne;
			honneur++;	
		}
		
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honneur--;
			int argentPerdu = argentPossede;
			argentPossede = 0;
			adversaire.gagner(argentPerdu);
		}
	}
}
