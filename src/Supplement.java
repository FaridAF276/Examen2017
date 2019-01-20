public abstract class Supplement implements Cupcake {
    protected Cupcake tempCupcake;

    public Supplement(Cupcake tempCupcake) {
        this.tempCupcake = tempCupcake;
    }

    @Override
    public void addDescription(String ingredient) {
        tempCupcake.addDescription(ingredient);
    }

    @Override
    public void addCost(double cost) {
        tempCupcake.addCost(cost);
    }

    @Override
    public String toString() {
        return tempCupcake.toString();
    }
}
