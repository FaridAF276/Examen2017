public class Fruit extends Supplement{

    public Fruit(Cupcake tempCupcake) {
        super(tempCupcake);
        System.out.println("On rajoute des fruits les amis");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", fruit";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.00;
    }

    @Override
    public String toString() {
        String statement = super.toString() + this.getDescription() + ", le prix est de "+ String.valueOf(this.getCost());
        return statement;
    }
}
