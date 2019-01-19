public class Factory {



    vraiCupcake choco = new vraiCupcake("ingrédients  pâte au chocolat", 3.00);
    vraiCupcake vanille = new vraiCupcake("ingrédients  pâte sucre vanille et extrait de vanille", 3.50);

    public static void main(String[] args) {
        Cupcake cupcakechoco = new Fruit(new vraiCupcake("ingrédients  pâte au chocolat", 3.00));
    }
}
