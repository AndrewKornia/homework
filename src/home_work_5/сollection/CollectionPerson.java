package home_work_5.сollection;




import home_work_5.comparator.ComparatorPersonNick;
import home_work_5.comparator.ComparatorPersonPassword;
import home_work_5.properties.PropertiesCollectionPerson;
import home_work_5.dto.Person;

import java.util.*;

public class CollectionPerson {
    public static void main(String[] args) {
        ComparatorPersonPassword comparatorPerson = new ComparatorPersonPassword();


        List<Person> containerArray = new ArrayList<>();
        List<Person> containerLinked = new LinkedList<>();
        Set<Person> containerHash = new HashSet<>();
        Set<Person> containerTree = new TreeSet<>(comparatorPerson);



        System.out.println("______________ContainerArray_____________");
        time(containerArray);
        sort(containerArray);
        iter(containerArray);
        System.out.println("______________ContainerLinked_____________");
        time(containerLinked);
        sort(containerLinked);
        iter(containerLinked);
        System.out.println("______________ContainerHash_____________");
        time(containerHash);
        //Сортировку данной коллекции нельзя реализовать так как  класс Set не имеет методов произвольного доступа , что в основном требуется для алгоритмов сортировки,
        // но сортировку можно сдлетать поместив создыннй обьект HshSet в Коетсруктор создоваемого обекта класа List , как я понял типо List<> list = new lest<>(HashSet hashSet)
        System.out.println("______________ContainerTree_____________");
        time(containerTree);
        // TreeSet автоматически делает сортировку при заполнении но нужно понимат чем заполнем так как нам понадобится Comparator

    }

    /**
     * Метод заполняет коллекцию рондомными обектоми типа Person и сообщает о времени выполнении
     * @param col ипользуется для дольйшего выполнения тела метода
     */
    public static void time(Collection<Person> col) {
        PropertiesCollectionPerson person = new PropertiesCollectionPerson();
        long start = System.currentTimeMillis();
        person.generation(col, 1000000);
        long stop = System.currentTimeMillis();
        System.out.println("Время  заполнения коллекции : " + (stop - start + " ms "));
        iteration(col);
        delete(col);
    }

    /**
     * Метод заполняет коллекцию рондомными обектоми типа Person и сообщает о времени выполнении
     * @param container ипользуется для дольйшего выполнения тела метода
     */
    public static void sort(List<Person> container) {
        ComparatorPersonPassword comparatorPerson = new ComparatorPersonPassword();
        ComparatorPersonNick comparatorPersonNick = new ComparatorPersonNick();
        long start = System.currentTimeMillis();
        container.sort(comparatorPerson);
        container.sort(comparatorPersonNick);
        long stop = System.currentTimeMillis();
        System.out.println("Время затраченое на сортировку коллекции :" + (stop - start) + " ms");


    }

    /**
     *  Метод итерирует коллекцию c помощью iterator и сообщает о времени выполнении
     * @param col ипользуется для дольйшего выполнения тела метода
     */
    public static void iteration(Collection<Person> col) {
        Iterator<Person> iterator = col.iterator();
        long start = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Время затраченое на итерацию коллекции c помощью iterator:" + (stop - start) + " ms");

    }

    /**
     * Метод итерирует коллекцию с помощью цикла for и сообщает о времени выполнении
     * @param col ипользуется для дольйшего выполнения тела метода
     */
    public static void iter(List<Person> col){
        long start = System.currentTimeMillis();
        for (int i = 0;i<col.size();i++){
            System.out.println(col.get(i));
        }
        long stop = System.currentTimeMillis();
        System.out.println("Время затраченое на итерацию коллекции c помощью for :" + (stop - start) + " ms");
    }

    /**
     * Метод удаляет все элементы с коллекции и сообщает о времени выполнении
     * @param collection ипользуется для дольйшего выполнения тела метода
     */
    public static void delete(Collection<Person> collection){
        long start = System.currentTimeMillis();
        collection.clear();
        long stop = System.currentTimeMillis();
        System.out.println("Время затраченое на удввление все элементов коллекции :" + (stop - start) + " ms");



    }

}
