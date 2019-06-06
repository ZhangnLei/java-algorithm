package javacore;

import sun.security.util.Length;

/**
 * @author zhangnianlei
 * @create 2019/6/6.
 * @description
 * 以下是有关String和StringBuffer类的一些有趣事实：
 * 1。String的对象是不可变的。
 * 2. Java中的String类没有reverse（）方法，但是StringBuilder类内置了reverse（）方法。
 * 3. StringBuilder类没有toCharArray（）方法，而String类确实有toCharArray（）方法
 */
public class StringAndStringBuilder {
    public static void main(String[] args) {
//        stringToCharArray();
//        stringBuilderReverse();
        byteReverse();
    }

    /**
     * 使用string的toCharArray（）方法，翻转一个字符串
     */
    private static void stringToCharArray() {
        String name = new String("zhangnianlei");
        char[] chars = name.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }

    /**
     * 使用翻转字节的方式，翻转一个字符串
     */
    private static void byteReverse() {
        String name = new String("zhangnianlei");
        byte[] nameByte = name.getBytes();
        byte[] result = new byte[nameByte.length];
        for (int i = 0; i < nameByte.length; i++) {
            result[i] = nameByte[nameByte.length - i - 1];
        }
        System.out.println(new String(result));
    }

    /**
     * 使用stringBuilder的reverse（）方法，翻转一个字符串
     */
    private static void stringBuilderReverse() {
        StringBuilder sb = new StringBuilder("zhangnianlei");
        System.out.println(sb.reverse().toString());
    }
}
