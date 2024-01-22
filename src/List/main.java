package List;

public class main {
    public static void main(String[] args) {

        IntList list1 = new IntList();
        list1.instert(null, 4576);
        IntNode first = list1.getFirst();
        list1.instert(first, 6754);
        list1.instert(list1.getLast(), 4675);
        list1.add(353);
        System.out.println(list1.toStringList());
    }
}
 