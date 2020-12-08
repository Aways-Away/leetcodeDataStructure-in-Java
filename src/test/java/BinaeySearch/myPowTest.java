package BinaeySearch;

import BinarySearch.myPow_x_n;

import java.util.Scanner;

/**
 * Created by LiuCui on 2020/12/7
 */
public class myPowTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input (double) x: ");
        double x = in.nextDouble();
        System.out.println("Input (int) n: ");
        int n = in.nextInt();

        double res = new myPow_x_n().myPow(x, n);
        System.out.println("输出：" + res);
    }
}

