public class CarTest {
    public void changeDoor(Car car, int newDoor) {
        car.setDoor(newDoor);
    }

    public void changeColor(Car car1, Car car2) {
        String c1 = car1.getColor();
        car1.setColor(car2.getColor());
        car2.setColor(c1);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setColor("Yellow");
        car2.setColor("Red");
        CarTest carTest = new CarTest();
        carTest.changeColor(car1, car2);
        carTest.changeDoor(car1, (int) (Math.random() * 100));
        System.out.println("Цвет первой машины: " + car1.getColor() + System.lineSeparator() + "Количество дверей первой машины: " + car1.getDoor() + System.lineSeparator() + "Цвет второй машины: " + car2.getColor());
    }
}
