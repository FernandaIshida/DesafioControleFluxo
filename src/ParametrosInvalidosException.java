public class ParametrosInvalidosException extends RuntimeException {

    private String message;
    public ParametrosInvalidosException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
