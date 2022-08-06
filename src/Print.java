import java.util.Map;

public class EquationPrint implements IEquationPrint {
    public void equationPrint(Map<String, char[]> equation) {
        String q = convertCharToString(equation.get("q"));
        String w = convertCharToString(equation.get("w"));
        String e = convertCharToString(equation.get("e"));
        System.out.println(q + "+" + w + "=" + e);

    }


    public void equationPrint(char[] first, char[] second, char[] res) {
        String q = convertCharToString(first);
        String w = convertCharToString(second);
        String e = convertCharToString(res);
        System.out.println(q + "+" + w + "=" + e);

    }

    public String convertCharToString(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            sb.append(aChar);
        }
        return sb.toString();
    }
}
