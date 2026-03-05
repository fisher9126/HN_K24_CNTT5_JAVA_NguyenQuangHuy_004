package cau3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    // Kiểm tra chuỗi đối xứng Palindrome bằng Stack
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack=new Stack<>();
        System.out.print("Nhập chuỗi để kiểm tra: ");
        String input=sc.nextLine();
        input=input.toLowerCase().trim().replaceAll("\\s+","");
        if(input.length()==0){
            System.out.println("Chuỗi rỗng...");
        }
        int count=0;
        for(int i=0;i<input.length();i++){
            if((input.charAt(i)>='a'&&input.charAt(i)<='z')||(input.charAt(i)>='0'&&input.charAt(i)<='9')){
                count++;
                stack.push(input.charAt(i));
            }else{
                continue;
            }
        }
        if(count==0){
            System.out.println("Chuỗi không hợp lệ...");
        }else{
            int flag=0;
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)==stack.pop()){
                    continue;
                }else{
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }


    }
}
