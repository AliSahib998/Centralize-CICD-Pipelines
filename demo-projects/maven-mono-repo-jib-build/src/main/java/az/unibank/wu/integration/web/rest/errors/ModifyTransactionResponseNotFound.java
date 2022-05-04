package az.unibank.wu.integration.web.rest.errors;

public class ModifyTransactionResponseNotFound extends RuntimeException{


    private static final long serialVersionUID = -3042686055658047285L;

    public ModifyTransactionResponseNotFound() {
        super("Modify transaction response not found");
    }

}
