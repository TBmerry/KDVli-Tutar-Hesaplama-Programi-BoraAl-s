import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*Calculating the value of the money received from the user with the KDV value in Java
       price without KDV= 10
       price with KDV= 11.8
       KDV amount= 1.8
        */
        double tutar, kdvOrani = 0.18, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ücret tutarınızı giriniz : ");
        tutar = input.nextDouble();
        kdvTutar= tutar * kdvOrani;
        System.out.println("eklenecek kdv tutarı : " + kdvTutar);
        kdvliTutar = tutar + kdvTutar;
        System.out.println(kdvliTutar);






    }
}