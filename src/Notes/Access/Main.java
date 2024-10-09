package Notes.Access;

public class Main {
    public static void main(String[] args) {
        Access obj = new Access(25, "Akashdeep");
//        obj.num can't be accessed as num is private
        int res = obj.getNum(); // we are able to access the value of num as obj of that class is calling it
                                // a obj of that same class has access to it.
        System.out.println(res);
    }
}
