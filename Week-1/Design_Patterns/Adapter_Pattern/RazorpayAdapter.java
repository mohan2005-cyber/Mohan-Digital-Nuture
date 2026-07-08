class RazorpayAdapter implements PaymentProcessor{
    public RazorpayGateway razorpay;

    public RazorpayAdapter(RazorpayGateway razorpay){
        this.razorpay = razorpay;
    }

    @Override
    public void paymentprocessor(double amount){
        razorpay.transaction(amount);
    }
}