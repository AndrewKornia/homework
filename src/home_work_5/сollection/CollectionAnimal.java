package home_work_5.сollection;

import home_work_5.comparator.ComparatorAnimalAge;
import home_work_5.comparator.ComparatorAnimalNick;
import home_work_5.dto.Animal;
import home_work_5.properties.PropertiesCollectionAnimal;

import java.util.*;

public class CollectionAnimal  {

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


    public static void time(Collection<Animal>col){
        PropertiesCollectionAnimal animal = new PropertiesCollectionAnimal();
        long start = System.currentTimeMillis();
        animal.generation(col,1000000);
        long stop = System.currentTimeMillis();
        System.out.println("Время  заполнения коллекции : "+ (stop-start));
    }


    public static void sort(List<Animal> container) {
        ComparatorAnimalAge comparatorAnimalAge = new ComparatorAnimalAge();
        ComparatorAnimalNick comparatorAnimalNick = new ComparatorAnimalNick();;
        long start = System.currentTimeMillis();
        container.sort(comparatorAnimalAge);
        container.sort(comparatorAnimalNick);
        long stop = System.currentTimeMillis();
        System.out.println("Время затраченое на сортировку коллекции :" +  (stop - start)+"ms");


    }
}
