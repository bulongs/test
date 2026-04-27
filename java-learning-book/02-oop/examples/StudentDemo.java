// 这个示例演示类、对象、构造方法、封装和 setter 方法。
public class StudentDemo {
    // 程序入口。
    public static void main(String[] args) {
        // new OopStudent(...) 表示创建一个学生对象。
        OopStudent student = new OopStudent("小明", 18, 92);
        student.showInfo();

        // 通过方法修改分数，而不是直接修改属性，这就是封装的用法。
        student.setScore(96);
        student.showInfo();
    }
}

// OopStudent 是一个学生类，用来描述学生这种对象。
class OopStudent {
    // private 表示私有属性，只能在当前类内部直接访问。
    private String name;
    private int age;
    private int score;

    // 构造方法：创建对象时自动执行，用来初始化属性。
    public OopStudent(String name, int age, int score) {
        // this.name 表示当前对象的 name 属性。
        this.name = name;
        this.age = age;
        // 这里调用 setScore，可以复用分数校验逻辑。
        setScore(score);
    }

    // 普通方法：输出当前学生的信息。
    public void showInfo() {
        System.out.println(name + "，年龄：" + age + "，分数：" + score);
    }

    /**
     * 修改学生分数。
     *
     * @param score 新分数，范围应该是 0 到 100
     */
    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("分数不合法");
            // return 可以提前结束方法。
            return;
        }

        this.score = score;
    }
}
