/**
 * @Author: xpeng
 * @Date: 2020/5/29 21:13
 * @Description：
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(calSum(10));
    }


    public static int calSum(int n) {
        int sum = 0;
        int i = 1;
        int j = 1;
        // 循环1
        for (int k = 0; k < 1000; k++) {
            sum += k;
        }
        //循环2
        for (int k = 0; k < n; k++) {
            sum += k;
        }
        //循环3
        for (; i <= n; i++) {
            j = 1;
            for (; j <= n; j++) {
                sum += i * j;
            }
        }
        return sum;
    }

    public static void calSum2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += getSum(i);
        }
    }

    public static int getSum(int n) {
        int sum = 0, i = 1;
        for (int j = 0; j < n; j++) {
            while (i < n) {
                sum += i;
                i = i * 3;
            }
        }
        return sum;
    }
}
