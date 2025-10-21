import java.util.Scanner;

public class kelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS : ");
        double uts1 = input.nextInt();
        System.out.print("Nilai UAS  : ");
        double uas1 = input.nextInt();
        System.out.print("Nilai Tugas  : ");
        double tugas1 = input.nextInt();
        double akhir1 = (uts1 * 0.3 + uas1 * 0.4 + tugas1 * 0.3);

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS : ");
        double uts2 = input.nextInt();
        System.out.print("Nilai UAS  : ");
        double uas2 = input.nextInt();
        System.out.print("Nilai Tugas  : ");
        double tugas2 = input.nextInt();
        double akhir2 = (uts2 * 0.3 + uas2 * 0.4 + tugas2 * 0.3);

        System.out.println("\n===== HASIL PENILAIAN AKADEMIK =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);

        System.out.println("\nRaport Nilai Kuliah");
        System.out.println("Algoritma Pemrograman");
        System.out.println("    UTS   : " + uts1);
        System.out.println("    UAS   : " + uas1);
        System.out.println("    TUGAS : " + tugas1);
        System.out.printf("    Nilai Akhir  : %.2f\n", akhir1);

        if (akhir1 >= 80) {
            String huruf = "A";
            System.out.println("    Nilai huruf : " + huruf);
        } else if (akhir1 >= 73) {
            String huruf = "B+";
            System.out.println("    Nilai huruf : " + huruf);
        } else if (akhir1 >= 65) {
            String huruf = "B";
            System.out.println("    Nilai huruf : " + huruf);
        } else if (akhir1 >= 60) {
            String huruf = "C+";
            System.out.println("    Nilai huruf : " + huruf);
        } else if (akhir1 >= 50) {
            String huruf = "C";
            System.out.println("    Nilai huruf : " + huruf);
        } else if (akhir1 >= 39) {
            String huruf = "D";
            System.out.println("    Nilai huruf : " + huruf);
        } else {
            String huruf = "E";
            System.out.println("    Nilai huruf : " + huruf);
        }

        String status1;
        if (akhir1 >= 60) {
            status1 = "LULUS";
            System.out.println("    Status : " + status1);
        } else {
            status1 = "TIDAK LULUS";
            System.out.println("    Status : " + status1);
        }

        System.out.println("\nStruktur Data");
        System.out.println("    UTS   : " + uts2);
        System.out.println("    UAS   : " + uas2);
        System.out.println("    TUGAS : " + tugas2);
        System.out.printf("    Nilai Akhir  : %.2f\n", akhir2);

        if (akhir2 >= 80) {
            String huruf = "A";
            System.out.println("    Nilai huruf : " + huruf);
        } else if (akhir2 >= 73) {
            String huruf = "B+";
            System.out.println("    Nilai huruf : " + huruf);
        } else if (akhir2 >= 65) {
            String huruf = "B";
            System.out.println("    Nilai huruf : " + huruf);
        } else if (akhir2 >= 60) {
            String huruf = "C+";
            System.out.println("    Nilai huruf : " + huruf);
        } else if (akhir2 >= 50) {
            String huruf = "C";
            System.out.println("    Nilai huruf : " + huruf);
        } else if (akhir2 >= 39) {
            String huruf = "D";
            System.out.println("    Nilai huruf : " + huruf);
        } else {
            String huruf = "E";
            System.out.println("    Nilai huruf : " + huruf);
        }

        String status2;
        if (akhir2 >= 60) {
            status2 = "LULUS";
            System.out.println("    Status : " + status2);
        } else {
            status2 = "TIDAK LULUS";
            System.out.println("    Status : " + status2);
        }

        Double avg = (akhir1 + akhir2) / 2;

        System.out.printf("\n\nRata rata: %.2f\n", avg);

        if ((status1.equals("LULUS")) && (status2.equals("LULUS"))) {
            if (avg >= 70) {
                System.out.println("ANDA LULUS SEMESTER INI");
            } else {
                System.out.println("ANDA TIDAK LULUS SEMESTER INI");
            }
        } else {
            System.out.println("ANDA TIDAK LULUS SEMESTER INI");
        }

        input.close();
    }
}