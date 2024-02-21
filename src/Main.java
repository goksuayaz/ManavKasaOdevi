import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;


        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilo = scan.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = scan.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = scan.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = scan.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilo = scan.nextDouble();

        double toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
        System.out.println("Toplam Tutar : " + toplam + " TL");






    }
}