import java.util.Scanner;

public class Ders710 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Kelime giriniz :");


        String kelime=scanner.next();


        int i=0;

        boolean polindromMu=true;
        while(i<kelime.length()/2)
        {

            if(kelime.charAt(i)!=kelime.charAt(kelime.length()-1-i)) {
                polindromMu=false;
                break;
            }
            i++;

        }


        if(polindromMu)
            System.out.println("Polindromdur");
        else
            System.out.println("Polindrm degğildir!");


    }



}
