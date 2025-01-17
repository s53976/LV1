public class MaestroPayment extends Payment {
    private String cardNumber;

    public MaestroPayment(String cardNumber, double amount, String currency) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public double calcTransactionCosts() {
        double result = getAmount()*0.0075;
        if(result < 0.95) {
            return 0.95;
        } else
        return result;
    }

    @Override
    public String toString() {
        return "MaestroPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", amount='" + getAmount() + '\'' +
                ", currency='" + getCurrency() + '\'' +
                ", transactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
