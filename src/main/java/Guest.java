public class Guest {

    // PROPERTIES
    private String name;
    private int age;
    private double wallet;
    private int sobriety;
    private boolean notBanned;
    private char currency;
    private String favouriteDrink;

    // CONSTRUCTOR
    public Guest(String name, int age, double wallet, int sobriety, boolean notBanned, char currency, String favouriteDrink){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
        this.notBanned = notBanned;
        this.currency = currency;
        this.favouriteDrink = favouriteDrink;
    }

    // METHODS
    public boolean guestCanBuy(){
        if (this.wallet >= 5){
            return true;
        }
        return false;
    }

    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getWallet(){
        return this.wallet;
    }
    public void setWallet(double wallet){
        this.wallet = wallet;
    }

    public double getSobriety(){
        return this.sobriety;
    }
    public void setSobriety(int sobriety){
        this.sobriety = sobriety;
    }

    public boolean getPermissionToEnter(){
        return this.notBanned;
    }
    public void setPermissionToEnter(boolean notBanned){
        this.notBanned = notBanned;
    }

    public char getCurrency(){
        return this.currency;
    }
    public void setCurrency(char currency){
        this.currency = currency;
    }

    public String getFavouriteDrink(){
        return this.favouriteDrink;
    }
    public void setFavouriteDrink(String favouriteDrink){
        this.favouriteDrink = favouriteDrink;
    }
}
