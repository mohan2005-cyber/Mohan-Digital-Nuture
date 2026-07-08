class GpayAdapter implements PaymentProcessor{
    public GpayGateway gpay;

    public GpayAdapter(GpayGateway gpay){
        this.gpay = gpay;
    }

    @Override
    public void paymentprocessor(double amount){
        gpay.transaction(amount);
    }
}