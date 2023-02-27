
public class Main {
    public static void main(String[] args) {
        CreditPaymentServise service = new CreditPaymentServise();
        double rate = ((9.99 / 12) / 100);
        int pays = 12;
        int amount = 1_000_000;
        double bid = service.calculate(rate, pays);
        int payment = (int) (amount * bid);
        System.out.println(payment);
    }

}