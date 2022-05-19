import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int toplam = 0 ;

        System.out.println("Sayı Giriniz : ");
        int sayi = scn.nextInt();

       while (sayi!=0){
           toplam+=sayi%10;
           sayi/=10;
       }
        System.out.println("Rakamlar Toplamı : " + toplam);



    }


}
