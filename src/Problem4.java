import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("İki tane sayı giriniz : ");

        int s1 = scn.nextInt();
        int s2 = scn.nextInt();

        System.out.println("1.Sayı =" + s1 +" --- "+ " 2.sayı =" +s2);

        if (s1<s2){
            System.out.println("2. sayı büyüktür");
        }
        else if (s1>s2){
            System.out.println("1. sayı büyüktür");
        }
        else
            System.out.println("İki sayı eşittir");


    }


}
