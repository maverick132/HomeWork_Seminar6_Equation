import java.util.Map;
import java.util.Scanner;

public class EquationInit extends EquationPrint implements IEquationInit {

    public void initialization(Map<String, char[]> equation) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Решаем уравнение вида q + w = e, где q, w, e >= 0.");
        System.out.println("Неизвестное цифру числа замените ?.");
        System.out.println("Введите число q");
        equation.put("q", sc.next().toCharArray());
        System.out.println("Введите число w");
        equation.put("w", sc.next().toCharArray());
        System.out.println("Введите число e");
        equation.put("e", sc.next().toCharArray());
    }


    public void initializationForTest(Map<String, char[]> equation, String q, String w, String e) {
        Scanner sc = new Scanner(System.in);
        equation.put("q", q.toCharArray());
        equation.put("w", w.toCharArray());
        equation.put("e", e.toCharArray());
    }

}

