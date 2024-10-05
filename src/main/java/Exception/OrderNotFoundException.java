package Exception;



public class OrderNotFoundException extends  RuntimeException{
    public OrderNotFoundException(String messages){
        super(messages);
    }
}
