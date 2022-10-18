package home_work_6.pizzeria;

import home_work_6.api.IMenuRow;
import home_work_6.api.IOrder;
import home_work_6.api.ISelectedItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Заказ сделаный  покупателем
 */
public class Order implements  IOrder {

    private List<ISelectedItem> selectedItems = new ArrayList<>();


    /**
     * Добавление новой пицы
     * @param row имя пицы
     * @param count колличесвто пиццы
     */
    public void add(IMenuRow row,int count){

        this.selectedItems.add(new SelectedItem(row,count));

    }


    /**
     * МЕтод возврщает спиисок заказа
     * @return список
     */
    @Override
    public List<ISelectedItem> getSelected() {
        return selectedItems;
    }
}
