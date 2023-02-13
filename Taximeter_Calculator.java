import java.util.Scanner;
/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */
public class Taximeter_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi KM cinsinden yazınız:");
        double distance = input.nextDouble();
        double taximeter = (distance*2.20);
        int starter = 10;
        double total = (taximeter+starter);
        System.out.println(total <20 ? "20TL" : total+"TL");



    }
}
