import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {

    // Klavyeden Alınan Sayıları Bir diziye Aktarma

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int sayilar[] = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.println((i + 1) + ". sayıyı giriniz : ");

            sayilar[i] = scn.nextInt();


        }

        System.out.println(Arrays.toString(sayilar));


    }


}
