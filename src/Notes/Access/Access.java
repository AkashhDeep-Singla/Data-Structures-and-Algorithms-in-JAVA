package Notes.Access;

public class Access {
    private int num;  // private members can only be accessed in the same class
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Access(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
