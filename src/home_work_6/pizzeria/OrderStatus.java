package home_work_6.pizzeria;

import home_work_6.api.IStage;
import home_work_6.api.ITicket;

import java.util.ArrayList;
import java.util.List;

/**
 * Статус заказа
 */
public class OrderStatus implements home_work_6.api.IOrderStatus {

    private ITicket ticket;
   private List<IStage> history;
    private boolean done;

    /**
     * Метод возвращает квиток заказа
     * @return квиток
     */
    @Override
    public ITicket getTicket() {
        return this.ticket;
    }

    /**
     * Метод возврашает стадии заказа
     * @return стадии заказа
     */
    @Override
    public List<IStage> getHistory() {
       history.add(new Stage("Заказа приянт",ticket.getCreatAt().plusMinutes(3)));
        history.add(new Stage("Пица готовится",ticket.getCreatAt().plusMinutes(5)));
        history.add(new Stage("Заказ покупается",ticket.getCreatAt().plusMinutes(7)));
        history.add(new Stage("Заказ готов",ticket.getCreatAt().plusMinutes(8)));
        for(int i =0;i<history.size();i++){
            if(i==1){
                history.get(i).getTime().plusMinutes(3);
            }else if(i == 2){
                history.get(i).getTime().plusMinutes(5);
            }        }

        return history;
    }

    /**
     * Метод возвращает готов/не готов
     * @return готов/не готов
     */
    @Override
    public boolean isDone() {
        return true;

    }
}
