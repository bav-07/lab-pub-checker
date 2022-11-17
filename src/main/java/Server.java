import java.lang.reflect.Array;
import java.util.ArrayList;

public class Server {

    private ArrayList<String> drinkNames;

    public Server(ArrayList<String> drinkNames){
        this.drinkNames = drinkNames;
    }

    public boolean canServeGuest(Guest guest){
        if (guest.getAge() < 19 ||
            guest.getWallet() < 5 ||
            guest.getSobriety() < 50 ||
            !guest.getPermissionToEnter() ||
            guest.getCurrency() != '£' ||
            !guest.guestCanBuy()){
            return false;
        }

        if (this.drinkNames.contains(guest.getFavouriteDrink())) {
            return true;
        }
        return false;
    }

    public void guestBuyDrink(Guest guest){
        if (this.canServeGuest(guest)) {
            guest.setWallet(guest.getWallet() - 5);
        }
    }

    public ArrayList<String> getDrinkNames(){
        return this.drinkNames;
    }

    public void setDrinkNames(ArrayList<String> drinkNames){
        this.drinkNames = drinkNames;
    }

}
