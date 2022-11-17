import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    ArrayList<String> drinkNames = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        drinkNames.add("Pepsi");
        drinkNames.add("Fanta");
        drinkNames.add("Coke");
        drinkNames.add("Sprite");
        drinkNames.add("Dr.Pepper");

        server = new Server(drinkNames);
        guest = new Guest(
                "John",
                24,
                50,
                100,
                true,
                '£',
                "Fanta");
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canServeToOver18s(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void doesNotServeToUnder18s(){
        guest.setAge(12);
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void serveIfGuestHasEnoughMoney(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void doesNotServeIfGuestDoesNotHaveEnoughMoney(){
        guest.setWallet(4.99);
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void canServeIfSoberEnough(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void doesNotServeIfDrunk(){
        guest.setSobriety(49);
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void canServeIfNotBanned(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void doesNotGetServedIfBanned(){
        guest.setPermissionToEnter(false);
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void canServeIfCurrencyLocal(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void doesNotGetServedIfCurrencyForeign(){
        guest.setCurrency('$');
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(false);
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
