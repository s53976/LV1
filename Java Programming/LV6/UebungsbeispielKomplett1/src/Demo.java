public class Demo {
    public static void main(String[] args) {

        PaymentJournal paymentJournal = new PaymentJournal();
        paymentJournal.add(new CreditCardPayment(1252.00, "USD", "Test", "89419651"));
        paymentJournal.add(new CashPayment(58852.23, "EUR"));
        paymentJournal.add(new MaestroPayment("4981961", 123, "SEK"));


        System.out.println("paymentJournal = " +  paymentJournal.totalTransactionCosts());
        System.out.println("paymentJournal = " + paymentJournal.getPaymentsPerCurrency());



    }
}
