package home_work_6.api;

/**
 * Выбор покупателя
 */
public interface ISelectedItem {
    /**
     * Выброное из меню
     * @return
     */
    IMenuRow getRow();

    /**
     * Колличтво выбраного
     * @return
     */
    int getCount();

}
