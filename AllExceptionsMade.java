public class AllExceptionsMade {
    
    public static class EmptyOrderException extends Exception {
        public EmptyOrderException(String message) {
            super(message);
        }
    }
    

    public static class CartFullException extends Exception {
        public CartFullException(String message) {
            super(message);
        }
    }
    
    public static class PaymentException extends Exception {
        public PaymentException(String message) {
            super(message);
        }
    }
    
    public static class ProductNotFoundException extends Exception {
        public ProductNotFoundException(String message) {
            super(message);
        }
    }
    public static class CategorynotFound extends Exception {
    public CategorynotFound(String message)
    {
    super(message);
    }
    }
     
    


}
