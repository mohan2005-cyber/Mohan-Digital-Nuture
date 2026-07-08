import java.util.Scanner;

class Main{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Payment Mode:\n1)Credit card\t2)Paypal ");
        int option = scanner.nextInt();

        System.out.println("Enter Amount:");
        Double amount = scanner.nextDouble();

        PaymentContext cart = new PaymentContext(amount);

        switch (option){
            case 1:
                cart.checkout(new CreditCardPayment("xxxx-xxxx-xxxx-xxxx"));
                break;
            case 2:
                cart.checkout(new PayPalPayment("test_user@upi"));
                break;
        }
    }
}