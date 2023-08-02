package duplicateMobileNoException;
public class ContactBO {
    // your code here
    public static void validate(String mobile, String AlternateMobile) throws DuplicateNoException {
        // fill the code

        // if mobile number is same as alternateMobile number throw custom exception that is defined in the Throws statement
        if (mobile.equals(AlternateMobile))
            throw new DuplicateNoException("Mobile number and alternate mobile number are same");
    }
}
