import java.util.Collections;
import java.util.Iterator;

public class SuperList<T> extends ListManager {

    @Override //añade un elemento a final de la lista
    public void addElement(Object element) {
        list.add(element);
    }

    @Override
    public Object removeElement(int position) {
        Object elementRemove = list.remove(position-1);
        return elementRemove;
    }

    @Override
    public void showElements() {
        Iterator<T> it = list.iterator();

        while(it.hasNext()) {
            T value = it.next();
            System.out.println(value);
            System.out.println(" ");
        }
    }

    @Override
    public void showReversedElements() {
        Collections.reverse(list);
        System.out.println("Lista en orden inverso" + list);
    }
}
