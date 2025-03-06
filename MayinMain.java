import java.util.Scanner;

public class MayinMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, column;
        System.out.println("Mayin Tarlasi Oyununa Hoşgelinz!!");
        System.out.println("Oynamak istediginiz boyutlari giriniz!!");
        System.out.print("Satir sayisi: ");
        row = scan.nextInt();
        System.out.print("Sutun sayisi: ");
        column = scan.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row, column);
        mayin.run();
    }
}
