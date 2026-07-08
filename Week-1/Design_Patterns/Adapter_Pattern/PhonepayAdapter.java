class PhonepayAdapter implements PaymentProcessor{
    public PhonepayGateway phonepay;

    public PhonepayAdapter(PhonepayGateway phonepay){
        this.phonepay = phonepay;
    }

    @Override
    public void paymentprocessor(double amount){
        phonepay.transaction(amount);
    }
}