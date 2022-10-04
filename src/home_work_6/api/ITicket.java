package home_work_6.api;

import java.time.LocalDateTime;

/**
 * Квиток выдовыаемый к заказу
 */
public interface ITicket {
    /**
     * Уникальный номкр заказа
     * @return
     */
    String getNumber();

    /**
     * Когда заказ получен
     * @return
     */
    LocalDateTime getCreatAt();

    /**
     * Заказ для  которого выдали квиток
     * @return
     */
    IOrder getOrder();




}
