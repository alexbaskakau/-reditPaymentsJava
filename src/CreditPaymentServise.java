public class CreditPaymentServise {
    public double calculate(double rate, int pays) {
        double coefficient = ((rate * (Math.pow((1 + rate), pays))) / ((Math.pow((1 + rate), pays)) - 1));

        return coefficient;
    }


}
