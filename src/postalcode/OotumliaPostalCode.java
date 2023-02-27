package postalcode;

public class OotumliaPostalCode extends PostalCode {

    public OotumliaPostalCode(String code) throws PostalCodeException {
        super(code);
    }

    @Override
    protected void validate() throws PostalCodeException {
        String postCode = getCode();
        if ((postCode.length()== 0)
                || (!Character.isLetter(postCode.charAt(0)))
                || (!Character.isLetter(postCode.charAt(1)))
                || (!Character.isWhitespace(postCode.charAt(2)))
                || (!Character.isDigit(postCode.charAt(3)))
                || (!Character.isDigit(postCode.charAt(4)))
                || (postCode.length() > 5))
        {
            throwException("Sequence of characters not like AA 99");
        }
        else
        {
            setDestination("Ootumlia");
        }

    }

    @Override
    public String getCountry() {
        return "Ootumlia";
    }
}
