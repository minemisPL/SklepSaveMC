public class RakPointerException extends Throwable {

    private final String errorName;

    public RakPointerException(String errorName){

        this.errorName = errorName;
    }

    public String getErrorName() {
        return errorName;
    }
}
