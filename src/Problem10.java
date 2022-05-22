import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {

    // Bir Dizinin Tüm Elmanlarını Toplama

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int dizi[] = new int[5];

        int toplam = 0;

        for (int i = 0; i < dizi.length; i++) {

            System.out.println((i + 1) + ". Sayıyı Giriniz");

            dizi[i] = scn.nextInt();

        }

        System.out.println(Arrays.toString(dizi));


        for (int j = 0; j < dizi.length; j++) {

            toplam += dizi[j];

        }

        System.out.println("Dizi elemanlarının toplamı : " + toplam);

    }
}
