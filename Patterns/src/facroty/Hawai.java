package facroty;

import java.util.ArrayList;

class Hawai implements IPizza {

    private ArrayList<String> ingredients=new ArrayList<String>();

    Hawai(){
        ingredients.add("Teig");
        ingredients.add("Tomaten");
        ingredients.add("Ananas");
    }

    @Override
    public void printIngredients() {
        for (String s:ingredients) {
            System.out.print(s+", ");
        }
        System.out.println();
    }
}
