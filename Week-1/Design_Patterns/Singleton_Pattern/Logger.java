public class Logger {
    private  static Logger logger;
    private Logger(){

    }
    public static Logger getInstance(){
        if(logger==null)
            logger = new Logger();
        return logger;
    }
    public void getMessage(String message){
        System.out.println(message);
    }
}
