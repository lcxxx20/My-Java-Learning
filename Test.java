import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        InputStream is=new FileInputStream("modul2\\src\\apple");
        System.out.println("请输入你一次性想要读取的字节数");
        int x=sc.nextInt();
        byte[] buffer=new byte[x];
        int len=is.read(buffer);
        System.out.println("一次性读取了"+len+"个字节");
        System.out.println(new String(buffer,0,len));
        is.close();
    }
}
