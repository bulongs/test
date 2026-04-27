// 这个文件是第 1 章练习题的参考答案。
public class PracticeAnswers {
    // main 方法里集中调用下面的练习方法，方便一次运行看到所有结果。
    public static void main(String[] args) {
        printProfile();
        checkScore(88);
        printWeekday(5);
        System.out.println("1 到 100 的和：" + sumFromOneToHundred());
        System.out.println("最大值：" + maxInArray(new int[] {12, 30, 8, 99, 45}));
        checkLanguage("Java");
        System.out.println("两个数中更大的是：" + max(10, 20));
    }

    // 练习 1：定义变量并输出个人信息。
    public static void printProfile() {
        String name = "小明";
        int age = 18;
        double height = 1.75;
        boolean isStudent = true;

        System.out.println("我叫" + name + "，今年" + age + "岁，身高" + height + "米，是否学生：" + isStudent);
    }

    /**
     * 根据分数输出等级。
     *
     * @param score 分数
     */
    public static void checkScore(int score) {
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("继续努力");
        }
    }

    /**
     * 根据数字输出星期。
     *
     * @param day 1 到 7 表示星期一到星期日
     */
    public static void printWeekday(int day) {
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("未知日期");
        }
    }

    /**
     * 计算 1 到 100 的和。
     *
     * @return 1 到 100 累加后的结果
     */
    public static int sumFromOneToHundred() {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    /**
     * 找出数组中的最大值。
     *
     * @param numbers 整数数组
     * @return 数组里的最大数字
     */
    public static int maxInArray(int[] numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    /**
     * 判断当前学习语言是否是 Java。
     *
     * @param language 语言名称
     */
    public static void checkLanguage(String language) {
        if (language.equals("Java")) {
            System.out.println("正在学习 Java");
        } else {
            System.out.println("继续加油");
        }
    }

    /**
     * 返回两个整数中更大的那个。
     *
     * @param a 第一个整数
     * @param b 第二个整数
     * @return 更大的整数
     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }
}
