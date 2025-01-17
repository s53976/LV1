import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {
    private ArrayList<Payment> payments = new ArrayList<>();

    public void add (Payment p) {
        payments.add(p);
    }

    public double totalTransactionCosts() {
        double sum = 0;
        for (Payment payment : payments) {
            sum += payment.calcTransactionCosts();
        }
        return sum;
    }

    public HashMap<String, Double> getPaymentsPerCurrency (){
        HashMap<String, Double> payment = new HashMap<>();

        for (Payment payment1 : payments) {
            String currency = payment1.getCurrency();
            payment.put(currency, payment.getOrDefault(currency,0.0)+1);
        }
        return payment;
    }

}
