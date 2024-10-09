package Notes.OOPS.Properties.Polymorphism;

public class Numbers {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers ans = new Numbers();
         int ans1 = ans.sum(2, 3);
         int ans2 = ans.sum(2,3,4);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
