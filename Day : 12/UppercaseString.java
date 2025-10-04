public class UppercaseString {
    public static String toUpperCaseWords(String str) {
        if (str == null || str.length() == 0) {
            return str; // handle empty or null string
        }

        StringBuilder sb = new StringBuilder("");

        // Convert first character to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' '); // add space
                i++; 
                sb.append(Character.toUpperCase(str.charAt(i))); // capitalize next letter
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "hii, i am dheeraj singh";
        System.out.println(toUpperCaseWords(str));
    }
}
