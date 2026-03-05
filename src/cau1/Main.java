package cau1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Quản lí điểm của sinh viên bằng List và Set
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số lượng điểm của sinh viên: ");
        int n = Integer.parseInt(in.nextLine());
        if (n <= 0) {
            System.out.println("Số lượng không hợp lệ");
        } else {
            Manager score = new Manager();
            for (int i = 0; i < n; i++) {
                do {
                    int index=i+1;
                    System.out.print("Nhập điểm của sinh viên thứ " + index + ": ");
                    double x=Double.parseDouble(in.nextLine());
                    if(x>=0&&x<=10){
                        score.addScore(x);
                        break;
                    }else{
                        System.out.println("Điểm không hợp lê, vui lòng nhập lại...");
                    }

                }while(true);
            }

            score.findMaxMin();
            score.sumAvg();
            score.unique();
            score.countExcellent();

        }
    }

}
