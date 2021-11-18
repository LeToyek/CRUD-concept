import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Database Perpustakaan");
        Scanner in = new Scanner(System.in);
        boolean lanjutkan = true;
        String userChoice;
        while (lanjutkan){
            clearScreen();
            System.out.println("Silahkan pilih menu");
            System.out.println("\n1. Tampilkan data buku");
            System.out.println("2. Cari buku");
            System.out.println("3. Tambahkan buku");
            System.out.println("4. Ubah data buku");
            System.out.println("5. Hapus data buku");

            System.out.print("\npilihan anda : ");
            userChoice = in.next();

            switch (userChoice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.err.println("\nAnda tidak menginputkan (1-5)\nSilahkan input no 1 - 5");
            }

            lanjutkan = getYesOrNo();

        }
    }
    private static Boolean getYesOrNo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Apakah anda ingin melanjutkan ? (y/n)");
        String userChoice = in.next();

        while (!userChoice.equalsIgnoreCase("y")&& !userChoice.equalsIgnoreCase("n")){
            System.out.println("Masukkan input y/n !!!!");
            userChoice = in.next();
        }

        return userChoice.equalsIgnoreCase("y");
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143");
            }
        }catch (Exception e){
            System.out.println("tidak bisa clear screen");
        }
    }
}
