package facroty;

import java.util.ArrayList;

class Salami implements IPizza {

    private ArrayList<String> ingredients=new ArrayList<String>();

    Salami(){
        ingredients.add("Teig");
        ingredients.add("Tomaten");
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
