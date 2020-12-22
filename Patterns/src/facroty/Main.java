package facroty;

public class Main {

    public static void main(String[] args) {
            IPizza diablo=PizzaFactory.prepare("Diabolo");
            diablo.printIngredients();

            IPizza salami=PizzaFactory.prepare("Salami");
            salami.printIngredients();

            IPizza hawai=PizzaFactory.prepare("Hawai");
            hawai.printIngredients();

            IPizza test=PizzaFactory.prepare("gibts nicht");
            test.printIngredients();
    }

}
