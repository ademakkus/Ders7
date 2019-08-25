public class Ders75 {


    public static void main(String[] args) {


        int satir=20;

        for(int i=0;i<satir;i++)
        {

            int k=i;
            if(i>(satir/2))
                k=satir-1-i;

            for(int j=0;j<k;j++)
            {

                System.out.print(" ");
            }

            System.out.println("*");


        }


    }

}
