public class Guest {

    private String name;
    private int age;
    private double wallet;
    private int sobriety;
    private boolean notBanned

    public Guest(String name, int age, double wallet, int sobriety, boolean notBanned){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
        this.notBanned = notBanned;
    }

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


}
