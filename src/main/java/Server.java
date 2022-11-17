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
        return true;
    }

}
