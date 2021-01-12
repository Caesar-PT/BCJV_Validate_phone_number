import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_REGEX = "^[\\(]84[\\)]-[\\(][0]\\d{9}[\\)]$";

    public PhoneNumberExample(){
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}