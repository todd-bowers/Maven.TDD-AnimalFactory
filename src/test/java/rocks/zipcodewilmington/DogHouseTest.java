package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(dog);
        System.out.println(DogHouse.getNumberOfDogs());
        DogHouse.remove(dog);
        Assert.assertEquals((Integer) 0, DogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogByIDTest() {
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(dog);
        System.out.println(DogHouse.getDogById(0));
        DogHouse.remove(0);
        Assert.assertEquals(null, DogHouse.getDogById(0));
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogByNameTest() {
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(dog);
        System.out.println(DogHouse.getDogById(0));
        DogHouse.remove(dog);
        Assert.assertEquals(null, DogHouse.getDogById(0));
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIDTest() {
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        String name2 = "Jeff";
        Date birthDate2 = new Date();
        Dog jeff = AnimalFactory.createDog(name2, birthDate2);
        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.add(jeff);
        System.out.println(DogHouse.getDogById(0));
        Assert.assertEquals(dog, DogHouse.getDogById(0));
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        DogHouse.add(animal);
        int numberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(1, numberOfDogs);
    }
}
