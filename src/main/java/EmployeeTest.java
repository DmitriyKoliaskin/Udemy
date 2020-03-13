public class EmployeeTest {
    public static void main(String[] args) {
        Employee em1 = new Employee(1, "Aeboy", 25, "Karasevo", Math.random() * 10000);
        Employee em2 = new Employee(2, "Kolobok", 5, "Karasevo", Math.random() * 10000);

        em1.salaryX2();
        em2.salaryX2();

        System.out.println(em1.getSalary());
        System.out.println(em2.getSalary());
    }
}
