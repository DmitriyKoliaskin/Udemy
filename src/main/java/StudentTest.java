public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Petrovich", (int)(Math.random() * 100), (int)(Math.random() * 5), (Math.random() * 10), (Math.random() * 10), (Math.random() * 10));
        Student student2 = new Student("Petr", "Ivanovich", (int)(Math.random() * 100), (int)(Math.random() * 5), (Math.random() * 10), (Math.random() * 10), (Math.random() * 10));
        Student student3 = new Student("Tolya", "Nikolaich", (int)(Math.random() * 100), (int)(Math.random() * 5), (Math.random() * 10), (Math.random() * 10), (Math.random() * 10));
        System.out.println(student1.getName() + " " + student1.getStudentTicket() + " " + student1.getSurName() + ": " + student1.averagePoint());
        System.out.println(student2.getName() + " " + student2.getStudentTicket() + " " + student2.getSurName() + ": " + student2.averagePoint());
        System.out.println(student3.getName() + " " + student3.getStudentTicket() + " " + student3.getSurName() + ": " + student3.averagePoint());
    }
}
