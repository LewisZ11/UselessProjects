import java.util.*;

public class prob1 {
    public static void main(String[] args) {
        System.out.println("要输入的内容：");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            System.out.println(x);
        }
        scanner.close();
    }
}
