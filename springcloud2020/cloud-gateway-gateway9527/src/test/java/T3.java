import java.time.ZonedDateTime;

/**
 * @Author ZL
 * @Date 2020/5/25 17:45
 * @Version 1.0
 */
public class T3 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
        //2020-05-25T19:02:04.293+08:00[Asia/Shanghai]
    }
}
