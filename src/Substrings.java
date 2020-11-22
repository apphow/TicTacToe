public class Substrings {

    public static void substrings(String values) {
        for (int i = 0; i < values.length(); i++) {
            for (int j = i + 1; j <= values.length(); j++) {
                System.out.println(values.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        substrings("Janitor");
    }
}

