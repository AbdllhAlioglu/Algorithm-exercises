import java.util.Scanner;

public class Problem7 {

    // İki Sayı Arasındaki Sayıları Belirli Bir Adım Miktarına Göre Toplama

    public static void main(String[] args) {

        int toplam= 0;
        Scanner scn = new Scanner(System.in);

        System.out.print("Başlangıç Sayısını Giriniz : ");
        int baslangic= scn.nextInt();

        System.out.print("Bitiş Sayısını Giriniz : ");
        int bitis = scn.nextInt();

        System.out.print("Adım Sayısını Giriniz : ");
        int adim = scn.nextInt();
        
        int i ;
        for (i=baslangic ; i <=bitis ; i+=adim ){
            toplam += i;
        }

        System.out.println("Sayılar Toplamı : " + toplam);






    }

}
