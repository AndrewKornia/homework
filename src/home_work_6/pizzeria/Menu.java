package home_work_6.pizzeria;

import home_work_6.api.IMenu;
import home_work_6.api.IMenuRow;
import home_work_6.api.IPizzaInfo;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {

    private List<IMenuRow> menuRows = new ArrayList<>();

    public void addCreatePizza(){
        menuRows.add(new MenuRow(new PizzaInfo("Margarita","san marzano, mozzarella, basil, oregano, chili flake",25),21));
        menuRows.add(new MenuRow(new PizzaInfo("Pepperoni Pizza","san marzano, mozzarella, basil, oregano, chili flake",25),27.7));
        menuRows.add(new MenuRow(new PizzaInfo("Pepperoni","Layers of extra pepperoni & mozzarella cheese.",25),34));
        menuRows.add(new MenuRow(new PizzaInfo("Meat","Pepperoni, original sausage, ham, bacon and Italian sausage.",25),23));
        menuRows.add(new MenuRow(new PizzaInfo("Deluxe","Pepperoni, sausage, mushrooms, green peppers, banana peppers, green olives and onions.",25),13));
        menuRows.add(new MenuRow(new PizzaInfo("Chicken Ranch","Grilled chicken, onion, green peppers, bacon and our special ranch dressing. Substitute chicken with pepperoni upon request.",25),20));
        menuRows.add(new MenuRow(new PizzaInfo("Hawaiian","Ham, pineapple and extra cheese.",25),20));
        menuRows.add(new MenuRow(new PizzaInfo("Veggie","Sliced tomato, mushrooms, onions, green peppers, banana peppers, green & black olives.",25),33));
        menuRows.add(new MenuRow(new PizzaInfo("Flatbread Pizza","Crispy, delicious flatbread pizza customized just how you like it!",25),122));
        menuRows.add(new MenuRow(new PizzaInfo("Chicken Ranch Flatbread","Tender grilled chicken, sweet onions, green peppers, bacon, our specialty ranch dressing and 100% real mozzarella cheese served on top of our delicously thin, crispy flatbread",25),43));

    }

    @Override
    public List<IMenuRow> getItems() {
        return this.menuRows;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (IMenuRow menuRow : menuRows) {
            builder.append(i++ ).
                    append(" :").
                    append(menuRow);
        }
        return builder.toString();
    }

}
