package home_work_6.pizzeria;

import home_work_6.api.IPizzaInfo;

import java.util.Objects;

public class PizzaInfo implements IPizzaInfo {
    private String name;
    private String description;
    private int size;

    public PizzaInfo(String name, String description, int size) {
        this.name = name;

        this.description = description;

        this.size = size;

    }


    @Override
    /**
     * Название пицы
     */
    public String getName() {
        return this.name;
    }

    @Override
    /**
     * Состав пиццы
     */
    public String getDescription() {
        return this.description;
    }

    @Override
    /**
     * Размер пиццы
     */
    public int getSize() {
        return this.size;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaInfo pizzaInfo = (PizzaInfo) o;
        return size == pizzaInfo.size && Objects.equals(name, pizzaInfo.name) && Objects.equals(description, pizzaInfo.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, size);
    }

    @Override
    public String toString() {
        return name   + " ( description: " + description
                + ");\n Size---" + size+"sm;" ;
    }
}
