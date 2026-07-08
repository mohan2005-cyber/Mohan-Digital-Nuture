public class PaymentContext{
    private Double amount;
    public PaymentContext(Double amount){
        this.amount = amount;
    }
    public void checkout(PaymentStrategy paymentstrategy){
        paymentstrategy.pay(this.amount);
    }
}