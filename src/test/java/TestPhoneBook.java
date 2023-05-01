import org.junit.jupiter.api.Test;
import ru.netology.Contact;
import ru.netology.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPhoneBook {

    @Test
    void testNewGroup() {
        // when:
        PhoneBook.newGroup("Friends");
        // then:
        assertTrue(PhoneBook.getMap().containsKey("Friends"));
        assertEquals(0, PhoneBook.getMap().get("Friends").size());
    }

    @Test
    void testAddContactToGroup() {
        // given:
        Contact.newContact("Alice", 123);
        Contact.newContact("Bob", 456);
        Contact.newContact("Charlie", 789);
        // when:
        PhoneBook.newGroup("Friends");
        PhoneBook.addContactToGroup("Friends", 1);
        PhoneBook.addContactToGroup("Friends", 2);
        // then:
        assertTrue(PhoneBook.getMap().containsKey("Friends"));
        assertEquals(2, PhoneBook.getMap().get("Friends").size());
    }

    @Test
    void testPrintGroup() {
        // given:
        Contact.newContact("Alice", 123);
        Contact.newContact("Bob", 456);
        Contact.newContact("Charlie", 789);
        // when:
        PhoneBook.newGroup("Friends");
        PhoneBook.addContactToGroup("Friends", 0);
        PhoneBook.addContactToGroup("Friends", 1);
        PhoneBook.newGroup("Family");
        PhoneBook.addContactToGroup("Family", 2);
        // then:
        assertEquals("\nСписок контактов группы Friends:\n" +
                "Alice 123\n" +
                "Bob 456\n", PhoneBook.printGroup("Friends"));

        assertEquals("\nСписок контактов группы Family:\n" +
                "Charlie 789\n", PhoneBook.printGroup("Family"));
    }
}
