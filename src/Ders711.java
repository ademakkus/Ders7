import java.util.Scanner;

public class Ders711 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int sayi = (int) (Math.random() * 15);


        while (true) {

            System.out.println("Bir sayı giriniz :");

            int s1 = sc.nextInt();

            if (s1 > sayi) {
                System.out.println("Girmiş oldugunu sayı büyüktür.");
            } else if (sayi > s1) {
                System.out.println("Girmiş olduğunuz sayı küçüktür");
            } else {
                System.out.println("Sayıyı buldunuz!");
                break;
            }


        }


    }
}
