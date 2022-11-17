import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GuestTest {

    Guest guest;

    @BeforeEach
    public void setUp(){
        guest = new Guest(
                "John",
                24,
                50,
                100,
                true,
                '£');
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

    @Test
    public void hasAge(){
        assertThat(guest.getAge()).isEqualTo(24);
    }

    @Test
    public void canSetAge(){
        guest.setAge(35);
        assertThat(guest.getAge()).isEqualTo(35);
    }

    @Test
    public void hasWallet(){
        assertThat(guest.getWallet()).isEqualTo(50);
    }

    @Test
    public void canSetWallet(){
        guest.setWallet(20);
        assertThat(guest.getWallet()).isEqualTo(20);
    }

    @Test
    public void hasSobriety(){
        assertThat(guest.getSobriety()).isEqualTo(100);
    }

    @Test
    public void canSetSobriety(){
        guest.setSobriety(49);
        assertThat(guest.getSobriety()).isEqualTo(49);
    }

    @Test
    public void hasPermissionToEnter(){
        assertThat(guest.getPermissionToEnter()).isEqualTo(true);
    }

    @Test
    public void canSetPermissionToEnter(){
        guest.setPermissionToEnter(false);
        assertThat(guest.getPermissionToEnter()).isEqualTo(false);
    }
}
