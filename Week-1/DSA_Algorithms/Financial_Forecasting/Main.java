class Main{

    public static double CalculateFutureValue(double amount,double intrest,int period){

        if(period <= 0) return amount;

        double newvalue = amount*(intrest+1);   //amount + amount*(intrest/100)
        return CalculateFutureValue(newvalue,intrest,period-1);
    }

    public static  void main(String args[]){
        //Compound intrest
        double amount = 2000;
        double intrest = 0.09;  //%9 annual growth
        int period = 5;     //in years

        double predicted_value =CalculateFutureValue(amount,intrest,period);
        System.out.println("The Predicted amount after " + period + " years is : " + predicted_value + ".");
    }
}