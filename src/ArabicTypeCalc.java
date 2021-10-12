import java.io.IOException;

import static java.lang.Integer.*;

public class ArabicTypeCalc {

    public static void getArabicResult(String[] operands, String operator) throws IOException {
        int operand1 = Integer.parseInt(operands[0]);
        int operand2 = Integer.parseInt(operands[1]);
        if (operand1 < 0 || operand1 > 10 || operand2 < 0 || operand2 > 10) {
            throw new IOException("Допускаются только числа от 0 до 10 включительно");
        }
        switch (operator) {
            case "+" -> System.out.println(operand1 + operand2);
            case "-" -> System.out.println(operand1 - operand2);
            case "*" -> System.out.println(operand1 * operand2);
            case "/" -> {
                if (operand2 == 0) { throw new ArithmeticException("Деление на ноль не допускается"); } else { System.out.println(operand1 / operand2); }
            }
        }
    }
}
