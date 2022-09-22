package home_work_5.сollection;

import home_work_5.comparator.ComparatorPersonNick;
import home_work_5.comparator.ComparatorPersonPassword;
import home_work_5.properties.PropertiesCollectionPerson;
import home_work_5.dto.Person;

import java.util.*;

public class CollectionPerson {
    public static void main(String[] args) {
        PropertiesCollectionPerson person = new PropertiesCollectionPerson();
        ComparatorPersonPassword comparatorPersonPassword = new ComparatorPersonPassword();
        ComparatorPersonNick comparatorPersonNick = new ComparatorPersonNick();



        List<Person> containerArray = new ArrayList<>();
        List<Person> containerLinked = new LinkedList<>();
        Set<Person> containerHash = new HashSet<>();
        Set<Person> containerTree = new TreeSet<>(comparatorPersonNick);


        person.generation(containerArray, 1000);
        person.generation(containerLinked, 1000);
       // person.generation(containerHash, 1_00_000);
        //person.generation(containerTree,1_00_000);

        System.out.println("____________ContainerArray_______________");
        print(containerArray);
        System.out.println("__________________ContainerLinked__________________");
        print(containerLinked);
       // System.out.println("__________________ContainerHash__________________");
       // System.out.println(" Размер containerHash : "+ containerHash.size());
       // System.out.println("__________________ContainerTree__________________");
       // System.out.println("Размер containerTree : "+ containerTree.size());

    }

    public static void print(List<Person> container) {
        ComparatorPersonPassword comparatorPersonPassword = new ComparatorPersonPassword();
        ComparatorPersonNick comparatorPersonNick = new ComparatorPersonNick();
        System.out.println("Коллекция до сортировки" + container);
        System.out.println("_____________");
        container.sort(comparatorPersonPassword);
        container.sort(comparatorPersonNick);

        System.out.println("Коллекция после сортировки" + container);


    }

//        System.out.println("____________ContainerArray_______________");
//        start = System.currentTimeMillis();
//        printAndSort(containerArray);
//        stop = System.currentTimeMillis();
//        System.out.println("Время начло выполнения программы :" + start);
//        System.out.println("Конечное время  выполнения программы :" + stop);
//        System.out.println("__________________ContainerLinked__________________");
//        start = System.currentTimeMillis();
//        printAndSort(containerLinked);
//        stop = System.currentTimeMillis();
//        System.out.println("Время начло выполнения программы :" + start);
//        System.out.println("Конечное время  выполнения программы :" + stop);
//
//        System.out.println("__________________ContainerHash__________________");
//        System.out.println(" Размер containerHash : "+ containerHash.size());
//        System.out.println("__________________ContainerTree__________________");
//        System.out.println("Размер containerTree : "+ containerTree.size());

}
