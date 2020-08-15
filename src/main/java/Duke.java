import java.util.Scanner;

public class Duke {

    public static void Greet() {
        System.out.println("    ____________________________________________________________");
        System.out.println("     Hello! I'm Duke");
        System.out.println("     What can I do for you?");
        System.out.println("    ____________________________________________________________");
        System.out.println();
    }

    public static void Exit() {
        System.out.println("    ____________________________________________________________");
        System.out.println("     Bye. Hope to see you again soon!");
        System.out.println("    ____________________________________________________________");
    }

    public static void  Echo() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.next();
            if (input.equals("bye")) {
                break;
            } else {
                System.out.println("    ____________________________________________________________");
                System.out.println("     " + input);
                System.out.println("    ____________________________________________________________");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Greet();

        Echo();

        Exit();
    }
}
