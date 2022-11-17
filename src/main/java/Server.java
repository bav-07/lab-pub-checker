import java.lang.reflect.Array;
import java.util.ArrayList;

public class Server {

    private ArrayList<String> drinkNames;

    public Server(){

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
        return true;
    }

}
