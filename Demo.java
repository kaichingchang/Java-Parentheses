/*
 *《程式語言教學誌》的範例程式
 * http://kaiching.org/
 * 檔名：Demo.java
 * 功能：示範小括弧、逗號與分號
 * 作者：張凱慶
 */

public class Demo {
    public static void main(String[] args) {
        //宣告變數
        int v1, v2, n;
        v1 = 100; v2 = 200;

        //while陳述
        while (v1 > 0) {
            v2++;
            v1--;
        }

        //計算印出結果
        n = (v1 + 100 * (2 + 250)) * v2 / 10;
        System.out.printf("%d\n", n);
        n = (v1 + 100 * 2 + 250) * v2 / 10;
        System.out.printf("%d\n", n);
        n = v1 + 100 * 2 + 250 * v2 / 10;
        System.out.printf("%d\n", n);
    }
}
