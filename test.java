package tudien;

import java.util.Scanner;

public class test {
    static Scanner scanner = new Scanner(System.in);
    public static void menu() {
        System.out.println("1 : Add word");
        System.out.println("2 : Remove word");
        System.out.println("3 : Show dictionary");
    }
    public static void main(String[] args) {
        do {            
            TuDien data = new TuDien();
            menu();
            int choice;
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1) {
                System.out.print("Enter key : ");
                String key = scanner.nextLine();
                System.out.print("Enter value : ");
                String value = scanner.nextLine();
                data.themTu(key, value);
            } else if(choice == 2) {
                System.out.print("Enter key : ");
                String key = scanner.nextLine();
                data.xoaTu(key);
            } else if(choice == 3) {
                data.hienThiDanhSach();
            }
        } while (true);
    }
}
