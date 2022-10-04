package home_work_6.pizzeria;

import home_work_6.api.IMenuRow;
import home_work_6.api.ISelectedItem;


/**
 * Выбор покупателя
 */
public class SelectedItem implements ISelectedItem {
    private IMenuRow row;
    private int count;

    public SelectedItem(IMenuRow row, int count) {
        this.row = row;
        this.count = count;
    }

    /**
     * Выбраная пицца
     * @return
     */
    @Override
    public IMenuRow getRow() {
        return row;
    }

    /**
     * Выбраное коллиство
     * @return
     */
    @Override
    public int getCount() {
        return count;
    }
}
