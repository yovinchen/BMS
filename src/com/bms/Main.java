import java.util.Scanner;

public class Main {
    //图书管理系统
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("********图书管理系统*******");
            System.out.println("1.录入书籍信息");
            System.out.println("2.查阅书籍信息");
            System.out.println("3.删除书籍信息");
            System.out.println("4.修改书籍信息");
            System.out.println("5.退出系统");
            System.out.println("*************************");
            int i = scanner.nextInt();
            if (i == 5) {
                System.out.println("感谢使用，再见!");
                break;
            }
        }
    }
}