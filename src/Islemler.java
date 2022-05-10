import java.util.Scanner;

public class Islemler {

    public void toplama(int a , int b){
        int sonuc = (a + b) ;
        System.out.println("Toplama Sonucu =" + sonuc);
    }

    public void cikarma(int a ,int b){
        int sonuc = (a - b);
        System.out.println("Çıkarma Sonucu =" + sonuc);
    }

    public void carpma(int a, int b){
        int sonuc = (a * b);
        System.out.println("Çarpma Sonucu =" + sonuc);
    }

    public void bolme(double a , float b){
        double sonuc = (a/b);
        System.out.println("Bölme Sonucu =" + sonuc);
    }

    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);

        Islemler islemler = new Islemler();

        while (true){
            System.out.println("Lütfen 1. sayıyı  girin");
            int s1 = scn.nextInt();

            System.out.println("Lütfen 2. sayıyı  girin");
            int s2 = scn.nextInt();

            System.out.println( "1-Toplama İşlemi\n" +
                                "2-Çıkarma İşlemi\n" +
                                "3-Çarpma İşlemi\n" +
                                "4-Bölme İşlemi\n" +
                                "5-Çıkış");

            System.out.println("Yapacağınız işlemi seçin");

            int islem= scn.nextInt();

            switch (islem){

                case (1): islemler.toplama(s1,s2);
                break;
                case (2): islemler.cikarma(s1,s2);
                break;
                case (3): islemler.carpma(s1,s2);
                break;
                case (4): islemler.bolme(s1,s2);
                break;
                case (5):
                break;
            }
            if (islem==5){
                break;
            }

                }

            }




        }









