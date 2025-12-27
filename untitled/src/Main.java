import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double x = 34.8768;
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
    }
}