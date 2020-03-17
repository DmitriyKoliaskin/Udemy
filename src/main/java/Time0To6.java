public class Time0To6 {
    public static void time() {
        A: for (int i = 0; i < 6; i++) {
            B: for (int i1 = 0; i1 < 60; i1++) {
                if (i > 1 && i1 % 10 == 0) {
                    break A;
                }
                for (int i2 = 0; i2 < 60; i2++) {
                    if (i2 * i > i1) {
                        continue B;
                    }
                    System.out.println(i + ":" + i1 + ":" + i2);
                }
            }
        }
    }

    public static void main(String[] args) {
        Time0To6.time();
    }
}
