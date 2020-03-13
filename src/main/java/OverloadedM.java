public class OverloadedM {

    public int sum(int i5, int a5, int b5, int c5, int d5) {
        return sum(i5, a5, b5, c5) + d5;
    }

    public int sum(int i4, int a4, int b4, int c4) {
        return sum(i4, a4, b4) + c4;
    }

    public int sum(int i3, int a3, int b3) {
        return sum(i3, a3) + b3;
    }

    public int sum(int i2, int a2) {
        return sum(i2) + a2;
    }

    public int sum(int i1) {
        return i1;
    }
}
