package az.unibank.wu.integration.web.rest.errors;


public class InvalidPromocodeException  extends RuntimeException {

    private static final long serialVersionUID = -3042686055658047285L;

    private int errorCode = 417;

    public InvalidPromocodeException() {
        super("Promocode is invalid.");
    }

    public int getErrorCode() {
        return errorCode;
    }
}
