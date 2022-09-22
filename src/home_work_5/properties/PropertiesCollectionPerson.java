package home_work_5.properties;


import home_work_5.dto.Person;

import java.util.Collection;

public class PropertiesCollectionPerson  {
    PropertiesPerson person = new PropertiesPerson();
    public void generation(Collection<Person> collection, int number) {
        for (int i = 0;i<number;i++){
            collection.add(new Person(person.generationNameReal(),person.password(), person.generationNIckReal()));
        }

    }
}
