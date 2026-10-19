package dsaPrimer;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = sanitize(s);

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            ++i;
            --j;
        }

        return true;
    }

    private String sanitize(String s) {
        StringBuilder builder = new StringBuilder();
        for (char ch : s.toLowerCase().toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                builder.append(ch);
            }
        }

        return builder.toString();
    }
}
