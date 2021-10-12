import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = Input.cleanInput();
        String[] operands = Operands.getOperands(str);
        String operator = Operator.getOperator(str);

        if (operands[0].replaceAll(" ", "").matches("[0-9]+")
                && operands[1].replaceAll(" ", "").matches("[0-9]+")) {

            ArabicTypeCalc.getArabicResult(operands, operator);
            System.exit(1);
        }
        if (operands[0].replaceAll(" ", " ").matches("[a-zA-Z]+")
                && operands[1].replaceAll(" ", "").matches("[a-zA-Z]+")) {

            RomanTypeCalc.getRomanResult(operands, operator);
            System.exit(1);
        }
        if (true) {
            throw new IOException("Разные системы счисления");
        }
    }
}





