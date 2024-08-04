import org.example.DeluxeBurger;
import org.example.Hamburger;
import org.example.HealthyBurger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.reflect.Field;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {
    Hamburger hamburger;
    HealthyBurger healthyBurger;
    DeluxeBurger deluxeBurger;

    @BeforeEach
    void setUp() {
        hamburger = new Hamburger("Basic", "NORMAL", 4, "WRAP");
        healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");
        deluxeBurger = new DeluxeBurger();
    }

    @DisplayName("Hamburger sınıfı doğru Access Modifierlara sahip mi")
    @Test
    public void testHamburgerAccessModifiers() throws NoSuchFieldException {
        Field nameField = hamburger.getClass().getDeclaredField("name");
        Field meatField = hamburger.getClass().getDeclaredField("meat");
        Field priceField = hamburger.getClass().getDeclaredField("price");

        Field addition1NameField = hamburger.getClass().getDeclaredField("addition1Name");
        Field addition1PriceField = hamburger.getClass().getDeclaredField("addition1Price");

        Field addition2NameField = hamburger.getClass().getDeclaredField("addition2Name");
        Field addition2PriceField = hamburger.getClass().getDeclaredField("addition2Price");

        Field addition3NameField = hamburger.getClass().getDeclaredField("addition3Name");
        Field addition3PriceField = hamburger.getClass().getDeclaredField("addition3Price");

        Field addition4NameField = hamburger.getClass().getDeclaredField("addition4Name");
        Field addition4PriceField = hamburger.getClass().getDeclaredField("addition4Price");

        assertEquals(nameField.getModifiers(), 2);
        assertEquals(meatField.getModifiers(), 2);
        assertEquals(priceField.getModifiers(), 2);

        assertEquals(addition1NameField.getModifiers(), 2);
        assertEquals(addition1PriceField.getModifiers(), 2);

        assertEquals(addition2NameField.getModifiers(), 2);
        assertEquals(addition2PriceField.getModifiers(), 2);

        assertEquals(addition3NameField.getModifiers(), 2);
        assertEquals(addition3PriceField.getModifiers(), 2);

        assertEquals(addition4NameField.getModifiers(), 2);
        assertEquals(addition4PriceField.getModifiers(), 2);
    }


    @DisplayName("Hamburger sınıfı doğru type değerlere sahip mi")
    @Test
    public void testHamburgerInstanceTypes() throws NoSuchFieldException {
        assertThat(hamburger.getName(), instanceOf(String.class));
        assertThat(hamburger.getMeat(), instanceOf(String.class));
        assertThat(hamburger.getPrice(), instanceOf(Double.class));
        assertThat(hamburger.getBreadRollType(), instanceOf(String.class));
    }

    @DisplayName("Hamburger sınıfı addAddition methodları doğru çalışıyor mu?")
    @Test
    public void testHamburgerAddAdditionMethods() throws NoSuchFieldException {
        hamburger.addHamburgerAddition1("test", 3);
        hamburger.addHamburgerAddition2("test", 3);
        hamburger.addHamburgerAddition3("test", 3);
        hamburger.itemizeHamburger();
        assertEquals(hamburger.getPrice(), 13);

    }

    @DisplayName("Deluxe Burger sınıf değişkenleri doğru değerlere sahip mi?")
    @Test
    public void testDeluxeBurgerInstanceVariables() throws NoSuchFieldException {
        assertEquals(deluxeBurger.getCips(), "CURVY");
        assertEquals(deluxeBurger.getDrink(), "COKE");
    }

    @DisplayName("Deluxe Burger sınıfı addAddition methodları doğru çalışıyor mu?")
    @Test
    public void testDeluxeBurgerAddAdditionMethods() throws NoSuchFieldException {
        deluxeBurger.addHamburgerAddition1("test", 3);
        deluxeBurger.addHamburgerAddition2("test", 3);
        deluxeBurger.addHamburgerAddition3("test", 3);
        deluxeBurger.itemizeHamburger();
        assertEquals(deluxeBurger.getPrice(), 19.10);
    }

    @DisplayName("Healthy Burger sınıf değişkenleri doğru değerlere sahip mi?")
    @Test
    public void testHealthyBurgerInstanceVariables() throws NoSuchFieldException {
        assertEquals(healthyBurger.getMeat(), "Tofu");
    }

    @DisplayName("Healthy Burger sınıfı addAddition methodları doğru çalışıyor mu?")
    @Test
    public void testHealthyBurgerAddAdditionMethods() throws NoSuchFieldException {
        healthyBurger.addHealthyAddition1("test", 2);
        healthyBurger.addHealthyAddition2("test", 2);
        healthyBurger.itemizeHamburger();
        assertEquals(healthyBurger.getPrice(), 9.67);
    }

}
