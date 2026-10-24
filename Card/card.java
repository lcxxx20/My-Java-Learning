package kapian;

public abstract class card {
    private String name;
    private double money;
    public abstract void pay(double xiaofei);
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getMoney(double money){
        return money;
    }
    public void setMoney(double money){
        this.money=money;
    }
}
