package az.unibank.wu.integration.service.enumeration;

public enum IdType {
    PASSPORT("A"),
    NATIONAL_IDENTIFICATION_CARD("B"),
    DRIVERS_LICENSE("C"),
    OTHER_GOVERNMENT_ISSUED("D"),
    OTHER("E");

    IdType(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
