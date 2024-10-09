package Practice.Recursion;

public class removeChar {
    public static void main(String[] args) {
        System.out.println(skip("akashdeep singla"));
        System.out.println(skipStr("i like apple mangoes and melons"));
    }

    static String skip(String up) {
        if(up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch+skip(up.substring(1));
        }
    }

    static String skipStr(String up) {
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("apple")) {
            return skipStr(up.substring(5));
        } else {
            return up.charAt(0)+skipStr(up.substring(1));
        }
    }
}
