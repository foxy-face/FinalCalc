import java.io.IOException;

public class Operator {
    public static String getOperator(String str) throws IOException {
        String operator = str.replaceAll("[^*/+-]", "");
        return operator;
    }
}
