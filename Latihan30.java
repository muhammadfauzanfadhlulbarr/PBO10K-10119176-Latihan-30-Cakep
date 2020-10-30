import java.util.Scanner;
/**
 * Latihan17
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program : Cakep
 */
public class Latihan30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String jawab;
        String normal   = "\u001b[0m";
        String merah    = "\u001b[31m";
        String hijau    = "\u001b[32m";
        String kuning   = "\u001b[33m";
        String biru     = "\u001b[34m";
        String ungu     = "\u001b[35m";
        String birumuda = "\u001b[36m";

        System.out.print(merah + "Kamu " + hijau + "ngerjain sendiri " + kuning + "latihan 17 sampe " + biru + "latihan 30 ini? \nJawab " + merah + "(Yoi/Enggak) : " + normal);
        jawab = input.next();
        jawab = jawab.toUpperCase();
        System.out.println();
        switch (jawab) {
            case ("YOI"):
                System.out.println(merah + "Cakep bener. " + ungu + "Good Job" + normal);
                break;
            case ("ENGGAK"):
                System.out.println(merah + "Tetep cakep sih.\n" + birumuda + "Sing penting paham konsep nya yee.\n" + normal + "Keep the code works dude");
                break;
            default:
                System.out.println(" ");
        }
    }
}

