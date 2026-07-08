public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.getMessage("This is 1st logger message");
        logger2.getMessage("This is 2nd logger message");

        if(logger1 == logger2){
            System.out.println("Both logger are same");
            System.out.println(System.identityHashCode(logger1) + "=" + System.identityHashCode(logger2));
        }else System.out.println("Both logger are not same");


    }
}
