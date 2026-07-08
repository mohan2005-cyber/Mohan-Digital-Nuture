class CreditCardPayment implements PaymentStrategy{
    private String card_id;

    public CreditCardPayment(String card_id){
        this.card_id = card_id;
    }

    @Override
    public void pay(Double amount){
        System.out.println("Processed Payment of " + amount + " through CreditCard.");
    }
}