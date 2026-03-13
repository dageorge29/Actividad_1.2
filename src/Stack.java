import java.util.ArrayList;

public class Stack {
    //Implementación de pila dinámica usando ArrayList

    private final ArrayList<String> stacklist;

    public Stack() {
        this.stacklist = new ArrayList<>();
    }

    public void push(String value) {
        stacklist.add(value);
    }

    public String pop() {
        if (stacklist.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return "Cannot pop";
        } else {
            String value = stacklist.get(stacklist.size() - 1);
            stacklist.removeLast();
            return value;
        }
    }

    public String peek() {
        if (!stacklist.isEmpty()) {
            return stacklist.getLast();
        } else {
            System.out.println("Stack is empty. Cannot peek");
            return "Cannot peek";
        }
    }

    public boolean isEmpty() {
        return stacklist.isEmpty();
    }

    public int size() {
        return  stacklist.size();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = stacklist.size() - 1; i >= 0; i-- ) {
            sb.append(stacklist.get(i));
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("] <- cima");
        return sb.toString();
    }
}
