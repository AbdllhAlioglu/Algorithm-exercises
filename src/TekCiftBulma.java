import java.util.Scanner;

public class TekCiftBulma {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Sayıyı Girin");

            int s1 = scn.nextInt();
            if (s1 % 2 == 0) {
                System.out.println(s1 + " çift sayıdır");
            }
            else
                System.out.println(s1 + " tek sayıdır");


        }







    }
}
