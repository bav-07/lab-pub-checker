import java.lang.reflect.Array;
import java.util.ArrayList;

public class Server {

    private ArrayList<String> drinkNames;

    public Server(ArrayList<String> drinkNames){
        this.drinkNames = drinkNames;
    }

    public boolean canServeGuest(Guest guest){
        if (guest.getAge() < 19){
            return false;
        }
        if (guest.getWallet() < 5){
            return false;
        }
        if (guest.getSobriety() < 50){
            return false;
        }
        if (guest.getPermissionToEnter() == false){
            return false;
        }
        if (guest.getCurrency() != '£'){
            return false;
        }
        return true;
    }

}
