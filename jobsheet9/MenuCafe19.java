import java.util.Scanner;

public class MenuCafe19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu[] = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice",};

        System.out.print("Menu apa yang akan dicari? ");
        String cari = input.nextLine();
        for (int i = 0; i < menu.length; i++) {
            if (cari.equalsIgnoreCase(menu[i])) {
                System.out.println("Menu makanan tersedia");
                break;
            } else{
                System.out.println("Menu tidak ditemukan");
                break;
            }
        }
    }
}
