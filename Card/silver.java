package kapian;

public class silver extends card{
    private static double money=5000;
    public void pay(double xiaofei){
        money=money-0.85*xiaofei;
    }
    public double getMoney(double m){
        pay(m);
        return money;
    }
}
