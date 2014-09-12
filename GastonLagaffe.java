package GestionExceptions;

public class GastonLagaffe {

	// Partie 1
	public void trierCourrierEnRetard(int nbLettres) {
		System.out.print("Quoi, " + nbLettres + " lettre(s) à trier ? ");

		try {
			System.out.println("OK, OK, je vais m'y mettre...");

			if (nbLettres > 2) {
				throw new Exception("Beaucoup trop de lettres...");
			}
			System.out.println("Ouf, j'ai fini.");
		}

		catch (Exception e) {
			System.out.println("M'enfin ! " + e.getMessage());
			System.out.println("Détails : " + e.toString());
		}

		System.out.println("Après tout ce travail, une sieste s'impose.");
	}

	// Partie 3
	public void rangerBureau() {
		System.out.println("Ranger mon bureau ? Si tu insistes...");
		try {
			throw new Exception("Impossible, l'armoire est déjà pleine !");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Partie 4
	public void faireSignerContrats() {
		try {
			System.out.println("Encore ces contrats ? OK, je les imprime...");
			imprimerContrats();
			System.out.println("A présent une petite signature...");
			ajouterSignature();
			System.out.println("Fantasio, les contrats sont signés !");
		} catch (Exception e) {
			System.out.println("M'enfin ! " + e.getMessage());
		}
	}

	private void ajouterSignature() {
		System.out.println("Signez ici, M'sieur Demesmaeker.");
	}

	private void imprimerContrats() throws Exception {
		System.out.println("D'abord, mettre en route l'imprimante.");
		allumerImprimante();
		System.out.println("Voilà, c'est fait !");
	}

	private void allumerImprimante() throws Exception {
		System.out.println("Voyons comment allumer cette machine...");
		throw new Exception("Mais qui a démonté tout l'intérieur ?");
	}

	// Partie 5
	public void repondreAuTelephone(String appelant) throws ExceptionMenfin,
			ExceptionBof {
		if (appelant.equals("Mr. Boulier")) {
			throw new ExceptionMenfin("Je finis un puzzle.");
		}

		else if (appelant.equals("Prunelle")) {
			throw new ExceptionBof("Pas le temps, je suis dé-bor-dé !");
		} else {
			System.out.println("Allô, ici Gaston, j'écoute...");
		}
	}

	private static void appeler(GastonLagaffe gaston, String appelant) {
		System.out.println("Gaston, " + appelant + " au téléphone !");

		try {
			gaston.repondreAuTelephone(appelant);
		} catch (Exception e) {
			System.out.println("Encore une bonne excuse, j'imagine ?");
			System.out.println(e.getMessage());
		}
	}

	// Partie 7
	public void commanderFournitures() throws Exception {
		System.out.println("D'abord, réchauffer ma morue aux fraises...");
		System.out.println("Heureusement, j'ai réparé mon réchaud à gaz.");
		throw new Exception("Vite, où est l'extincteur ??");
	}

	private static void preparerJournal(GastonLagaffe gaston) {
		System.out.println("Gaston, une commande urgente !");

		try {
			gaston.commanderFournitures();
		}
		catch (Exception e) {
			System.out.println("Gaston, d'où vient cette odeur !?");
			System.out.println(e.getMessage());
		}
		System.out.println("Déjà terminé ? Il progresse, ce petit...");
	}

	public static void main(String[] args) {
		//Partie 1
		GastonLagaffe gaston = new GastonLagaffe();

		System.out.println("Debout Gaston ! Il faut trier le courrier !");
		gaston.trierCourrierEnRetard(20);

		//Partie 3
		System.out.println("\n\n\n");
		gaston.rangerBureau();

		//Partie 4
		System.out.println("\n\n\n");
		System.out.println("Gaston, Mr. Demesmaeker arrive, faites vite !");
		gaston.faireSignerContrats();

		//Partie5
		System.out.println("\n\n\n");
		appeler(gaston, "Mr. Boulier");
		appeler(gaston, "Prunelle");
		appeler(gaston, "Jules-de-chez-Smith");

		// Partie 7
		System.out.println("\n\n\n");
		preparerJournal(gaston);
	}
}