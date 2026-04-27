import java.util.ArrayList;
import java.util.Scanner;

// 控制台版学生管理系统。
public class StudentManagerApp {
    // static 表示这两个变量属于类本身，下面的 static 方法都能直接使用。
    // final 表示变量名不能再指向别的对象。
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final ArrayList<ManagedStudent> STUDENTS = new ArrayList<>();

    // main 方法是程序入口。
    public static void main(String[] args) {
        // while (true) 表示一直循环，直到用户选择 0 时 break 退出。
        while (true) {
            printMenu();
            // nextLine 读取用户在控制台输入的一整行内容。
            String choice = SCANNER.nextLine();

            // 根据用户输入的菜单编号，调用不同的方法。
            if ("1".equals(choice)) {
                addStudent();
            } else if ("2".equals(choice)) {
                listStudents();
            } else if ("3".equals(choice)) {
                searchStudent();
            } else if ("4".equals(choice)) {
                deleteStudent();
            } else if ("0".equals(choice)) {
                System.out.println("已退出学生管理系统");
                // break 结束 while 循环，程序就会退出。
                break;
            } else {
                System.out.println("请输入正确的菜单编号");
            }
        }
    }

    // 打印系统菜单。
    private static void printMenu() {
        System.out.println();
        System.out.println("==== 学生管理系统 ====");
        System.out.println("1. 添加学生");
        System.out.println("2. 查看学生");
        System.out.println("3. 查找学生");
        System.out.println("4. 删除学生");
        System.out.println("0. 退出");
        System.out.print("请选择：");
    }

    // 添加学生：从控制台读取姓名、年龄、分数，再放入列表。
    private static void addStudent() {
        System.out.print("请输入姓名：");
        String name = SCANNER.nextLine();

        System.out.print("请输入年龄：");
        // 控制台读到的是字符串，Integer.parseInt 可以把字符串转成 int。
        int age = Integer.parseInt(SCANNER.nextLine());

        System.out.print("请输入分数：");
        int score = Integer.parseInt(SCANNER.nextLine());

        STUDENTS.add(new ManagedStudent(name, age, score));
        System.out.println("添加成功");
    }

    // 查看所有学生。
    private static void listStudents() {
        if (STUDENTS.isEmpty()) {
            System.out.println("暂无学生");
            // return 提前结束方法，后面的循环就不会执行。
            return;
        }

        for (ManagedStudent student : STUDENTS) {
            student.showInfo();
        }
    }

    // 根据姓名查找学生。
    private static void searchStudent() {
        System.out.print("请输入要查找的姓名：");
        String name = SCANNER.nextLine();

        // 遍历列表，一个一个比较姓名。
        for (ManagedStudent student : STUDENTS) {
            if (student.getName().equals(name)) {
                student.showInfo();
                return;
            }
        }

        System.out.println("没有找到该学生");
    }

    // 根据姓名删除学生。
    private static void deleteStudent() {
        System.out.print("请输入要删除的姓名：");
        String name = SCANNER.nextLine();

        // 用普通 for 循环，是因为删除时需要用到下标 i。
        for (int i = 0; i < STUDENTS.size(); i++) {
            if (STUDENTS.get(i).getName().equals(name)) {
                STUDENTS.remove(i);
                System.out.println("删除成功");
                return;
            }
        }

        System.out.println("没有找到该学生");
    }
}

// 学生类：专门用来保存一个学生的数据。
class ManagedStudent {
    // 属性用 private 修饰，外部不能随意修改。
    private String name;
    private int age;
    private int score;

    // 构造方法：创建学生对象时给属性赋值。
    public ManagedStudent(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // getter 方法：外部可以通过它读取学生姓名。
    public String getName() {
        return name;
    }

    // 输出学生信息。
    public void showInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，分数：" + score);
    }
}
