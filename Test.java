import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        String rs = "chia 4\r\n" + //
                "tayuta 5";

        // 定义爬取规则 ，（目前还只是字符串）
        String regex = "([a-zA-Z]{1,20})" + "|(\\d{1})|";

        // 把这个爬取编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        // 得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(rs);

        // 每找到一个允许循环
        while(matcher.find()){
            String rs1 = matcher.group();
            System.out.println("re1: " + rs1);
        }

    }
}