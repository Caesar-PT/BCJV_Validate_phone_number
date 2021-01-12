public class PhoneNumberTest {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] validPhone = new String[] { "(84)-(0987654567)", "(84)-(0987856977)"};
    public static final String[] invalidPhone = new String[] { "M0318G", "P0323A"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();

        for (String c: validPhone) {
            boolean isvalid = phoneNumberExample.validate(c);
            System.out.println("Class is " + c +" is valid: "+ isvalid);
        }

        for (String c:invalidPhone) {
            boolean isvalid = phoneNumberExample.validate(c);
            System.out.println("Class is " + c +" is valid: "+ isvalid);
        }
    }
}
