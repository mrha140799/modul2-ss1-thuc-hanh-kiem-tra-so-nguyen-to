package SS1TH6;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên tố muốn kiểm tra : ");
        int x = scn.nextInt();
        if (isPrime(x) == 1) {
            System.out.println("Số " + x + " là số nguyên tố");
        }else {
            System.out.println("Số " + x + " không phải là số nguyên tố");

        }
    }
    public static  int isPrime (int x) {
        int dem = 0;
        for (int i = 2 ; i <= Math.sqrt(x) ; i++) {
            if (x % i  == 0) {
                dem++;
            }
        }
        if (dem == 0 || x ==2) {
            return 1;
        }else {
            return 0;
        }
    }


}
