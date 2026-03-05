package cau2;

import java.util.Scanner;

public class Main {
    //Quản lí phương tiện bằng map và tìm kiếm
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập input: ");
        String input = sc.nextLine();
        Manager vehical=new Manager();
        vehical.add(input);
        vehical.display();
        System.out.print("Nhập phương tiện muốn tìm kiếm: ");
        String search = sc.nextLine();
        search=search.toLowerCase().trim().replaceAll("\\s+"," ");
        vehical.search(search);
    }
}
