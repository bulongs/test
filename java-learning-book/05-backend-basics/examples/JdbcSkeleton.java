import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// JDBC 示例骨架：演示 Java 连接数据库的大致流程。
// 注意：真正运行前，需要本机有 MySQL、数据库、表、账号密码和 MySQL 驱动。
public class JdbcSkeleton {
    public static void main(String[] args) {
        // 数据库连接地址：localhost 表示本机，3306 是 MySQL 默认端口。
        String url = "jdbc:mysql://localhost:3306/java_learning";
        String username = "root";
        String password = "your_password";

        // ? 是占位符，后面用 statement.setInt(1, 18) 给它传值。
        String sql = "select id, name, age from student where age > ?";

        // try-with-resources 写法：try 结束后会自动关闭连接和语句对象。
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            // 给 SQL 中第 1 个 ? 设置值 18。
            statement.setInt(1, 18);

            // executeQuery 用来执行查询 SQL，返回 ResultSet 结果集。
            try (ResultSet resultSet = statement.executeQuery()) {
                // resultSet.next() 表示移动到下一行数据。
                while (resultSet.next()) {
                    // 根据字段名取出当前行的数据。
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");

                    System.out.println(id + " - " + name + " - " + age);
                }
            }
        } catch (SQLException e) {
            // 数据库连接失败、SQL 写错、表不存在等问题都会进入这里。
            System.out.println("数据库操作失败：" + e.getMessage());
        }
    }
}
