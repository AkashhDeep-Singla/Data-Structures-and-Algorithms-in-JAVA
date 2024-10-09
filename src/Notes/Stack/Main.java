package Notes.Stack;

public class Main {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        DynamicStack stack1 = new DynamicStack(5);

        stack.push(12);
        stack.push(7);
        stack.push(51);
        stack.push(43);
        stack.push(25);
        stack.push(86);

        stack1.push(12);
        stack1.push(7);
        stack1.push(51);
        stack1.push(43);
        stack1.push(25);
        stack1.push(86);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println();

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
    }
}
