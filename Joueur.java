public class Joueur {

    private int[] nbrDeJeu;
    public final int NBRDEJACKPOT;
    private int totDeJeu;

    public Joueur(){
        NBRDEJACKPOT = 100;
        nbrDeJeu = new int[NBRDEJACKPOT];
    }

    public void jouer(){

        for (int i = 1; i <= NBRDEJACKPOT; i++){
            System.out.print("Jackpot " + i + " en cours...");

            do {
                nbrDeJeu[i-1]++;

                if (nbrDeJeu[i-1] % 1000000 == 0)
                    System.out.print(".");

            } while (!(new Grille().aiJeLeJackpot(new JeuDuLoto().tirage())));

            totDeJeu += nbrDeJeu[i-1];
            System.out.println("\nAu bout de " + nbrDeJeu[i-1] + " tirages  Jackpot !!!\n");
        }

        System.out.println("\nJ'ai touché le jackpot en moyenne 1 fois sur " + totDeJeu / NBRDEJACKPOT + " tirages\n");
        System.out.println("Alors que la probabilité est de 1 chance sur 13983816");
    }
}
