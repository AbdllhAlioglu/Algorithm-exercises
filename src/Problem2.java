import java.util.Scanner;

public class Problem2 {
    static void kmMilCevirme(double a){
        double mil = (a * 0.621);
        System.out.println("Mil Uzunluğu = " + mil + " mil");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Km giriniz = ");
        double  km = scn.nextDouble();
        kmMilCevirme(km);



    }
}
