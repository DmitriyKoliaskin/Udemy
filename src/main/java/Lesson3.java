public class Lesson3 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        int a = 5;
        int b = 8;

        double d1 = 5.5;
        double d2 = 1.3;

        long l = 20L;

        double result = 0;

        result = i2 / d1 + d2 % i1 - l;

        int c = a-- - --a + ++a + a++ + a;
        int d = ++b - b++ + ++b - --b;

        System.out.println(result);
        System.out.println(c);
        System.out.println(d);
    }
}