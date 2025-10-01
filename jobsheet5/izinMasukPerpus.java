import java.util.Scanner;

public class izinMasukPerpus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean ktm;
        boolean online;

        System.out.println("Apakah membawa KTM? (true/false)");
        ktm = input.nextBoolean();
        System.out.println("Apakah registrasi online? (true/false)");
        online = input.nextBoolean();

        if (ktm || online) {
            System.out.println("Silahkan masuk.");
        } else{
            System.out.println("Dilarang Masuk");
        }
    }
}