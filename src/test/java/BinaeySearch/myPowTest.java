package BinaeySearch;

import BinarySearch.myPow_x_n;

/**
 * Created by LiuCui on 2020/12/7
 */
public class myPowTest {
    public static void main(String[] args){
        double x=2.10000;
        int n=3;
        double res = new myPow_x_n().myPow(x,n);
        System.out.println("输出："+res);
    }
}

