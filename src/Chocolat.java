public class Chocolat extends Supplement {

    public Chocolat(Cupcake tempCupcake) {
        super(tempCupcake);
        System.out.println("On rajoute du choco les amis");
        this.addDescription(", chocolat");
        this.addCost(2.50);
    }

}
