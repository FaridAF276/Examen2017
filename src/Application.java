import java.util.Scanner;

public class Application {
    Factory fabrique = new Factory();
    Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Factory fabrique = new Factory();
        Cupcake gateau = null;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Quel type de gâteau désirez-vous ? Tapez 1 pour Chocolat Tapez 2 pour Vanille");
        if(userInput.hasNextLine()){
            String choix = userInput.nextLine();

            gateau = fabrique.commanderCupcake(Integer.parseInt(choix));

        }
        if(gateau != null) {
            garnir(gateau);
        }
    }
    public static void garnir (Cupcake gato) {
        Scanner userInput = new Scanner(System.in);
        String choix = "";
        int select=3;
        do {
            System.out.println("Quel type de garniture désirez-vous : \n");
            System.out.println("0- Chocolat");
            System.out.println("1- Fruit");
            System.out.println("2- Terminer la commande");
            if (userInput.hasNextLine()){

                choix = userInput.nextLine();
                select = Integer.parseInt(choix);
            }
            switch (select){
                case 0:
                    gato = new Chocolat(gato);
//                    System.out.println(gato.addDescription());
//                    System.out.println(String.valueOf(gato.addCost()));
                    break;
                case 1:
                    gato = new Fruit(gato);
//                    System.out.println(gato.addDescription());
//                    System.out.println(String.valueOf(gato.addCost()));
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Erreur aucun choix n'a été effectué recommencez svp");
                    break;
                default:
                    System.out.println("Veuillez effectuer un choix valide s'il vous plait");
                    break    ;
            }
        } while (select!=2);
        System.out.println(gato.toString());

    }
}
