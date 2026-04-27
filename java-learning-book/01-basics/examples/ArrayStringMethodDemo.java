// 这个示例演示数组、字符串和方法。
public class ArrayStringMethodDemo {
    // main 方法是程序入口。
    public static void main(String[] args) {
        // int[] 表示整数数组，可以保存多个 int。
        int[] scores = {90, 85, 70, 100, 66};

        // 调用 findMax 方法，把 scores 数组传进去，得到最高分。
        int maxScore = findMax(scores);
        System.out.println("最高分：" + maxScore);

        // 调用 calculateAverage 方法，得到平均分。
        double average = calculateAverage(scores);
        System.out.println("平均分：" + average);

        String language = "Java";
        // String 的常用方法：长度、取字符、转大写。
        System.out.println("字符串长度：" + language.length());
        System.out.println("第一个字符：" + language.charAt(0));
        System.out.println("转成大写：" + language.toUpperCase());

        // 比较字符串内容要用 equals，不建议用 ==。
        if (language.equals("Java")) {
            System.out.println("正在学习 Java");
        }

        // 调用没有返回值的方法，直接执行里面的打印逻辑。
        sayHello("小明");
    }

    /**
     * 找出整数数组里的最大值。
     *
     * @param numbers 要查找的整数数组
     * @return 数组中的最大数字
     */
    public static int findMax(int[] numbers) {
        // 先假设第 1 个数字就是最大值。
        int max = numbers[0];

        // 增强 for 循环：依次取出数组里的每一个数字。
        for (int number : numbers) {
            // 如果发现更大的数字，就更新 max。
            if (number > max) {
                max = number;
            }
        }

        // return 表示把结果返回给调用这个方法的地方。
        return max;
    }

    /**
     * 计算整数数组的平均值。
     *
     * @param numbers 要计算平均值的整数数组
     * @return 平均值
     */
    public static double calculateAverage(int[] numbers) {
        int sum = 0;

        // 把数组里的每个数字累加到 sum 上。
        for (int number : numbers) {
            sum += number;
        }

        // sum * 1.0 是为了让结果变成小数，避免整数除法。
        return sum * 1.0 / numbers.length;
    }

    /**
     * 打印问候语。
     *
     * @param name 要问候的名字
     */
    public static void sayHello(String name) {
        System.out.println("你好，" + name);
    }
}
