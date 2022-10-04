package home_work_6.api;

import java.util.List;

/**
 * Готовый заказ
 */
public interface IDoneOrder {

    /**
     * Квиток по которому заказ готовится
     * @return квиток выданный по формированию заказа
     */
    ITicket getTicket();

    /**
     * Готовые пиццы приготовленный по заказу
     * @return список пиц
     */
    List<IPizza> getItems();

}
