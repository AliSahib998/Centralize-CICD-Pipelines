package az.unibank.wu.integration.web.rest.errors;

public class IsoCountryNotFound extends RuntimeException{


    private static final long serialVersionUID = -3042686055658047285L;

    public IsoCountryNotFound() {
        super("IsoCountry not found.");
    }

}
