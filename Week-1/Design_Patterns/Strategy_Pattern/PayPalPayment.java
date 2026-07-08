class PayPalPayment implements PaymentStrategy {
    private String upi_id;

    public PayPalPayment(String upi_id){
        this.upi_id=upi_id;
    }

    @Override
    public void pay(Double amount){
        System.out.println("Preocessed Payment of " + amount + "through Paypal.");
    }
}