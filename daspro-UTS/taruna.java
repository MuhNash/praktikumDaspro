import java.util.Scanner;

public class taruna{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Penerimaan Taruna: \n");
        System.out.print("Masukkan jenis kelamin(L/P): ");
        String jenisKelamin = input.nextLine();
        System.out.print("Masukkan tinggi badan(CM): ");
        int tinggi = input.nextInt();

        if (jenisKelamin.equalsIgnoreCase("L")) {
            if (tinggi > 165) {
                System.out.println("Anda diterima");
            } else {
            System.out.println("Anda tidak diterima");
        }

        } if (jenisKelamin.equalsIgnoreCase("P")) {
            if (tinggi > 160) {
                System.out.println("Anda diterima");
            } else {
            System.out.println("Anda tidak diterima");
            }
        }
        
        input.close();
    }
}
