import java.util.ArrayList;

public class Stack {
    private final ArrayList<String> stacklist;

    public Stack() {
        this.stacklist = new ArrayList<>();
    }

    public void push(String value) {
        stacklist.add(value);
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        } else {
            // El último elemento de la lista es la cima
            return stacklist.remove(stacklist.size() - 1);
        }
    }

    public void clear() {
        stacklist.clear();
    }

    public boolean isEmpty() {
        return stacklist.isEmpty();
    }

    public int size() {
        return stacklist.size();
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        // Imprimimos de 0 a N para que la cima esté a la derecha
        for (int i = 0; i < stacklist.size(); i++) {
            sb.append(stacklist.get(i));
            if (i < stacklist.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("] <- CIMA (PEEK)");
        return sb.toString();
    }
    // Método peek: Mira el elemento en la cima sin sacarlo
    public String peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stacklist.get(stacklist.size() - 1);
        }
    }
}