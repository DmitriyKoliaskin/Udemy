public class StudentTest {

    public double averagePoint(Student student) {
        double point = (student.getAverageM() + student.getAverageE() + student.getAverageI()) / 3;
        System.out.println(student.getName() + " " + student.getStudentTicket() + " " + student.getSurName() + " " + point);
        return point;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Petrovich", (int)(Math.random() * 100), (int)(Math.random() * 5), (Math.random() * 10), (Math.random() * 10), (Math.random() * 10));
        Student student2 = new Student("Petr", "Ivanovich", (int)(Math.random() * 100), (int)(Math.random() * 5), (Math.random() * 10), (Math.random() * 10), (Math.random() * 10));
        Student student3 = new Student("Tolya", "Nikolaich", (int)(Math.random() * 100), (int)(Math.random() * 5), (Math.random() * 10), (Math.random() * 10), (Math.random() * 10));

        StudentTest sTest = new StudentTest();
        sTest.averagePoint(student1);
        sTest.averagePoint(student2);
        sTest.averagePoint(student3);

        Student student4 = new Student("Kolobok", "Kolobkov");
        Student student5 = new Student("Kolobok", "Kolobkov", (int)(Math.random() * 100));
    }
}
