import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row,column;
        System.out.println("Mayin Tarlasi Oyununu Hos Geldiniz ! ");
        System.out.println("Lutfen Oynamak Istediginiz boyutlari giriniz !");
        System.out.print("Satir Sayisi : ");
        row = input.nextInt();
        System.out.print("Sutun Sayisi : ");
        column =input.nextInt();


        MineSweeper mine = new MineSweeper(row,column);
        mine.run();




    }
}