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
                8,
                100,
                true,
                '£',
                "Fanta");
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void onlyServesToOver18s(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
        guest.setAge(12);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void onlyServesIfGuestHasEnoughMoney(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
        guest.setWallet(4.99);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void onlyServesIfSoberEnough(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
        guest.setSobriety(49);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void onlyServesIfNotBanned(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
        guest.setPermissionToEnter(false);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void onlyServesIfCurrencyIsLocal(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
        guest.setCurrency('$');
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)
    @Test
    public void onlyServesIfFavouriteDrinkAvailable(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
        guest.setFavouriteDrink("Red Bull");
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    @Test
    public void guestWalletOnlyDecrementedIfDrinkBought(){
        server.guestBuyDrink(guest);
        assertThat(guest.getWallet()).isEqualTo(3);
        server.guestBuyDrink(guest);
        assertThat(guest.getWallet()).isEqualTo(3);
    }

    // GETTER & SETTER TEST
    // Removed Getter test, because setter test already incorporates testing of getDrinkNames()
    @Test
    public void canGetAndSetDrinkNames(){
        ArrayList<String> newDrinkNames = new ArrayList<>();
        newDrinkNames.add("7Up");
        newDrinkNames.add("Lucozade");
        newDrinkNames.add("Red Bull");
        server.setDrinkNames(newDrinkNames);
        assertThat(server.getDrinkNames().get(0)).isEqualTo("7Up");
        assertThat(server.getDrinkNames().get(1)).isEqualTo("Lucozade");
        assertThat(server.getDrinkNames().get(2)).isEqualTo("Red Bull");
    }

}
