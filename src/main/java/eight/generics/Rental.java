package eight.generics;

import java.util.List;

public class Rental<T> {
    private List<T> elements;

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    public T rent() {
        if (null == this.elements || this.elements.isEmpty()) {
            System.out.println("No element present");
            return null;
        } else {
            return elements.get(elements.size() - 1);
        }
    }

    public void returnElement(T element) {
        this.elements.add(element);
    }


}
