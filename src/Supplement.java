abstract class Supplement implements Cupcake {
    protected Cupcake tempCupcake;

    public Supplement(Cupcake tempCupcake) {
        this.tempCupcake = tempCupcake;
    }

    @Override
    public String getDescription() {
        return tempCupcake.getDescription();
    }

    @Override
    public double getCost() {
        return tempCupcake.getCost();
    }

    @Override
    public String toString() {
        return "";
    }
}
