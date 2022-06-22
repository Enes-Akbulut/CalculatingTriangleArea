import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double kenar1,kenar2,kenar3,cevresi,u,kok;
        System.out.print("1. kenari giriniz= ");

        kenar1 =girdi.nextDouble();
        System.out.print("2. kenari giriniz= ");

        kenar2 =girdi.nextDouble();
        System.out.print("3. kenari giriniz= ");
        kenar3 = girdi.nextDouble();

        u=(kenar1+kenar2+kenar3)/2  ;
        cevresi= 2*u;
        System.out.println(cevresi);
        kok=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        System.out.println("ucgenin alani = " + Math.sqrt(kok));

    }
}
