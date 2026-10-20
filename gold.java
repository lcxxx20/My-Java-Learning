package kapian;

public class gold extends card {
    private static double money=10000;
    public void pay(double xiaofei){
        money=money-0.8*xiaofei;
    }
    public double getMoney(double m){
        pay(m);
        return money;
    }
}
