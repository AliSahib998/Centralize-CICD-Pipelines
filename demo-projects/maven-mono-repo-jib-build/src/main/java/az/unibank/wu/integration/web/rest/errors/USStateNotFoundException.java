package az.unibank.wu.integration.web.rest.errors;

public class USStateNotFoundException extends RuntimeException{

    private static final long serialVersionUID = -3042686055658047285L;

    public USStateNotFoundException(String lang) {
        super("US State not found with lang "+lang);
    }

}
