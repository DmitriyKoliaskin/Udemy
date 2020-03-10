public class Lesson2 {

    public static void main(String[] args) {

        byte b1 = 12;
        byte b2 = 0xC;
        byte b3 = 014;
        byte b4 = 0B1100;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 1300;
        short s2 = 0x514;
        short s3 = 02424;
        short s4 = 0B0101_0001_0100;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;
        int i2 = 0x0;
        int i3 = 00;
        int i4 = 0B0;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 123456789L;
        long l2 = 0x75BCD15L;
        long l3 = 0726746425L;
        long l4 = 0B0111_0101_1011_1100_1101_0001_0101L;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        float f1 = 2.12f;
        float f2 = 2.4236534576f;

        System.out.println(f1);
        System.out.println(f2);

        double d1 = 3.124;
        double d2 = 3.5125125;

        System.out.println(d1);
        System.out.println(d2);

        boolean bo1 = false;
        boolean bo2 = true;

        System.out.println(bo1);
        System.out.println(bo2);

        char c1 = 'd';
        char c2 = 12422;
        char c3 = '\u2355';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
