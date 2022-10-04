package home_work_6.pizzeria;

import home_work_6.api.IMenuRow;
import home_work_6.api.IPizzaInfo;

import java.util.Objects;

/**
 *
 */
public class MenuRow implements IMenuRow {

private IPizzaInfo pizza;
private double price;



    public MenuRow(IPizzaInfo pizza, double price) {
        this.pizza = pizza;
        this.price = price;
    }

    @Override
    /**
     * Информация о пицее
     */
    public  IPizzaInfo getInfo() {
        return this.pizza;
    }

    @Override
    /**
     * Информация о цене
     */
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuRow menuRow = (MenuRow) o;
        return Double.compare(menuRow.price, price) == 0 && Objects.equals(pizza, menuRow.pizza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizza, price);
    }

    @Override
    public String toString() {
        return  pizza + "\n Price---" + price+"$;\n" ;
    }
}
