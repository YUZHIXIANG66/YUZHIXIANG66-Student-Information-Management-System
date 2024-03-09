package code;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        loop: while (true) {
            System.out.println("-------欢迎来到Yu的学生管理系统--------");
            System.out.println("1：添加学生。");
            System.out.println("2：删除学生。");
            System.out.println("3：修改学生。");
            System.out.println("4：查询学生。");
            System.out.println("5：退出。");
            Scanner sc =new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> addStudent();
                case "2" -> delStudent();
                case "3" -> updateStudent();
                case "4" -> queryStudent();
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有该选项！");
            }
        }
    }
    //添加学生
    public static void addStudent(){
        System.out.println("添加学生");
    }
    //删除学生
    public static void delStudent(){
        System.out.println("删除学生");
    }
    //修改学生
    public static void updateStudent(){
        System.out.println("修改学生");
    }
    //查询学生
    public static void queryStudent(){
        System.out.println("查询学生");
    }
    //




}
