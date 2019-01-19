public class vraiCupcake implements Cupcake {
    String type;
    double prix;

    public vraiCupcake(String type, double prix) {
        this.type = type;
        this.prix = prix;
    }

    @Override
    public String getDescription() {
        return type;
    }

    @Override
    public double getCost() {
        return prix;
    }
}
