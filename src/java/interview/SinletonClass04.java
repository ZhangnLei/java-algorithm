package interview;

/**
 * @author zhangnianlei.
 * @date 2019/6/14.
 * @description
 */
public class SinletonClass04 {
    private static SinletonClass04 sinletonClass04 = new SinletonClass04();

    private SinletonClass04(){}

    public static SinletonClass04 getInstance(){
        return sinletonClass04;
    }
}
