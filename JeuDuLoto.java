public class JeuDuLoto {

    public int[] tirage;

    public JeuDuLoto(){
        tirage = new int[6];
    }

    public int[] tirage(){

        //Boucle qui tire 6 boules
        for (int i = 0; i < tirage.length; i++){
            tirage[i] = (int)(Math.random() * 49) + 1;

            //Sous-boucle qui vérifie si la boule n'est pas déjà sortie
            for (int j = 0; j < i; j++){
                if (tirage[i] == tirage[j]){
                    i--;
                }
            }
        }
        return tirage;
    }
}
