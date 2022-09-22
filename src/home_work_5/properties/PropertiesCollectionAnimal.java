package home_work_5.properties;

import home_work_5.dto.Animal;

import java.util.Collection;

public class PropertiesCollectionAnimal {
    PropertiesAnimal animal = new PropertiesAnimal();
    public void generation(Collection<Animal> collection, int number) {
        for (int i = 0;i<number;i++){
            collection.add(new Animal(animal.generationNIckReal(), animal.ageAdd()));
        }

    }
}
