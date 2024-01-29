package List;

import java.util.List;

public class onList {
    public int conter;

    public void checkEven(IntList list) {
        conter = 0;
        IntNode p = list.getFirst();
        while (p != null) {
            conter++;
            p = p.getNext();
        }
        if (conter % 2 == 0) {
            removeMiddleEven(list);
        } else {
            removeMiddleOdd(list);
        }

    }

//    need to continue
    public void removeMiddleEven(IntList list) {
        IntNode p = list.getFirst();
        for (int i = 0; i < (conter/2)+1; i++) {
            p = p.getNext();
        }
        list.remove(p);
    }
    public void removeMiddleOdd(IntList list) {
        list.remove(list.getFirst());
        list.remove(list.getLast());
    }

}
