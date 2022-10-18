package home_work_6.pizzeria;

import home_work_6.api.*;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria implements IPizzeria {


    private IMenu menu;


    @Override
    public IMenu takeMenu() {
        Menu menu1 = new Menu();
        menu1.getItems();
        return this.menu = menu1;


    }

    /**
     * Оформить заказ
     * @param order  заказ
     * @return квиток для отсеживания
     */
    @Override
    public ITicket create(IOrder order) {
        Ticket ticket = new Ticket(order);
        ticket.getNumber();
        ticket.getCreatAt();
        ticket.getOrder();


        return ticket;
    }

    /**
     * Проверитль состояния заказа по квитку
     * @param ticket квиток выданный при создании заказа
     * @return информация о сотоянии заказа
     */
    @Override
    public IOrderStatus check(ITicket ticket) {



        return new OrderStatus();
    }


    /**
     * Получить сформированый заказ
     * @param ticket квиток выданый при создании заказа
     * @return готовый заказ с тем что мы выбрали
     */
    @Override
    public IDoneOrder pickup(ITicket ticket) {

        return null;
    }
}
