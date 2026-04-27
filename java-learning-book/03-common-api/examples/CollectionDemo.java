import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// 这个示例演示 ArrayList、HashMap、HashSet。
public class CollectionDemo {
    public static void main(String[] args) {
        // ArrayList 是可变长度的列表，适合保存一组有顺序的数据。
        ArrayList<String> students = new ArrayList<>();
        students.add("小明");
        students.add("小红");
        students.add("小刚");
        // set 根据下标修改元素。
        students.set(1, "小丽");
        // remove 删除元素。
        students.remove("小刚");

        for (String student : students) {
            System.out.println("学生：" + student);
        }

        // HashMap 保存键值对，这里是“姓名 -> 分数”。
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("小明", 90);
        scores.put("小丽", 95);

        // keySet 可以拿到所有 key，再通过 key 获取对应 value。
        for (String name : scores.keySet()) {
            System.out.println(name + " 的分数是：" + scores.get(name));
        }

        // HashSet 会自动去重，适合保存不重复的数据。
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Java");
        uniqueNames.add("Java");
        uniqueNames.add("MySQL");

        System.out.println("去重后的数量：" + uniqueNames.size());
    }
}
