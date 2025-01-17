import jdk.swing.interop.LightweightFrameWrapper;

import javax.swing.plaf.BorderUIResource;
import java.security.PrivateKey;

public class CreditCardPayment extends Payment{
    private String cardNumber;
    private String securityNumber;


    public CreditCardPayment(double amount, String currency, String cardNumber, String securityNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }


    @Override
    public double calcTransactionCosts() {
        double costs = 0;

        if (!"EUR".equals(getCurrency())) {
            // Fremdwährung
            costs = 1.5 + (getAmount() * 0.0275);
        } else {
            // Betrag in EUR
            costs = 0.5 + (getAmount() * 0.011);
        }
        return Math.round(costs * 100.0) / 100.0; //
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", securityNumber='" + securityNumber + '\'' +
                ", amount='" + getAmount() + '\'' +
                ", currency='" + getCurrency() + '\'' +
                ", transactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}


