package facroty;

import java.util.ArrayList;

class Diabolo implements IPizza {

    private ArrayList<String> ingredients=new ArrayList<String>();

    Diabolo(){
        ingredients.add("Teig");
        ingredients.add("Tomaten");
        ingredients.add("Pepperoni");
        ingredients.add("Salami");
    }

    @Override
    public void printIngredients() {
        for (String s:ingredients) {
            System.out.print(s+", ");
        }
        System.out.println();
    }
}
