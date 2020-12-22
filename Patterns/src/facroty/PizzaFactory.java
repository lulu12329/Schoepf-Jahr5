package facroty;

public class PizzaFactory {

    static IPizza prepare(String s){
        IPizza pizza;
        s=s.toLowerCase();
        switch (s) {
            case "diabolo":
                pizza = new Diabolo();
                break;
            case "salami":
                pizza = new Salami();
                break;
            case "hawai":
                pizza = new Hawai();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + s);
        }
        return pizza;
    }

}
