import java.io.IOException;

public class RomanTypeCalc {

    public static void getRomanResult(String[] operands, String operator) throws IOException{
        int operand1 = RomanToArabic.romanToArabic(operands[0]);
        int operand2 = RomanToArabic.romanToArabic(operands[1]);

        if (operand1 > 10 || operand2 > 10) {
            throw new IOException("Допускаются только числа от 0 до 10 включительно");
        }

        switch (operator) {
            case "+" -> System.out.println(ArabicToRoman.arabicToRoman(operand1 + operand2));
            case "-" -> System.out.println(ArabicToRoman.arabicToRoman(operand1 - operand2));
            case "*" -> System.out.println(ArabicToRoman.arabicToRoman(operand1 * operand2));
            case "/" -> System.out.println(ArabicToRoman.arabicToRoman(operand1 / operand2));
        }
    }
}
