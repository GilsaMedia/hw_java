package List;

public class IntList {
    private IntNode first;

    public IntList() {
        this.first = null;
    }

    public IntNode getFirst() {
        return first;
    }

    public IntNode instert(IntNode p, int info) {
        IntNode q = new IntNode(info);
        if (p.getNext() == null) {
            p.setNext(q);
            first = q;
        } else {
            q.setNext(p.getNext());
            p.setNext(q);
        }
        return q;
    }

    public IntNode remove(IntNode p) {
        if (p == first) {
            first = first.getNext();
            return first;
        } else {
            IntNode prev = first;
            while (prev.getNext() != p) {
                prev = prev.getNext();
            }
            prev.setNext(p.getNext());
            return prev.getNext();
        }
    }

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
