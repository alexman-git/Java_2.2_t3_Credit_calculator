public class CreditPaymentService {
    public double calculate(double creditSum, int years, double yearPercent) {
        int months = years * 12;
        double monthPercent = yearPercent / 12 / 100;
        double annuityFactor = (monthPercent * Math.pow(1 + monthPercent, months)) / (Math.pow(1 + monthPercent, months) - 1);
        double monthPayment = annuityFactor * creditSum;

        return (monthPayment);
    }
}
