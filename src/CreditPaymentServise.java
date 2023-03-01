public class CreditPaymentServise {
    public double calculate(double a, int b) {
        double coefficient = ((a * (Math.pow((1 + a), b))) / ((Math.pow((1 + a), b)) - 1));

        return coefficient;
    }


}
