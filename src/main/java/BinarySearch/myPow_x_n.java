package BinarySearch;

/**
 * Created by LiuCui on 2020/12/7
 * 折半计算
 */
public class myPow_x_n {
    public double myPow(double x, int n) {
        double res = 1.0;
        for (int i = n; i != 0; i = i / 2) {
            if (i % 2 != 0) {
                res = res * x;
            }
            x = x * x;
        }
        return n < 0 ? 1 / res : res;
    }
}
