package Notes.Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(isFull()) {
            int[] temp = new int[data.length*2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        return super.push(item);
    }
}
