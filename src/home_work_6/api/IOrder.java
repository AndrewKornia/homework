package home_work_6.api;

import java.util.List;

/**
 * Заказ сформированый покупателем
 */
public interface IOrder {

    /**
     * Список выбраного для заказа
     * @return список выбраного
     */
    List<ISelectedItem> getSelected();


}
