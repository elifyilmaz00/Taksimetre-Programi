import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km;
        double tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("KM değerini giriniz: ");
        km= input.nextInt();

        //açılış ücreti 10 TL, 20 TL'den fazla tutar varsa KM başına 2.20 TL. 20 TL'Den az tuttu ise 20 TL
        tutar=((km<=5)? 20: km*2.20+10);

        System.out.println("Toplam tutar: "+tutar);











        }
    }
