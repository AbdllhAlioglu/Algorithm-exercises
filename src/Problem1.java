import java.util.Scanner;

public class Problem1 {

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

        Problem1 problem1 = new Problem1();

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

                case (1): problem1.toplama(s1,s2);
                break;
                case (2): problem1.cikarma(s1,s2);
                break;
                case (3): problem1.carpma(s1,s2);
                break;
                case (4): problem1.bolme(s1,s2);
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









