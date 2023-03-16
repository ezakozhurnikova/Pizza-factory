package pizza_factory;

import java.util.Scanner;

public class Pizza_factory {


    public static void order() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which kind of pizza do you want? (Hawaii,Mozarella,Salami): ");
        String pizza = input.nextLine().toLowerCase();

            switch (pizza) {
                case "Hawaii":
                    Pizza hawaii = new Hawaii();
                    hawaii.preparing();
                    hawaii.backing();
                    hawaii.packing();
                    break;
                case "Mozarella":
                    Pizza mozarella = new Mozarella();

                    mozarella.preparing();
                    mozarella.backing();
                    mozarella.packing();
                    break;
                case "Salami":
                    Pizza salami = new Salami();

                    salami.preparing();
                    salami.backing();
                    salami.packing();
                    break;
                default:
                    System.out.println("we have not this kind of pizza");
                    input.close();
                    break;


            }


    }

}
