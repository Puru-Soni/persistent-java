package WeakPassException;

public class UserBO {
    // Your code here
    static void validate(User u) throws WeakPasswordException {
        String pass = u.getPassword();

        if (pass.length() < 10 || pass.length() > 20)
            throw new WeakPasswordException("Your password is weak");

        int upper = 0, lower = 0, number = 0, special = 0;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }

        if (!(number > 0 && special > 0 && (lower + upper) > 0))
            throw new WeakPasswordException("Your password is weak");
    }
}
