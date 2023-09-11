package List;

public class IntNode {
    private int info;
    private IntNode next;

    public IntNode(int info) {
        this.info = info;
        this.next = null;
    }
    public IntNode(int info, IntNode next) {
        this.info = info;
        this.next = next;
    }

    public int getInfo() {
        return info;
    }

    public IntNode getNext() {
        return next;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "IntNode{" +
                "info=" + info +
                ", next=" + next +
                '}';
    }
}
