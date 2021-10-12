public class Main {
    public static void main(String[] args) {
        CreditPaymentService service_1_year = new CreditPaymentService();
        double creditSum_1 = 1_000_000;
        int years_1 = 1;
        double yearPercent_1 = 9.99;
        double monthPayment_1 = service_1_year.calculate(creditSum_1, years_1, yearPercent_1);
        System.out.println(Math.round(monthPayment_1) + " ₽");

        CreditPaymentService service_2_years = new CreditPaymentService();
        double creditSum_2 = 1_000_000;
        int years_2 = 2;
        double yearPercent_2 = 9.99;
        double monthPayment_2 = service_2_years.calculate(creditSum_2, years_2, yearPercent_2);
        System.out.println(Math.round(monthPayment_2) + " ₽");

        CreditPaymentService service_3_years = new CreditPaymentService();
        double creditSum_3 = 1_000_000;
        int years_3 = 3;
        double yearPercent_3 = 9.99;
        double monthPayment_3 = service_3_years.calculate(creditSum_3, years_3, yearPercent_3);
        System.out.println(Math.round(monthPayment_3) + " ₽");
    }
}
