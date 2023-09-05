package List;

public class IntList {
    private IntNode first;

    public IntList() {
        this.first = null;
    }

    public IntNode getFirst() {
        return first;
    }

//    public IntNode instert(IntNode p, int info) {
//
//    }
//
//    public IntNode remove(IntNode p) {
//
//    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        return "IntList{" +
                "first=" + first +
                '}';
    }
}
