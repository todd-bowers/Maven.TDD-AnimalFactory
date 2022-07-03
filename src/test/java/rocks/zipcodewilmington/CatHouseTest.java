package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        String name = "Sophie";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        CatHouse.add(animal);
        System.out.println(CatHouse.getNumberOfCats());
        CatHouse.remove(animal);
        Assert.assertEquals((Integer) 0, CatHouse.getNumberOfCats());
    }
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetNumberOfCats() {
        String name = "Sophie";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        CatHouse.add(animal);
        int numberOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(1, numberOfCats);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
}
