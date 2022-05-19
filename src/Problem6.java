import java.util.Random;

public class Problem6 {

    // 2.Dereceden Bir Denklemin köklerini Hesaplama
    //ax²+bx+c
    public static void main(String[] args) {

        Random rnd = new Random();

        int a = rnd.nextInt(10);
        int b = rnd.nextInt(10);
        int c = rnd.nextInt(10);

        System.out.println("Örnek Denklem : " + "ax²+bx+c");
        System.out.println("****************************");
        System.out.println("Denklem : " + a + "x²" + "+" + b + "x " + "+" + c );

        double diskriminant = (Math.pow(b,2)-4*a*c);
        double kok1 = (((-(b) + Math.sqrt(diskriminant))) / (2*a) );
        double kok2 =  (((-(b) - Math.sqrt(diskriminant))) / (2*a) );

        if (diskriminant > 0){

            System.out.println("Denklemin 2 adet kökü vardır.");
            System.out.println("1.Kök = " + kok1);
            System.out.println("2.Kök = " + kok2);


        }
        else if (diskriminant==0){

            System.out.println("Denklemin 1 adet kökü vardır.");
            System.out.println("Kök = " + kok1);
        }
        else if (diskriminant < 0){

            System.out.println("Denklemin reel kökü yoktur.");

        }

    }
}
