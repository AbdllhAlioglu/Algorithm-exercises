import java.util.Scanner;

public class Problem5 {

    static void kareCevre(double a) {
        double cevre = 4 * a;
        System.out.println("Çevre = " + cevre);
    }

    static void kareAlan(double a) {
        double alan = Math.pow(a, 1);
        System.out.println("Alan = " + alan);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Karenin kenar uzunluğnu girin");

        double kenar = scn.nextInt();

        System.out.println("1 Alan\n2 Çevre");

        int islem1 = scn.nextInt();

        if (islem1 == 1) {
            kareAlan(kenar);
        } else if (islem1 == 2) {
            kareCevre(kenar);
        }


    }
}
