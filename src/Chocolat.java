public class Chocolat extends Supplement {

    public Chocolat(Cupcake tempCupcake) {
        super(tempCupcake);
        System.out.println("On rajoute du choco les amis");
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", chocolat";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.50;
    }
    @Override
    public String toString() {
        return super.toString()+ getDescription() + ", le prix est de "+ String.valueOf(getCost());
    }
}
