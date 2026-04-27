import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 这个示例演示时间日期、异常处理和文件读写。
public class DateExceptionFileDemo {
    public static void main(String[] args) {
        // LocalDateTime.now 获取当前日期和时间。
        LocalDateTime now = LocalDateTime.now();
        // DateTimeFormatter 用来指定时间显示格式。
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间：" + now.format(formatter));

        divide(10, 0);
        writeAndReadNote();
    }

    /**
     * 做除法运算，并演示 try-catch 捕获异常。
     *
     * @param a 被除数
     * @param b 除数
     */
    public static void divide(int a, int b) {
        try {
            System.out.println("结果：" + (a / b));
        } catch (ArithmeticException e) {
            // 如果 b 是 0，就会进入 catch，不会让程序直接崩掉。
            System.out.println("除数不能为 0");
        }
    }

    // 把一句话写入文件，再从文件里读出来。
    public static void writeAndReadNote() {
        Path path = Path.of("java-learning-note.txt");

        try {
            // 写入文本文件。
            Files.writeString(path, "今天学习了 Java 常用 API");
            // 读取文本文件。
            String content = Files.readString(path);
            System.out.println("文件内容：" + content);
        } catch (IOException e) {
            System.out.println("文件读写失败：" + e.getMessage());
        }
    }
}
