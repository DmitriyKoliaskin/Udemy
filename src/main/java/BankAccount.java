public class BankAccount {
    private double schet;

    public double popolnenieScheta(double popolnenie) {
        double result = 0;
        if (popolnenie > 0) {
            result = this.schet += popolnenie;
        }
        return result;
    }

    public double snyatieSoScheta(double snyatie) {
        double result = 0;
        if (snyatie > 0) {
            result = this.schet -= snyatie;
        }
        return result;
    }
}
