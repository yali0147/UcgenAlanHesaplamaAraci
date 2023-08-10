import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Üçgen Alan Hesaplama Aracı");


        double a , b ,c ,d ,u ;

        Scanner inp =new Scanner(System.in);

        System.out.print("1. kenarı giriniz : ");
        a = inp.nextDouble();
        System.out.print("2. kenarı giriniz : ");
        b = inp.nextDouble();
        System.out.print("3. kenarı giriniz : ");
        c = inp.nextDouble();

        u= (a+b+c)/2;
        d= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı : " +d );








    }
}