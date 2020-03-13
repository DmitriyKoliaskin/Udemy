public class EmployeeTest {
    public static void main(String[] args) {
        Employee em1 = new Employee(1, "Aeboy", 25, "Karasevo", Math.random() * 10000);
        Employee em2 = new Employee(2, "Kolobok", 5, "Karasevo", Math.random() * 10000);

        double newSalary1= em1.salaryX2();
        double newSalary2= em2.salaryX2();

        System.out.println(newSalary1);
        System.out.println(newSalary2);
    }
}
