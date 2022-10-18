package home_work_6.pizzeria;

import home_work_6.api.IDoneOrder;
import home_work_6.api.IPizza;
import home_work_6.api.ITicket;

import java.util.List;

/**
 * Готовый заказ
 */
public class DoneOrder implements IDoneOrder {

    private ITicket ticket;
    private List<IPizza> pizzas;


    /**
     * Квиток по которому заказ готовится
     * @return квиток выданный по формированию заказа
     */
    @Override
    public ITicket getTicket() {
        return ticket;
    }

    /**
     * Готовые пиццы приготовленный по заказу
     * @return список пиц
     */
    @Override
    public List<IPizza> getItems() {
        return this.pizzas;
    }

}
