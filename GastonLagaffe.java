package GestionExceptions;

public class GastonLagaffe {

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

	public void rangerBureau(){
		System.out.println("Ranger mon bureau ? Si tu insistes...");
		try {
			throw new Exception("Impossible, l'armoire est déjà pleine !");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void faireSignerContrats() {
		try {
			System.out.println("Encore ces contrats ? OK, je les imprime...");
			imprimerContrats();
			System.out.println("A présent une petite signature...");
			ajouterSignature();
			System.out.println("Fantasio, les contrats sont signés !");
		}
		catch (Exception e) {
			System.out.println("M'enfin ! " + e.getMessage());
		}
	}

	private void ajouterSignature()	{
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

	public static void main(String[] args) {
		GastonLagaffe gaston = new GastonLagaffe();

		System.out.println("Debout Gaston ! Il faut trier le courrier !");
		gaston.trierCourrierEnRetard(20);

		System.out.println("\n\n\n");

		gaston.rangerBureau();
		
		System.out.println("\n\n\n");
		
		System.out.println("Gaston, Mr. Demesmaeker arrive, faites vite !");
		gaston.faireSignerContrats();
	}
}