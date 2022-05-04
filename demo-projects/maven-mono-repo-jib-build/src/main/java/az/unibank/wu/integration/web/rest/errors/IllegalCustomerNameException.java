package az.unibank.wu.integration.web.rest.errors;

public class IllegalCustomerNameException extends RuntimeException {

    private static final long serialVersionUID = -3042686055658047285L;

    public IllegalCustomerNameException() {
        super("Customer's first name or last name is illegal.");
    }
}
