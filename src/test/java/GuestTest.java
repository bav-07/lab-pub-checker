import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GuestTest {

    Guest guest;

    @BeforeEach
    public void setUp(){
        guest = new Guest(
                "John",
                24);
    }

    @Test
    public void hasName(){
        assertThat(guest.getName()).isEqualTo("John");
    }

    @Test
    public void canSetName(){
        guest.setName("Dave");
        assertThat(guest.getName()).isEqualTo("Dave");
    }
}
