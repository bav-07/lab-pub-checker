public class Guest {

    private String name;
    private int age;
    private double wallet;
    private int sobriety;

    public Guest(String name, int age, double wallet, int sobriety){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
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



}
