import java.util.Arrays;
import java.util.Random;

public class Problem13 {

    // karşılıklı iki diziyi toplama

    public static void main(String[] args) {
        int[] A = new int[10];
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            int sayi = rnd.nextInt(20);
            A[i] = sayi;
        }

        System.out.println(Arrays.toString(A));
        System.out.println("***********************************");
        int[] B = new int[10];
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            int sayi = rnd.nextInt(20);
            B[i] = sayi;
        }
        System.out.println(Arrays.toString(B));
        System.out.println("***********************************");
        int[] C = new int[A.length];

        for (int i = 0 ; i<A.length;i++){
            C[i] = A[i] + B[i];
        }

        System.out.println("\t A + B = C ");

        for (int i = 0 ;i<A.length;i++){

            System.out.println("\t" + A[i] + "+" + B[i]+ "="+ C[i] );

        }

    }

}
