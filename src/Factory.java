public class Factory {


    public Cupcake commanderCupcake(int choix) {

        switch (choix) {
            case 1:
                CupcakeChoco cupchoco = new CupcakeChoco();
                return cupchoco;

            case 2:
                CupcakeVanille cupvanille = new CupcakeVanille();
                return cupvanille;

            default:
                return null;
        }
    }
}