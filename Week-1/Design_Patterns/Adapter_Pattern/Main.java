class Main{
    public static void main(String args[]){

        PaymentProcessor phonepay = new PhonepayAdapter(new PhonepayGateway());
        phonepay.paymentprocessor(4000);

        PaymentProcessor razorpay = new RazorpayAdapter(new RazorpayGateway());
        razorpay.paymentprocessor(2500);

        PaymentProcessor gpay = new GpayAdapter(new GpayGateway());
        gpay.paymentprocessor(1780);
    }
}