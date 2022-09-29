package home_work_5.сollection;

import home_work_5.comparator.ComparatorAnimalAge;
import home_work_5.comparator.ComparatorAnimalNick;
import home_work_5.dto.Animal;

import home_work_5.dto.Person;
import home_work_5.properties.PropertiesCollectionAnimal;

import java.util.*;

public class CollectionAnimal {

    public static void main(String[] args) {

        PropertiesCollectionAnimal animal = new PropertiesCollectionAnimal();
        ComparatorAnimalAge comparatorAnimalAge = new ComparatorAnimalAge();
        ComparatorAnimalNick comparatorAnimalNick = new ComparatorAnimalNick();


        List<Animal> containerArray = new ArrayList<>();
        List<Animal> containerLinked = new LinkedList<>();
        Set<Animal> containerHash = new HashSet<>();
        Set<Animal> containerTree = new TreeSet<>(comparatorAnimalNick);

        System.out.println("______________ContainerArray_____________");
        time(containerArray);
        sort(containerArray);

        System.out.println("______________ContainerLinked_____________");
        time(containerLinked);
        sort(containerLinked);
        System.out.println("______________ContainerHash_____________");
        time(containerHash);
        //Сортировку данной коллекции нельзя реализовать так как  класс Set не имеет методов произвольного доступа , что в основном требуется для алгоритмов сортировки,
        // но сортировку можно сдлетать поместив создыннй обьект HshSet в Коетсруктор создоваемого обекта класа List , как я понял типо List<> list = new lest<>(HashSet hashSet)
        System.out.println("______________ContainerTree_____________");
        time(containerTree);
        // TreeSet автоматически делает сортировку при заполнении но нужно понимат чем заполнем так как в большенста случаяях нам понадобится Comparator




    }

    /**
     * Метод заполняет коллекцию рондомными обектоми типа Animal и сообщает о времени выполнении
     * @param col ипользуется для дольйшего выполнения тела метода
     */
    public static void time(Collection<Animal> col) {
        PropertiesCollectionAnimal animal = new PropertiesCollectionAnimal();
        long start = System.currentTimeMillis();
        animal.generation(col, 1000000);
        long stop = System.currentTimeMillis();
        System.out.println("Время  заполнения коллекции : " + (stop - start));
        iteration(col);
        delete(col);
    }

    /**
     * Метод заполняет коллекцию рондомными обектоми типа Person и сообщает о времени выполнении
     * @param container ипользуется для дольйшего выполнения тела метода
     */
    public static void sort(List<Animal> container) {
        ComparatorAnimalAge comparatorAnimalAge = new ComparatorAnimalAge();
        ComparatorAnimalNick comparatorAnimalNick = new ComparatorAnimalNick();
        ;
        long start = System.currentTimeMillis();
        container.sort(comparatorAnimalAge);
        container.sort(comparatorAnimalNick);
        long stop = System.currentTimeMillis();
        System.out.println("Время затраченое на сортировку коллекции :" + (stop - start) + "ms");


    }

    /**
     * Метод итерирует коллекцию c помощью iterator и сообщает о времени выполнении
     * @param col ипользуется для дольйшего выполнения тела метода
     */
    public static void iteration(Collection<Animal> col) {
        Iterator<Animal> iterator = col.iterator();
        long start = System.currentTimeMillis();
            while (iterator.hasNext()) {
                iterator.next();
            }
        long stop = System.currentTimeMillis();
        System.out.println("Время затраченое на итерацию коллекции :" + (stop - start) + " ms");

        }
    /**
     * Метод итерирует коллекцию с помощью цикла for и сообщает о времени выполнении
     * @param col ипользуется для дольйшего выполнения тела метода
     */
    public static void iter(List<Animal> col){
        long start = System.currentTimeMillis();
        for (int i = 0;i<col.size();i++){
            System.out.println(col.get(i));
        }
        long stop = System.currentTimeMillis();
        System.out.println("Время затраченое на итерацию коллекции c помощью for :" + (stop - start) + " ms");
    }



    /**
     *  Метод удаляет все элементы с коллекции и сообщает о времени выполнении
     * @param collection ипользуется для дольйшего выполнения тела метода
     */
    public static void delete(Collection<Animal> collection){
        long start = System.currentTimeMillis();
        collection.clear();
        long stop = System.currentTimeMillis();
        System.out.println("Время затраченое на удввление все элементов коллекции :" + (stop - start) + " ms");

    }
    }

