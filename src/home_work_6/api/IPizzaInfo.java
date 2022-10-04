package home_work_6.api;

/**
 * Информация о пице
 */
public interface IPizzaInfo {
    /**
     * Название пицы
     * @return
     */
    String getName();

    /**
     * Описания/состав пиццы
     * @return
     */
    String getDescription();

    /**
     * Итоговый размер приготовленой пиццы
     * @return
     */
    int getSize();

}
