public class Email {

    private String s1 = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
    private char c1;

    public void mail(String s1) {
        A: for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            if (c1 == '@') {
                for (++i; i < s1.length(); i++) {
                    c1 = s1.charAt(i);
                    if (c1 == '.') {
                        System.out.println();
                        continue A;
                    }
                    System.out.print(c1);
                    }
                }
            }
        }

    public static void main(String[] args) {
        Email email = new Email();
        email.mail(email.s1);
    }
}