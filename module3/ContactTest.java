import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {
    private Contact contact;

    @BeforeEach
    void setUp() {
        contact = new Contact("Alice Smith", "+1 617 555 0101");
    }

    @Test
    void constructor_storesNameAndPhone() {
        assertEquals("Alice Smith", contact.getName());
        assertEquals("+1 617 555 0101", contact.getPhone());
    }

    @Test
    void getName_returnsName() {
        assertEquals("Alice Smith", contact.getName());
    }

    @Test
    void getPhone_returnsPhone() {
        assertEquals("+1 617 555 0101", contact.getPhone());
    }

    @Test
    void toString_formatsContactInformation() {
        assertEquals("Alice Smith | +1 617 555 0101", contact.toString());
    }

    @Test
    void contactWithDifferentValues_keepsValuesSeparate() {
        Contact other = new Contact("Bob Johnson", "+1 212 555 0172");
        assertEquals("Bob Johnson", other.getName());
        assertEquals("+1 212 555 0172", other.getPhone());
        assertNotEquals(contact.getName(), other.getName());
    }

    @Test
    void twoContactsWithSameName_areIndependent() {
        Contact first = new Contact("Sam Lee", "111-222-3333");
        Contact second = new Contact("Sam Lee", "444-555-6666");

        assertEquals("Sam Lee", first.getName());
        assertEquals("Sam Lee", second.getName());
        assertNotEquals(first.getPhone(), second.getPhone());
    }

    @Test
    void toString_handlesInternationalPhoneNumber() {
        Contact international = new Contact("Jane Doe", "+44 20 7946 0958");
        assertEquals("Jane Doe | +44 20 7946 0958", international.toString());
    }
}
