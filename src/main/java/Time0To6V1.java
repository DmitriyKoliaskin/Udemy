public class Time0To6V1 {
    public static void time() {
        int hours = 0;
        O: while (hours < 6) {
            int minute = -1;
            M: do {
                minute++;
                if (hours > 1 && minute % 10 == 0) {
                    break O;
                }
                int second = 0;
                while (second < 60) {
                    if (second * hours > minute) {
                        continue M;
                    }
                    System.out.println(hours + ":" + minute + ":" + second);
                    second++;
                }
            } while (minute < 59);
                hours++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
