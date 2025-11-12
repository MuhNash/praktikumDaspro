import java.util.Scanner;

public class TugasTeori19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int surve[][] = new int[10][6];
        double total_res = 0;
        double total_per = 0;
        double rata_per;
        double rata_res;
        
        for (int i = 0; i < surve.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            total_per = 0;
            for (int j = 0; j < surve[i].length; j++) {
                System.out.print("  Masukkan Nilai:");
                surve[i][j] = input.nextInt();
                total_per += surve[i][j];
            }
            rata_per = total_per / 6;
            System.out.println("    Rata pertanyaan : " + rata_per);

            total_res += rata_per;
        }

        rata_res = total_res / 10;

        System.out.printf("\n\nRata rata Responden: %.2f\n", rata_res);
        System.out.printf("Rata rata semua responden: %.2f", total_res);
    }
}