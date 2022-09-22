package home_work_5.IProperties;

public interface IProperties {

    void setNick(String nick);

    /**
     * Метод добовляет новое имя к уже сущестующим дабы расширить диапозон случайных генераций имен
     *
     * @param name Введеное имя
     */
    void setName(String name);

    /**
     * Метод который генерирует случайные имена
     *
     * @return возращет случайное имя
     */
    String generationNameReal();

    /**
     * Метод генерирует случайное имя из случайных символов
     *
     * @param length длинна символлов в имени
     * @return возвращаем имя
     */
    String generationNameChar(int length);

    /**
     * Метод генерирует случайное имя из случайных символов руского алфавита
     *
     * @param length длинна символлов в имени
     * @return возвращаем имя
     */
    String generationNameCharRuss(int length);

    /**
     * Метод который генерирует случайные имена
     *
     * @return возращет случайное имя
     */
    String generationNIckReal();

    /**
     * Метод генерирует случайное имя из случайных символов
     *
     * @param length длинна символлов в имени
     * @return возвращаем имя
     */
    String generationNickChar(int length);

    /**
     * Метод генерирует случайное имя из случайных символов руского алфавита
     *
     * @param length длинна символлов в имени
     * @return возвращаем имя
     */
    String generationNickCharRuss(int length);

    /**
     * Метож генерирует случайный возраст
     *
     * @return возращает сгенерированый возраст
     */
    int ageAdd();

    /**
     * Метод генерирует случайный пароль
     *
     * @return возращает пороль
     */
    String password();
}


















