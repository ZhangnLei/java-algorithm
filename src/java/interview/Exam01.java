package interview;

/**
 * @author zhangnianlei.
 * @date 2019/6/12.
 * @description 十进制与十六进制互转
 */
public class Exam01 {
    public static void main(String[] args) {
        int a = 12345;
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.parseInt("8c", 16));
    }

}
