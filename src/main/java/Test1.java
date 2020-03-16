public class Test1 {

    public double radius;

    public Test1(double radius) {
        this.radius = radius;
    }

    public static double length(double radius) {
        return 2 * Test0.pi * radius;
    }

    public double area(double radius) {
        return Test0.pi * radius * radius;
    }

    public void ae(double radius) {
        System.out.println("Радиус: " + this.radius);
        System.out.println("Площадь: " + area(this.radius));
        System.out.println("Длина: " + Test1.length(this.radius));
    }

    public static void main(String[] args) {
        System.out.println(Test0.mul(1, 2, 3));
        System.out.println(Test0.mul(3, 2, 56));
        Test0.div(5, 2);
        Test0.div(7, 2);
        Test1 test2 = new Test1(Math.random() * 100);
        test2.ae(test2.radius);
    }

}
