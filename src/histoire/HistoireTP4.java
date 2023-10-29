package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof = new Humain("Prof","kombucha",54);
//		prof.direBonjour();
//		prof.acheter("boisson",12);
//		prof.boire();
//		prof.acheter("jeu",2);
//		prof.acheter("kimono",50);
		
		Commercant commercant = new Commercant("Marco","thé",20);
//		commercant.direBonjour();
//		commercant.seFaireExtorquer();
//		commercant.recevoir(15);
//		commercant.boire();
		
//		Yakuza yakuza = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
//		yakuza.direBonjour();
//		yakuza.extorquer(commercant);
//		commercant.seFaireExtorquer();
		
		Ronin ronin = new Ronin("Roro","shochu",60);
		ronin.direBonjour();
		ronin.donner(commercant);
		
	}
}
