package home_work_6.pizzeria;

import home_work_6.api.IOrder;
import home_work_6.api.ITicket;


import java.time.LocalDateTime;

import java.util.Random;


/**
 * Квиток выданный к заказу
 */
public class Ticket implements ITicket {

    private String numberOrder;
    private LocalDateTime time;
    private IOrder order;

    public Ticket(IOrder order) {
        this.order = order;
    }

    /**
     * Уникальный номер заказа
     * @return номер заказа
     */
    @Override
    public String getNumber() {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        String charAnySymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 10; i++) {
            int random = r.nextInt(62);
            sb.append(charAnySymbols.charAt(random));
        }
        return sb.toString();

    }

    /**
     * Метод создают время заказа
     * @return время заказа
     */
    @Override
    public LocalDateTime getCreatAt() {
        return this.time = LocalDateTime.now();


    }

    /**
     * Заказ для которого выдали квиток
     * @return заказ
     */
    @Override
    public IOrder getOrder() {

        return this.order;
    }

}
