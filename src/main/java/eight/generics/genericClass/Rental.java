package eight.generics.genericClass;

import java.util.List;

public  abstract class Rental<T> {
    protected List<T> elements;

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    public abstract T rent();

    public void returnElement(T element) {
        this.elements.add(element);
    }


}
