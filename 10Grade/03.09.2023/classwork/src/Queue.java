public class Queue<T> {
    public Node<T> first;
    public Node<T> last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public void insert(T x) {
        Node<T> temp = new Node<T>(x);
        if (first == null)
            first = temp;
        else
            last.setNext(temp);
        last = temp;
    }

    public T remove() {
        T x = first.getValue();
        first = first.getNext();
        if (first == null)
            last = null;
        return x;
    }

    public T top() {
        return first.getValue();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String toString() {
        String temp = first.toString();
        return "head -> " + temp.substring(0, temp.length() - 4) + " end";
    }

    public Queue<T> getQcopy(Queue<T> q) {
        Queue<T> qe1 = new Queue<T>();
        Queue<T> qe2 = new Queue<T>();
        while (!q.isEmpty()) {
            T x = q.remove();
            qe1.insert(x);
            qe2.insert(x);
        }
        while (!qe1.isEmpty()) {
            T x = qe1.remove();
            q.insert(x);
        }
        return qe2;
    }

}