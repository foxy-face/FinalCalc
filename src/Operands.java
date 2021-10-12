import java.io.IOException;

public class Operands {
    public static String[] getOperands(String str) throws IOException {
        String[] operands = str.split("[/*+-]");
        if (operands.length != 2) {
            throw new IOException("Недопустимый формат арифметической операции: должно быть два операнда и один оператор");
        }
        if ((operands[0].replaceAll("[0-9a-zA-Z]", "").matches("[.,]")) || (operands[1].replaceAll("[0-9a-zA-Z]", "").matches("[.,]"))) {
            throw new IOException("Введите целые числа");
        }
        return operands;
    }
}

