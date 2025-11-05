import java.util.Scanner;

public class SearchNilai19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int panjang = input.nextInt();

        int[] arrNilai = new int[panjang];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari ");
        int key = input.nextInt();

        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1) + "\n");
                break;
            } else{
                System.out.println("\nNilai yang dicari tidak ditemukan\n");
                break;
            }
        }
    }
}
