public class CupcakeChoco implements Cupcake {
    String type, description;
    double prix;

    public CupcakeChoco() {
        this.type = "Chocolat";
        this.prix = 3.00;
        this.description = "Ingrédients : Pâte au chocolat ";
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
