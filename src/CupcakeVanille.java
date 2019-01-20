public class CupcakeVanille implements Cupcake {
        String type, description;
        double prix;

        public CupcakeVanille() {
            this.description = "Ingrédients : Pâte sucre vanille et extrait de vanille";
            this.type = "Vanille";
            this.prix = 3.50;
        }

        @Override
        public void addDescription(String ingredient) {
            this.description+=ingredient;
        }

        @Override
        public void addCost(double cost) {
            this.prix+=cost;
        }

        @Override
        public String toString() {
            return this.description + "\n et coûte : "+this.prix;
        }
}
