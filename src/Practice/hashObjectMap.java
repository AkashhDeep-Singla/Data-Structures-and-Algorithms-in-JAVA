package Practice;

import java.util.HashMap;
import java.util.Map;

class Book {
    int ID, Qty;
    String Name, Author;
    Book(int ID, int Qty, String Name, String Author) {
        this.ID = ID;
        this.Qty = Qty;
        this.Name = Name;
        this.Author = Author;
    }
}

public class hashObjectMap {
    public static void main(String[] args) {
        Book b1 = new Book(101, 20, "Let us C", "Yashwant Kanetkar");
        Book b2 = new Book(102, 25, "Operating Systems", "Galvin");

        HashMap<Integer, Book> hm = new HashMap<Integer, Book>();
        hm.put(1, b1);
        hm.put(2, b2);

        for(Map.Entry<Integer, Book> temp : hm.entrySet()) {
            Integer i = temp.getKey();
            Book temp1 = temp.getValue();
            System.out.println("Key -> " + i);
            System.out.println("Value -> " + temp1.ID + " " + temp1.Qty + " " + temp1.Name + temp1.Author);
        }
        System.out.println();
        hm.forEach((k, v) -> System.out.println(" "+ v.ID + " " + v.Qty + " " + v.Name +" " + v.Author));
    }
}
