import java.util.Scanner; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
                int speed = Integer.valueOf(scanner.nextLine());

                if(speed >= 120) {
                    System.out.println("Speeding ticket!");
                }
    }
}