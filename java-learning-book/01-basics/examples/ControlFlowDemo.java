// 这个示例演示 if、switch、for、while 这些流程控制语句。
public class ControlFlowDemo {
    // 程序从 main 方法开始执行。
    public static void main(String[] args) {
        int score = 85;

        // if 用来根据条件选择执行哪一段代码。
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("继续努力");
        }

        int day = 3;

        // switch 适合处理固定选项，比如星期、菜单编号、状态码。
        switch (day) {
            case 1:
                System.out.println("星期一");
                // break 表示当前 case 执行完就跳出 switch。
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

        int sum = 0;
        // for 循环适合“明确知道循环次数”的场景。
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 到 100 的和是：" + sum);

        int count = 1;
        // while 循环适合“满足某个条件就继续执行”的场景。
        while (count <= 5) {
            System.out.println("while count = " + count);
            // 每次循环后加 1，避免条件一直成立导致死循环。
            count++;
        }
    }
}
