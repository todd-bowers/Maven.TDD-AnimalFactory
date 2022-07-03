package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Sophie";

        // When (a cat's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the cat)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //Given (a cat that speaks)
        Cat cat = new Cat(null, null, null);
        //When
        cat.speak();
        //Then
        String speak = cat.speak();
        Assert.assertEquals(speak, "meow!");

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        Date givenBirthDate = new Date(1997-4-16);

        // When
        cat.setBirthDate(givenBirthDate);

        // Then (we expect to get the given name from the cat)
        Date catBirthDate = cat.getBirthDate();
        Assert.assertEquals(givenBirthDate, catBirthDate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        //Given
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        //When
        cat.eat(food);
        //Then
        int numberOfMeals = cat.getNumberOfMealsEaten();
        Assert.assertEquals(1, numberOfMeals);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIDTest() {
        //Given
        Cat cat = new Cat(null, null, 6);
        Integer givenID = 6;
        //When
        Integer actualID = cat.getId();
        //Then
        Assert.assertEquals(givenID, actualID);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        Mammal mammal = new Mammal(null, null, null) {
            @Override
            public String speak() {
                return null;
            }
        };
        Assert.assertTrue(mammal instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        Cat cat = new Cat(null, null, null);
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
