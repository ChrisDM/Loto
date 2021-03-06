
import java.text.DecimalFormat;

public class Joueur {

    private int[] nbrDeJeu;
    private final int NBRDEJACKPOT;
    private long totDeJeu;
    DecimalFormat df = new DecimalFormat("###,###");

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
            System.out.println("\nAu bout de " + df.format(nbrDeJeu[i-1]) + " tirages  Jackpot !!!\n");
        }

        System.out.println("\nSur " + NBRDEJACKPOT + " tirages, j'ai touché le jackpot en moyenne 1 fois sur " + df.format(totDeJeu / NBRDEJACKPOT));
        System.out.println("\nAlors que la probabilité est de 1 chance sur 13 983 816");
    }
}
