package home_work_4;

import home_work_4.Test.ComparatorCombarabol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;


public class DataContainer<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = Arrays.copyOf(data,data.length);
    }


    /**
     * Данный метод возвращает злемент массива по индексу
     *
     * @param index индекс массива
     * @return вазвращаемый элемент массива
     */
    public T get(int index) {
        if (index > data.length) {
            return null;
        }
        return data[index];
    }

    /**
     * Данный метод добавляет данные в масив и возращает индес ячейки у котором расположился
     *
     * @param item добовляемое значение
     * @return возврашаемый индекс
     */ // Как по мне так очень  огромный код , я думаю что его конечно же можно сделать короче
    public int add(T item) {
        int index = 0;
        if (data[data.length - 1] != null) {
            data = Arrays.copyOf(data, data.length + 1);
            for (int j = data.length - 1; j < data.length; j++) {
                data[j] = item;
                return index = j;
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (item == null) {
                System.out.println("-1");
                return index = -1;
            } else if (data[i] == null) {
                data[i] = item;
                return index = i;
            } else if (i == data.length) {
                Arrays.copyOf(data, data.length + 1);
                data[i] = item;
                return index = i;
            }
        }
        return index;

    }

    /**
     * Данный метод возвращает поле data
     *
     * @return data имя вохвращаемого поля
     */
    public T[] getItems() {
        return Arrays.copyOf(data,data.length);// Чтоб никто не пролез и ничего не изменил)))

    }

    /**
     * Метод удаляет элемент массива по индексу
     * // * @param index индекс по которому находится элемент
     *
     * @return возврашает true если операуичя прошла кспешно или false если нет
     */
    public boolean delete(int index) {
        for (int i = 0; i < data.length; i++) {
            if (i == index && data[i] != null) {
                while (i < data.length - 1) {
                    T save;
                    save = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = save;
                    i++;
                }
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

    /**
     * удаление эдемента массива по его эдементу
     *
     * @param item элемент массива
     * @return возвращения true если элемент удалили и  false если такого эдемента нет или он равен null
     */
    public boolean delete(T item) {
        if (item == null) {
            return false;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (Objects.equals(data[i], item)) {
                    while (i < data.length - 1) {
                        T save;
                        save = data[i + 1];
                        data[i + 1] = data[i];
                        data[i] = save;
                        i++;
                    }
                    data = Arrays.copyOf(data, data.length - 1);
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * Метод сортирует массив
     *
     * @param cmp
     */
    public void sort(Comparator<T> cmp) {
        DataContainer.sort(this,cmp);


    }

    /**
     * Переопределенный метод toString для отоброжения содержимого массива без ячеек null
     * @return возвращает содиржимое массива
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        boolean needComma = false;
        for (T datum:data){
            if(datum!=null){
                if(needComma){
                    builder.append(", ");
                }else {
                    needComma = true;
                }
                builder.append(datum);
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * Метод для сортировки массива
     * @param container экзземляр созданный на основе класс DanaContainer
     * @param cmp Comparator
     * @param <T>  говоторит о том что наш метод Generic
     */
    public static<T> void sort(DataContainer<T> container , Comparator<? super T  > cmp) {
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < container.data.length - 1; i++) {
                if (cmp.compare(container.data[i], container.data[i + 1]) > 0) {
                    T tmp = container.data[i + 1];
                    container.data[i + 1] = container.data[i];
                    container.data[i] = tmp;
                    sorted = false;
                }
            }
        } while (!sorted);

    }

    /**
     * Метод для сортировеи массива
     * @param container экзземляр созданный на основе класс DanaContainer
     * @param <T> Comparator
     */
    public static <T> void sort(DataContainer<? extends Comparable> container) {
        DataContainer .sort(container, new ComparatorCombarabol()) ;

    }


}


