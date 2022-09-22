package home_work_5;

import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.properties.PropertiesAnimal;
import home_work_5.properties.PropertiesPerson;
import home_work_5.сollection.CollectionAnimal;


public class Main1 {
    public static void main(String[] args) {

        PropertiesPerson pers  = new PropertiesPerson();
        PropertiesAnimal animal = new PropertiesAnimal();
        CollectionAnimal collectionAnimal = new CollectionAnimal();

        Person man1 = new Person(pers.generationNameReal(), pers.password(), pers.generationNickChar(15));
        Person man2 = new Person(pers.generationNameReal(), pers.password(), pers.generationNickChar(15));
        Person man3 = new Person(pers.generationNameReal(), pers.password(), pers.generationNickChar(15));
        Person man4 = new Person(pers.generationNameReal(), pers.password(), pers.generationNickChar(15));
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);
        System.out.println(man4);

        Animal animal1 = new Animal(animal.generationNIckReal(), animal.ageAdd());
        Animal animal2 = new Animal(animal.generationNIckReal(), animal.ageAdd());
        Animal animal3 = new Animal(animal.generationNIckReal(), animal.ageAdd());
        Animal animal4 = new Animal(animal.generationNIckReal(), animal.ageAdd());
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);





    }

}
