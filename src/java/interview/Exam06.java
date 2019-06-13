package interview;

/**
 * @author zhangnianlei.
 * @date 2019/6/14.
 * @description 不用new 不能改变person类，创建person类并打印
 */
public class Exam06 {
    public static void main(String[] args) {
        try {
            Class<?> class1 = Class.forName("interview.Person06");
            Person06 person = (Person06) class1.newInstance();
            person.setName("zja");
            System.out.println(person.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
