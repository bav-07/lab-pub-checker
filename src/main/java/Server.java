import java.lang.reflect.Array;
import java.util.ArrayList;

public class Server {

    private ArrayList<String> drinkNames;

    public Server(ArrayList<String> drinkNames){
        this.drinkNames = drinkNames;
    }

    public boolean canServeGuest(Guest guest){
        if (guest.getAge() < 19 || guest.getWallet() < 5 || guest.getSobriety() < 50 || guest.getPermissionToEnter() == false || guest.getCurrency() != '£'){
            return false;
        }
        
        if (this.drinkNames.contains(guest.getFavouriteDrink())) {
            return true;
        }
        return false;
    }

    public ArrayList<String> getDrinkNames(){
        return this.drinkNames;
    }

    public void setDrinkNames(ArrayList<String> drinkNames){
        this.drinkNames = drinkNames;
    }

}
