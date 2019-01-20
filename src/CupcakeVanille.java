public class CupcakeVanille implements Cupcake {
        String type, description;
        double prix;

        public CupcakeVanille() {
            this.description = "Ingrédients : Pâte sucre vanille et extrait de vanille";
            this.type = "Vanille";
            this.prix = 3.50;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public double getCost() {
            return prix;
        }

        @Override
        public String toString() {
            return getDescription();
        }
}
