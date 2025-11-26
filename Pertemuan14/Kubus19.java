package Pertemuan14;
import java.util.Scanner;

public class Kubus19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t;

        System.out.print("Masukkan Panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        t = input.nextInt();

        int luas = luas(p, l);
        int volume = volume(p, l, t);

        System.out.println("Luas permukaan dari kubus sebesar " + luas + " dan volumenya adalah " + volume);
        
        input.close();
    }

    static int luas(int p, int l){
        int luas = p * l;
        return luas;
    }
    static int volume(int p, int l, int t){
        int volume = luas(p, l) * t;
        return volume;
    }
}
