import java.io.IOException;
import java.util.Scanner;

public class Input {

    public static String cleanInput() throws IOException {
        System.out.println("Введите выражение");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replaceAll(" ", "");
        if (str.matches("[0-9]") && str.matches("[a-zA-Z]")) {
            throw new NumberFormatException("Разные системы счисления");
        }
        return str;
    }
}
