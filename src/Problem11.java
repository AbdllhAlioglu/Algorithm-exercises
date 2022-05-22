import java.util.Scanner;

public class Problem11 {

    //Dizi elemanlarının kat sayı ile çarpımı

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double eskiMaas[] = {5000, 6200, 2000, 10000, 7500, 8200};

        double yeniMaas[] = new double[6];

        System.out.println("Zam oranını giriniz");

        double katSayi = scn.nextDouble();

        for (int i = 0; i < 6; i++) {

            yeniMaas[i] = eskiMaas[i] * katSayi;

        }

        System.out.println("Eski Maaş \t\t Yeni Maaş \t\t Zam");

        for (int i = 0; i <6; i++) {

            System.out.println(eskiMaas[i] + " TL" + "\t\t" + yeniMaas[i] + " TL" + "\t\t" + (yeniMaas[i] - eskiMaas[i]) + " TL");


        }

    }

}
