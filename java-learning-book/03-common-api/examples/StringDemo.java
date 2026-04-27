// 这个示例演示 String 的常用方法。
public class StringDemo {
    public static void main(String[] args) {
        String text = " Java,MySQL,Spring Boot ";

        System.out.println("原始内容：" + text);
        // trim 去掉字符串前后的空格。
        System.out.println("去空格：" + text.trim());
        // length 获取字符串长度。
        System.out.println("长度：" + text.length());
        // contains 判断字符串里是否包含某段内容。
        System.out.println("是否包含 Java：" + text.contains("Java"));

        // split 按逗号分割字符串，结果是一个字符串数组。
        String[] skills = text.trim().split(",");
        for (String skill : skills) {
            System.out.println("技能：" + skill);
        }

        String language = "Java";
        // 比较字符串内容要用 equals。
        if (language.equals("Java")) {
            System.out.println("字符串内容相等");
        }
    }
}
