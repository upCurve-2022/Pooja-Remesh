public class locationException extends RuntimeException{
    public locationException(String message){
        super(message);
    }
    public locationException(){
        super("Delivery is not available in your area!");
    }
}
