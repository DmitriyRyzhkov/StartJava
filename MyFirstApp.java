import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println(" Написанное однажды, запускается везде - Write once, run anywhere");
        Scanner console = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        System.out.println(console.nextLine());
    }
}
