package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogTest() {
        String givenName = "name";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        Dog dog = new Dog(null, null, null);

        String speak = dog.speak();

        Assert.assertEquals("bark!", speak);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // Given
        Dog dog = new Dog(null, null, null);
        Date givenBirthDate = new Date(1997-4-16);

        // When
        dog.setBirthDate(givenBirthDate);

        // Then (we expect to get the given name from the cat)
        Date dogBirthDate = dog.getBirthDate();
        Assert.assertEquals(givenBirthDate, dogBirthDate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        dog.eat(food);
        int numberOfMeals = dog.getNumberOfMealsEaten();
        Assert.assertEquals(1,numberOfMeals);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIDTest() {
        //Given
        Dog dog = new Dog(null, null, 6);
        Integer givenID = 6;
        //When
        Integer actualID = dog.getId();
        //Then
        Assert.assertEquals(givenID, actualID);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);
        }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
