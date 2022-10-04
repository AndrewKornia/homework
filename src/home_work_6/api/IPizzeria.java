package home_work_6.api;

/**
 * Пиццерия
 */
public interface IPizzeria {

    /**
     * Получить меню
     * @return Меню с доступными для заказов пиццами
     */
    IMenu takeMenu();

    /**
     * Оформить заказ
     * @param order  заказ
     * @return квиток для отслеживания
     */
    ITicket create(IOrder order);

    /**
     * Проверитль состояния заказа по квитку
     * @param ticket квиток выданный при создании заказа
     * @return информация о сотоянии заказа
     */
    IOrderStatus check(ITicket ticket);

    /**
     * Получить сформированый заказ
     * @param ticket квиток выданый при создании заказа
     * @return готовый заказ с тем что мы выбрали
     */
    IDoneOrder pickup(ITicket ticket);





}
