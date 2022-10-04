package home_work_6.api;

/**
 * Строчка меню
 */
public interface IMenuRow {
    /**
     * информация о пице
     * @return
     */
    IPizzaInfo getInfo();

    /**
     * Стоимость пицы
     * @return цена
     */
    double getPrice();
}
