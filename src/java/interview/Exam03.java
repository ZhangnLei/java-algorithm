package interview;

import java.io.*;

/**
 * @author zhangnianlei.
 * @date 2019/6/12.
 * @description 读取json文件 jsonarray 读取jsonobject
 */
public class Exam03 {

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/java/interview/exam03.json"));
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line);
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
