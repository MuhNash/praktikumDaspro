import java.util.Scanner;

public class flowchartTugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan Angka: ");
        angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap ");
        }else{
            System.out.println("Bilangan Ganjil ");
        }
    }
}