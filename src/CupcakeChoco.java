public class CupcakeChoco implements Cupcake {
    String type, description;
    double prix;

    public CupcakeChoco() {
        this.type = "Chocolat";
        this.prix = 3.00;
        this.description = "Ingrédients : Pâte au chocolat ";
    }

    @Override
    public void addDescription(String ingredient) {
        this.description += ingredient;
    }

    @Override
    public void addCost(double cost) {
        this.prix += cost;
    }
    @Override
    public String toString() {
        return this.description + "\n et coûte : "+this.prix;
    }
}
