public class Fruit extends Supplement{

    public Fruit(Cupcake tempCupcake) {
        super(tempCupcake);
        System.out.println("On rajoute des fruits les amis");
        this.addDescription(", fruit");
        this.addCost(2.00);
    }

//    @Override
//    public String addDescription(String ingredient) {
//        return super.addDescription() + ", fruit";
//    }
//
//    @Override
//    public void addCost() {
//        return super.addCost() + 2.00;
//    }
//
//    @Override
//    public String toString() {
//        String statement = super.toString() + this.addDescription() + ", le prix est de "+ String.valueOf(this.addCost());
//        return statement;
//    }

}
