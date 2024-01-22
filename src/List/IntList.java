package List;

public class IntList {
    private IntNode first;

    public IntList() {
        this.first = null;
    }
    public IntNode getFirst() {
        return first;
    }
    public IntNode getLast() {
        if (first.getNext() == null) {
            return first;
        } else {
            IntNode next = first.getNext();
            while (next.getNext() != null) {
                next = next.getNext();
            }
            return next;
        }
    }

    public IntNode instert(IntNode p, int info) {
            IntNode q = new IntNode(info);
            if (p == null) {
                q.setNext(first);
                first = q;
            } else {
                q.setNext(p.getNext());
                p.setNext(q);
            }
            return q;
    }

    public IntNode add(int info) {
        return this.instert(this.getLast(),info);
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

    public String toStringList() {
        String listInfo = "";
        IntNode p = first;
        while (p.getNext() != null) {
            listInfo += p.toString();
            p = p.getNext();
        }
        return listInfo;
    }
}
