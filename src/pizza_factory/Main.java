package pizza_factory;

public class Main extends Pizza_factory {
    public static void main(String[] args) {
        /*1. Cоздать фабрику по производству пиццы. Фабрика должна уметь готовить следующие виды пиццы:
    Гавайи, Моцарелла,Салями.
   2. Каждый вид пиццы должен уметь: подготавливаться (накладывать ингридиенты напр.), печься и упаковываться.
         В каждом случае должно быть понятно о какой пицце речь.
   3. В классе Main не должен создаваться новый обьект пиццы, а из него должен поступать "заказ"  на изготовление
      требуемого вида пиццы (обьекта) в класс PizzaFactory, который и должен выбрать нужную пиццу для изготовления

      Пример: заказана пицца Hawaii.
      На выходе:
      Preparing pizza with ananas and cheese
      Baking Pizza Hawaii
      Packing pizza Hawaii*/
        /*Pizza pizza=new Hawaii();

        pizza.preparing();
        pizza.backing();
        pizza.packing();*/

        /*System.out.println("Which kind of pizza do you want? (Hawaii,Mozarella,Salami): ");
        String pizza = input.nextLine().toLowerCase();*/

        Pizza_factory.order();

    }

}
