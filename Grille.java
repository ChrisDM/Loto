public class Grille {
    private int[] grille;
    private int nbrBonNum;

    public Grille(){
        grille = new int[]{8, 10, 28, 12, 42, 49};
        nbrBonNum = 0;
    }

    public boolean aiJeLeJackpot(int[] tirage){
        for (int tir : tirage){
            for (int g : grille)
                if (tir == g)
                    nbrBonNum++;
        }
        return (nbrBonNum == grille.length);
    }

}